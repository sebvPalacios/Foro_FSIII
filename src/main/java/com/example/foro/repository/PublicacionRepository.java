package com.example.foro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foro.model.Publicacion;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {

}
