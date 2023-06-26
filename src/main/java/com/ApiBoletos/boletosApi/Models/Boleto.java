package com.ApiBoletos.boletosApi.Models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Boletos")
public class Boleto {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long boletoId;
     private Double precio;
     private Date fecha;
     private Double cantidadBoletos;

     @OneToOne()
     private Evento evento;

     public Boleto(Double precio, Date fecha, Double cantidadBoletos, Evento evento){

        this.precio = precio;
        this.fecha = fecha;
        this.cantidadBoletos = cantidadBoletos;
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


     public void setPrecio(Double precio){
        this.precio = precio;
    }

    public Double getPrecio(){
        return precio;
    }

       public void setCantidadBoletos(Double cantidadBoletos){
        this.cantidadBoletos = cantidadBoletos;
    }

    public Double getCantidadBoletos(){
        return cantidadBoletos;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public Date getFecha(){
        return fecha;
    }
}
