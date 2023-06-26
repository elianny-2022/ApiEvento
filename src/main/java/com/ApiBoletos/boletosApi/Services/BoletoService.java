package com.ApiBoletos.boletosApi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiBoletos.boletosApi.Models.Boleto;
import com.ApiBoletos.boletosApi.Repository.BoletoRepository;


@Service
public class BoletoService {
    
    @Autowired
    private BoletoRepository boletoRepository;
    
    public List<Boleto> listBoleto(){
        return boletoRepository.findAll();
    }

    public void saveBoleto(Boleto boleto){
        boletoRepository.save(boleto);
    }

    public Boleto findById(Long id){
        return boletoRepository.findById(id).get();
    }
    
    public void delete(Long id){
        boletoRepository.deleteById(id);
    }
}
