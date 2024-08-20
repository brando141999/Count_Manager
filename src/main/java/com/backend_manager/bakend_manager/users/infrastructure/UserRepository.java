package com.backend_manager.bakend_manager.users.infrastructure;

import com.backend_manager.bakend_manager.users.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository<T extends User> extends JpaRepository<T, Long> {
    Optional<T> findByemail(String email);
}