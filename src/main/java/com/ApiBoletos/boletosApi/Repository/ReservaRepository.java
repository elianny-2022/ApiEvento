package com.ApiBoletos.boletosApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiBoletos.boletosApi.Models.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
}
