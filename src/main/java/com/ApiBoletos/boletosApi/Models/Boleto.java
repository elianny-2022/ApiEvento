package com.ApiBoletos.boletosApi.Models;

import javax.persistence.*;

@Entity
@Table(name = "Boletos")
public class Boleto {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long boletoId;
     private Double cantidadBoletos;
     private Double precio;
     private String asiento;
   
     //Relacion con eventos
     @ManyToOne
     @JoinColumn(name = "evento_Id")
     private Evento evento;

     
     public Boleto(Double cantidadBoletos, Double precio){
            this.cantidadBoletos = cantidadBoletos;
            this.precio = precio;
     }
        public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

     public Boleto(){

     }

       public void setBoletoId(Long boletoId){
        this.boletoId = boletoId;
    }

    public Long getBoletoId(){
        return boletoId;
    }

      public void setCantidadBoletos(Double cantidadBoletos){
        this.cantidadBoletos = cantidadBoletos;
    }

    public Double getCantidadBoletos(){
        return cantidadBoletos;
    }
     public void setAsientoTipo(String asiento){
        this.asiento = asiento;
    }

    public String getAsiento(){
        return asiento;
    }

      public void setPrecio(Double precio){
        this.precio = precio;
    }

    public Double getPrecio(){
        return precio;
    }
    

}
