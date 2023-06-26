package com.ApiBoletos.boletosApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiBoletos.boletosApi.Models.Silla;

public interface SillaRepository extends JpaRepository<Silla, Long>{
    
}
