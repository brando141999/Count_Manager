package com.backend_manager.bakend_manager.seller.infrastructure;

import com.backend_manager.bakend_manager.seller.domain.Seller;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    Optional<Seller> findByemail(String email);
}