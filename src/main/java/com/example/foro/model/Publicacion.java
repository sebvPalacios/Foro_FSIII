package com.example.foro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "publicacion")
public class Publicacion {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Columnas
    @Column(name = "id")
    private Long id;

    @Column(name = "tema")
    private String tema;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "contenido")
    private String contenido;

    @Column(name = "fechaPublicacion")
    private String fechaPublicacion;

    // Getters
    public Long getId(){
        return id;
    }

    public String getTema(){
        return tema;
    }

    public String getTitulo(){
        return titulo;
    }
    
    public String getContenido(){
        return contenido;
    }

    public String getFechaPublicacion(){
        return fechaPublicacion;
    }
    
    // Setters
    public void setId(Long id){
        this.id = id;
    }

    public void setTema(String tema){
        this.tema = tema;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setContenido(String contenido){
        this.contenido = contenido;
    }

    public void setFechaPublicacion(String fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
}
