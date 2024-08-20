package com.backend_manager.bakend_manager.users.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity // Marca esta clase como una entidad JPA
@Table(name = "seller") // Especifica que esta entidad se mapea a la tabla "seller"
@Data // Genera automáticamente getters, setters, toString, equals, hashCode, etc.
public class User implements UserDetails {
    @Id // Marca esta columna como la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Genera automáticamente un valor único para esta columna
    private Long id;

    @Column(name = "username", nullable = false) // Marca esta columna como única
    private String username;

    @Column(name = "password", nullable = false) // Marca esta columna como única
    private String password;

    @Column(name = "email", nullable = false) // Marca esta columna como única
    private String email;

    @Column(name = "name", nullable = false) // Marca esta columna como única
    private String name;

    @Column(name = "lastname", nullable = false) // Marca esta columna como única
    private String lastname;

    @Column(name = "phone", nullable = false) // Marca esta columna como única
    private String phone;

    @Column(name = "Role", nullable = false) // Marca esta columna como única
    private Role role;

    @Transient
    private String rolePrefix = "ROLE_";

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(rolePrefix + role.name()));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}