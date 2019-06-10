package com.github.fenxlol.springbootdocker.repository;

import com.github.fenxlol.springbootdocker.domain.Agencia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgenciaRepository extends MongoRepository<Agencia, String> {

}
