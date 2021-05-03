package br.com.djg.emprestalivro.servico;

import br.com.djg.emprestalivro.dominio.Emprestimo;
import br.com.djg.emprestalivro.repositorio.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public void salvaEmprestimo (Emprestimo emprestimo) {
        if (validaDataDevolucao(emprestimo.getDataEmprestimo(), emprestimo.getDataDevolucao())) {
            emprestimoRepository.save(emprestimo);
        } else {
            throw new IllegalArgumentException("Data de devolução menor do que a de empréstimo");
        }
    }

    private Boolean validaDataDevolucao(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        if (dataDevolucao.isBefore(dataEmprestimo)) {
            return false;
        }
        return true;
    }
}
