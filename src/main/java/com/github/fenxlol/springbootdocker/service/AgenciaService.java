package com.github.fenxlol.springbootdocker.service;

import com.github.fenxlol.springbootdocker.domain.Agencia;
import com.github.fenxlol.springbootdocker.repository.AgenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AgenciaService {

    @Autowired
    AgenciaRepository agenciaRepository;

    @Transactional(readOnly = true)
    public List<Agencia> listar() {
        return agenciaRepository.findAll();
    }

    public Agencia cadastrar(Agencia agencia) {
        return agenciaRepository.save(agencia);
    }

    public Optional<Agencia> visualizar(String id) {
        return agenciaRepository.findById(id);
    }

    public Agencia atualizar(Agencia agencia, String id) {
        agencia.setId(id);
        return agenciaRepository.save(agencia);
    }

    public void deletar(String id) {
        agenciaRepository.deleteById(id);
    }

}
