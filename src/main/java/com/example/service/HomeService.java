package com.example.service;

import java.util.Objects;

public class HomeService {
    public boolean validateKey(String key) {
        return Objects.equals(key, "right");
    }

    public String generateKey() {
        return "generated key";
    }
}
