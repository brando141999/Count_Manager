package com.backend_manager.bakend_manager.seller.domain;

import org.springframework.stereotype.Service;

@Service
public class SellerService {

    private final SellerRepository sellerRepository;

    public SellerService(SellerService sellerRepository) {
        this.sellerRepository = sellerRepository;
    }

}