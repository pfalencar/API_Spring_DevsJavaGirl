package br.com.djg.emprestalivro.controller;

import br.com.djg.emprestalivro.dominio.Emprestimo;
import br.com.djg.emprestalivro.servico.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping("/emprestimo")
    public void salvaEmprestimo(@RequestBody Emprestimo emprestimo) {
        emprestimoService.salvaEmprestimo(emprestimo);
    }
}
