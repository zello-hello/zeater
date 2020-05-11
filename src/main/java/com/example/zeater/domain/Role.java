package com.example.zeater.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority { //enum - это перчисления
    USER;


    @Override
    public String getAuthority() {
        return name();
    }
}
