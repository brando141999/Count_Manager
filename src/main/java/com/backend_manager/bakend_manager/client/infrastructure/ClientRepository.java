package com.backend_manager.bakend_manager.client.infrastructure;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend_manager.bakend_manager.client.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByemail(String email);

}