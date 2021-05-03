package br.com.djg.emprestalivro.servico;

import br.com.djg.emprestalivro.dominio.Livro;
import br.com.djg.emprestalivro.repositorio.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public void salvaLivro(Livro livro) {
        livroRepository.save(livro);
    }
}
