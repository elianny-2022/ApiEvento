package com.ApiBoletos.boletosApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiBoletos.boletosApi.Models.Seccion;

public interface SeccionRepository extends JpaRepository<Seccion, Long>{
    
}
