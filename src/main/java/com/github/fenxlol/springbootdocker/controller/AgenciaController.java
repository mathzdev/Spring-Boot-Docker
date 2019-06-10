package com.github.fenxlol.springbootdocker.controller;

import com.github.fenxlol.springbootdocker.domain.Agencia;
import com.github.fenxlol.springbootdocker.service.AgenciaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(value = "Agencia", description = "API CRUD de agencias")
@RequestMapping("/agencia")
public class AgenciaController {

    @Autowired
    AgenciaService agenciaService;

    @ApiOperation(value = "Listagem de todas as agencias")
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Agencia> listar() {
        return agenciaService.listar();
    }


    @ApiOperation(value = "Cadastrar uma agencia")
    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Agencia cadastrar(@RequestBody Agencia agencia) {
        return agenciaService.cadastrar(agencia);
    }

    @ApiOperation(value = "Visualizar uma agencia")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Optional<Agencia> visualizar(@PathVariable String id) {
        return agenciaService.visualizar(id);
    }

    @ApiOperation(value = "Atualizar uma agencia")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Agencia atualizar(@RequestBody Agencia agencia, @PathVariable String id) {
        return agenciaService.atualizar(agencia, id);
    }

    @ApiOperation(value = "Deletar uma agencia")
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deletar(@PathVariable String id) {
        agenciaService.deletar(id);
    }

}
