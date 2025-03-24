package com.example.foro.controller;

import java.util.List;
import java.util.Optional;
import com.example.foro.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.foro.model.Publicacion;
import com.example.foro.service.PublicacionService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/publicaciones")
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @GetMapping
    public List<Publicacion> getAllPublicaciones() {
        return publicacionService.getAllPublicaciones();
    }
    
    @GetMapping("/{id}")
    public Optional<Publicacion> getPublicacionById(@PathVariable Long id) {
        return publicacionService.getPublicacionById(id);
    }
    
    @PostMapping
    public Publicacion crearPublicacion(@RequestBody Publicacion publicacion) {
        return publicacionService.crearPublicacion(publicacion);
    }

    @PutMapping("/{id}")
    public Publicacion actualizarPublicacion(@PathVariable Long id, @RequestBody Publicacion publicacion) {
        return publicacionService.actualizarPublicacion(id, publicacion);
    }    

    @DeleteMapping("/{id}")
    public void eliminarPublicacion(@PathVariable Long id){
        publicacionService.eliminarPublicacion(id);
    }
    
}
