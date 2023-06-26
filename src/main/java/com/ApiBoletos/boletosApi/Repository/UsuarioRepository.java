package com.ApiBoletos.boletosApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiBoletos.boletosApi.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
