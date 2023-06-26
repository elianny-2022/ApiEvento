package com.ApiBoletos.boletosApi.Models;


import javax.persistence.*;

@Entity
@Table(name = "Sillas")
public class Silla {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long sillaId;
     private Double numero;

    @OneToOne()
    private Evento evento;

    public Silla(Double numero, Evento evento){
        this.numero = numero;
        this.evento = evento;


    }
    public Silla(){

    }
     public void setSillaId(Long sillaId){
        this.sillaId = sillaId;
    }

    public Long getSillaId(){
        return sillaId;
    }

   

     public void setNumero(Double Numero){
        this.numero = numero;
    }

    public Double getNumero(){
        return numero;
    }

   
}
