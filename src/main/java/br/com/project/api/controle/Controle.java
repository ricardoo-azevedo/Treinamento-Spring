package br.com.project.api.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controle {


    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "Bem vindo!";
    }

    @GetMapping("/boas-vindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Bem vindo "+nome+"!";
    }
    

}
    
   
