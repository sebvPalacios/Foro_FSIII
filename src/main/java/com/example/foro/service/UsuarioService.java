package com.example.foro.service;

import com.example.foro.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    // Lista que obtiene los usuarios
    List<Usuario> getAllUsuarios();

    // Obtener los usuarios por id
    Optional<Usuario> getUsuarioById(Long id);

    // crear un usuario
    Usuario crearUsuario(Usuario usuario);

    // Actualizar usuario
    Usuario actualizarUsuario(Long id, Usuario usuario);
}
