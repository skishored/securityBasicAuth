package com.example.securityBasicAuth.Services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public String getName(){
        return "User has loggedIn";
    }
}
