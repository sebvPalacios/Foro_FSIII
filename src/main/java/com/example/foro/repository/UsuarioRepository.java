package com.example.foro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foro.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
