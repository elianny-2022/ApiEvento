package com.ApiBoletos.boletosApi.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiBoletos.boletosApi.Models.Seccion;
import com.ApiBoletos.boletosApi.Repository.SeccionRepository;

import java.util.List;

@Service
public class SeccionService {
    
    @Autowired
    private SeccionRepository seccionRepository;
    
    public List<Seccion> listSeccion(){
        return seccionRepository.findAll();
    }

    public void saveSeccion(Seccion seccion){
        seccionRepository.save(seccion);
    }

    public Seccion findById(Long id){
        return seccionRepository.findById(id).get();
    }
    
    public void delete(Long id){
        seccionRepository.deleteById(id);
    }
     
}
