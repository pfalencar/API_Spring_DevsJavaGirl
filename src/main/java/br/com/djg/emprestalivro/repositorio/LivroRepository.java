package br.com.djg.emprestalivro.repositorio;

import br.com.djg.emprestalivro.dominio.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
