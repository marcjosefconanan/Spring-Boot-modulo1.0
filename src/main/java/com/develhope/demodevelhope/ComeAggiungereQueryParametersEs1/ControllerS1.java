package com.develhope.demodevelhope.ComeAggiungereQueryParametersEs1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ES1")
public class ControllerS1 {
    @GetMapping ("/NomeAcaso")
    public String metodo (@RequestParam String nome, @RequestParam String provincia){
        return "ciao " + nome + ", come il tempo in " + provincia;
    }
}
