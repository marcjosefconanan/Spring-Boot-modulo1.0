package com.develhope.demodevelhope.ControllerConGETePOSTEs3;

import org.springframework.stereotype.Service;

@Service
public class ServiceEs3 {
    public String nomeAlContrario(String nome) {
        return new StringBuilder(nome).reverse().toString();
    }
}
