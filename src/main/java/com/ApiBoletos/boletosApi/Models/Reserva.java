package com.ApiBoletos.boletosApi.Models;

import javax.persistence.*;

@Entity
@Table(name = "Reserva")
public class Reserva {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long reservaId;
     private Long boletoId;
     private Long eventoId;


    
     private Reserva(){

     }

    public void setReservaId(Long reservaId){
        this.reservaId = reservaId;
    }

    public Long getReservaId(){
        return reservaId;
    }

     public void setBoletoId(Long boletoId){
        this.boletoId = boletoId;
    }

    public Long getBoletoId(){
        return boletoId;
    }
     public void seteventoId(Long eventoId){
        this.eventoId = eventoId;
    }

    public Long getEventoId(){
        return eventoId;
    }
}
