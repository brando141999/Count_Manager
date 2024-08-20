package com.backend_manager.bakend_manager.seller.domain;

import org.springframework.stereotype.Service;

import com.backend_manager.bakend_manager.seller.infrastructure.SellerRepository;

@Service
public class SellerService {

    private final SellerRepository sellerRepository;

    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

}