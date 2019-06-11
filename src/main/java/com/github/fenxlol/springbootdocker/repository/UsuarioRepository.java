package com.github.fenxlol.springbootdocker.repository;

import com.github.fenxlol.springbootdocker.domain.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
