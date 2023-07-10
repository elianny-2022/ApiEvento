package com.ApiBoletos.boletosApi.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ApiBoletos.boletosApi.Models.Boleto;
import com.ApiBoletos.boletosApi.Models.Evento;

public interface BoletoRepository extends JpaRepository<Boleto, Long>{

     List<Boleto> findByEvento(Evento evento);

   /*   @Query("SELECT SUM(cantidad_boletos) FROM Boletos WHERE evento_id = :id")
    int findBoletosDisponiblesByEvento(@Param("id") Long id);
    
     @Query("SELECT SUM(b.cantidadBoletos) FROM Boleto b WHERE b.asiento = :asiento")
    int obtenerCantidadBoletosDisponiblesPorAsiento(@Param("asiento") String asiento);

      @Query("UPDATE Boletos AS b SET b.cantidad_boletos = b.cantidad_boletos - :cantidad\r\n" + //
            "WHERE b.evento_id = :eventoId AND b.asiento = :asiento" )
    Boleto reducirBoletos(@Param("eventoId") Long eventoId, @Param("asiento") String asiento, @Param("cantidad") int cantidad);

     @Query("SELECT * FROM Boletos b WHERE b.evento_id = :evento AND b.asiento = :asiento ")
    List<Boleto> findByEventoAndAsientoAndDisponible(@Param("evento") Long evento, @Param("asiento") String asiento); */
    
}
