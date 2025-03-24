package com.example.foro.service;

import java.util.List;
import java.util.Optional;

import com.example.foro.model.Publicacion;

public interface PublicacionService {
    
    // Lista que obtiene los usuarios
    List<Publicacion> getAllPublicaciones();

    // Obtener los usuarios por id
    Optional<Publicacion> getPublicacionById(Long id);

    // crear un usuario
    Publicacion crearPublicacion(Publicacion publicacion);

    // Actualizar usuario
    Publicacion actualizarPublicacion(Long id, Publicacion publicacion);

    // Eliminar un usuario
    void eliminarPublicacion(Long id);
    

}
