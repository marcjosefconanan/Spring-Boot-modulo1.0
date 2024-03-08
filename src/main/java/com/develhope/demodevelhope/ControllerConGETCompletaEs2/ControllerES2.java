package com.develhope.demodevelhope.ControllerConGETCompletaEs2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("ES2")

public class ControllerES2 {
    @GetMapping ("/ciao/{provincia}")
    public UtenteES2 metodoEs2(@RequestParam String nome, @PathVariable String provincia){
        String saluto = "ciao " + nome + ", come il tempo in " + provincia;
        return new UtenteES2(nome,provincia,saluto);
    }

}
