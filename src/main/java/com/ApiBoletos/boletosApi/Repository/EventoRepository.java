package com.ApiBoletos.boletosApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiBoletos.boletosApi.Models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
    
}
