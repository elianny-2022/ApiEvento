package com.ApiBoletos.boletosApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiBoletos.boletosApi.Models.Boleto;

public interface BoletoRepository extends JpaRepository<Boleto, Long>{
    
}
