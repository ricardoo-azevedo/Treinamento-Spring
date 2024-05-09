package br.com.project.api.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.project.api.modelo.PessoaModel;



@RestController
public class Controle {

    //metodo para uma rota de requisição get
    @GetMapping("/boas-vindas")
    public String boasVindas() {
        return "Bem vindo!";
    }

    //mesma coisa com a de cima, porem utiliza uma chave para utlizar uma info da url para tratar como variavel.
    //@PathVariable = mapeia dados por parte da url e trata como paramatros, use o mesmo nome da info da url. 
    @GetMapping("/boas-vindas/{nome}")
    public String boasVindas(@PathVariable String nome) {
        return "Bem vindo "+nome+"!";
    }
    
    // metodo para uma rota com requisição post
    //@RequestBody: responsavel por obter dados de outras apis/frontend, geralmente vem em formato JSON com as caracteristicas do modelo
    @PostMapping("/pessoa")
    public PessoaModel postMethodName(@RequestBody PessoaModel pModel) {
        return pModel;
    }
    
}
    
   
