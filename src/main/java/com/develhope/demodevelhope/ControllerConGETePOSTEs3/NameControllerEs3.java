package com.develhope.demodevelhope.ControllerConGETePOSTEs3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es3")
public class NameControllerEs3 {
    @Autowired
    public ServiceEs3 nomeService;

    @GetMapping("/nome")
    public String nome(@RequestParam String nome) {
        return nome;
    }

    @PostMapping("/reverse")
    public String nomeReverse(@RequestParam String nome) {
        return nomeService.nomeAlContrario(nome);
    }
}