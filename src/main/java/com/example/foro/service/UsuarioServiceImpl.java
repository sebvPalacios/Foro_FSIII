package com.example.foro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foro.repository.UsuarioRepository;
import com.example.foro.model.Usuario;

import java.util.Optional;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    
    @Autowired 
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getUsuarioById(Long id){
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario crearUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario actualizarUsuario(Long id, Usuario usuario){
        if (usuarioRepository.existsById(id)) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        } else {
            return null;
        }
    }
}
