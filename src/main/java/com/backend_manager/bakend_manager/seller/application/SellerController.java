package com.backend_manager.bakend_manager.seller.application;

import com.backend_manager.bakend_manager.seller.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {

    @Autowired
    private SellerService sellerService;

}
