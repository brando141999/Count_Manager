package com.backend_manager.bakend_manager.seller.domain;

import java.util.ArrayList;
import java.util.List;

import com.backend_manager.bakend_manager.client.domain.Client;
import com.backend_manager.bakend_manager.users.domain.User;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Seller extends User {

    @OneToMany(mappedBy = "Seller", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Client> clients = new ArrayList<>();

}