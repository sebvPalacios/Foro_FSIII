package com.example.foro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foro.repository.PublicacionRepository;
import com.example.foro.model.Publicacion;

@Service
public class PublicacionServiceImpl implements PublicacionService {
    
    @Autowired
    private PublicacionRepository publicacionRepository;
    
    @Override
    public List<Publicacion> getAllPublicaciones(){
        return publicacionRepository.findAll();
    }

    @Override
    public Optional<Publicacion> getPublicacionById(Long id){
        return publicacionRepository.findById(id);
    }

    @Override
    public Publicacion crearPublicacion(Publicacion publicacion){
        return publicacionRepository.save(publicacion);
    }

    @Override 
    public Publicacion actualizarPublicacion(Long id, Publicacion publicacion){
        if (publicacionRepository.existsById(id)) {
            publicacion.setId(id);
            return publicacionRepository.save(publicacion);
        } else {
            return null;
        }
    }
    
    @Override
    public void eliminarPublicacion(Long id){
        publicacionRepository.deleteById(id);
    }
}
