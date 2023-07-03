package com.ApiBoletos.boletosApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ApiBoletos.boletosApi.Models.Usuario;
import com.ApiBoletos.boletosApi.Repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    
    public List<Usuario> listUsuario(){
        return usuarioRepository.findAll();
    }

    public void saveUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Usuario findById(Long id){
        return usuarioRepository.findById(id).get();
    }
    
    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }
}
