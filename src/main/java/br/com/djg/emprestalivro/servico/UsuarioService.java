package br.com.djg.emprestalivro.servico;

import br.com.djg.emprestalivro.dominio.Usuario;
import br.com.djg.emprestalivro.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void salvaUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
