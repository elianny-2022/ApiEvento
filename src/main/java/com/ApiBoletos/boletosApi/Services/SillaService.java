package com.ApiBoletos.boletosApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiBoletos.boletosApi.Models.Silla;
import com.ApiBoletos.boletosApi.Repository.SillaRepository;

@Service
public class SillaService {
     @Autowired
    private SillaRepository sillaRepository;
    
    public List<Silla> listSilla(){
        return sillaRepository.findAll();
    }

    public void saveSilla(Silla mesa){
        sillaRepository.save(mesa);
    }

    public Silla findById(Long id){
        return sillaRepository.findById(id).get();
    }
    
    public void delete(Long id){
        sillaRepository.deleteById(id);
    }
}
