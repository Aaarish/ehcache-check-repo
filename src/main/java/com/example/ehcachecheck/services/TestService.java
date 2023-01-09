package com.example.ehcachecheck.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Cacheable(value = "helloCache", key = "#username")
    public String hello(String username) {
        try {
            Thread.sleep(4000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "Hello " + username;
    }
}
