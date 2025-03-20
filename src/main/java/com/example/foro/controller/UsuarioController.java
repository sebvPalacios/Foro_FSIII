package com.example.foro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foro.service.UsuarioService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.foro.model.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


// Controlador para visualizar desde el navegador

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> getUsuarioById(@PathVariable Long id) {
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {        
        return usuarioService.crearUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.actualizarUsuario(id, usuario);
    }
}


