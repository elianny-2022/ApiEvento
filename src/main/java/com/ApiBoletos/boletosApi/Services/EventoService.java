package com.ApiBoletos.boletosApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiBoletos.boletosApi.Models.Evento;
import com.ApiBoletos.boletosApi.Repository.EventoRepository;

@Service
public class EventoService {
    
    @Autowired
    private EventoRepository eventoRepository;
    
    public List<Evento> listEvento(){
        return eventoRepository.findAll();
    }

    public void saveEvento(Evento evento){
        eventoRepository.save(evento);
    }

    public Evento findById(Long id){
        return eventoRepository.findById(id).get();
    }
    
    public void delete(Long id){
        eventoRepository.deleteById(id);
    }
}
