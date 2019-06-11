package com.github.fenxlol.springbootdocker.controller;

import com.github.fenxlol.springbootdocker.domain.Usuario;
import com.github.fenxlol.springbootdocker.service.UsuarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(value = "Usuario", description = "API CRUD de usuarios")
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @ApiOperation(value = "Listagem de todos os usuarios")
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Usuario> listar() {
        return usuarioService.listar();
    }

    @ApiOperation(value = "Cadastrar um usuario")
    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return usuarioService.cadastrar(usuario);
    }

    @ApiOperation(value = "Visualizar um usuario")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Optional<Usuario> visualizar(@PathVariable String id) {
        return usuarioService.visualizar(id);
    }

    @ApiOperation(value = "Atualizar um usuario")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Usuario atualizar(@RequestBody Usuario usuario, @PathVariable String id) {
        return usuarioService.atualizar(usuario, id);
    }

    @ApiOperation(value = "Deletar um usuario")
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deletar(@PathVariable String id) {
        usuarioService.deletar(id);
    }

}
