package com.backend_manager.bakend_manager.client.domain;

import java.util.List;

import com.backend_manager.bakend_manager.seller.domain.Seller;
import com.backend_manager.bakend_manager.users.domain.User;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Client extends User {

    @ManyToOne
    private List<Seller> seller;
}
