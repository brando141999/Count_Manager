package com.backend_manager.bakend_manager.users.domain;

import com.backend_manager.bakend_manager.client.infrastructure.ClientRepository;
import com.backend_manager.bakend_manager.seller.infrastructure.SellerRepository;
import com.backend_manager.bakend_manager.users.infrastructure.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository<User> userRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ClientRepository clientRepository;

    public User findByemail(String email, String role) {
        User user;

        if (role.equals("Role_Seller")) {
            user = sellerRepository.findByemail(email).orElseThrow(() -> new RuntimeException("User not found"));
        } else {
            user = clientRepository.findByemail(email).orElseThrow(() -> new RuntimeException("User not found"));
        }

        return user;
    }

    @Bean(name = "userDetailsService")
    public UserDetailsService userDetailsService() {
        return username -> {
            User user = userRepository
                    .findByemail(username)
                    .orElseThrow(() -> new RuntimeException("User not found"));

            return (UserDetails) user;
        };
    }
}
