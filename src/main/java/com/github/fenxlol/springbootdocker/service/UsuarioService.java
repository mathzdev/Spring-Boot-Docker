package com.github.fenxlol.springbootdocker.service;

import com.github.fenxlol.springbootdocker.domain.Usuario;
import com.github.fenxlol.springbootdocker.repository.AgenciaRepository;
import com.github.fenxlol.springbootdocker.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Transactional(readOnly = true)
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario cadastrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> visualizar(String id) {
        return usuarioRepository.findById(id);
    }

    public Usuario atualizar(Usuario usuario, String id) {
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void deletar(String id) {
        usuarioRepository.deleteById(id);
    }

}
