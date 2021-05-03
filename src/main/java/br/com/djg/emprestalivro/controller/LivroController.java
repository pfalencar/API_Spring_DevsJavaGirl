package br.com.djg.emprestalivro.controller;

import br.com.djg.emprestalivro.dominio.Livro;
import br.com.djg.emprestalivro.servico.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping("/livro")
    public void salvaLivro(@RequestBody Livro livro){
        livroService.salvaLivro(livro);
    }
}
