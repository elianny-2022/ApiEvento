package com.ApiBoletos.boletosApi.Models;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Evento")
public class Evento {
    
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long eventoId;
     private String nombreEvento;
     private String tipoEvento;
     private Date fecha;
     private String ubicacion;
     private Double asientoDisponible;


     public Evento(String nombreEvento, String tipoEvento, 
     Date fecha, String ubicacion, Double asientoDisponible){

        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.fecha = fecha;
        this.asientoDisponible = asientoDisponible;
        this.ubicacion = ubicacion;
     }
     public Evento(){

     }
     public void setEventoId(Long eventoId){
        this.eventoId = eventoId;
    }

    public Long getEventoId(){
        return eventoId;
    }

     public void setNombreEvento(String nombreEvento){
        this.nombreEvento = nombreEvento;
    }

    public String getNombreEvento(){
        return nombreEvento;
    }

     public void setTipoEvento(String tipoEvento){
        this.tipoEvento = tipoEvento;
    }

    public String getTipoEvento(){
        return tipoEvento;
    }

     public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public Date getFecha(){
        return fecha;
    }

     public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public String getUbicacion(){
        return ubicacion;
    }

     public void setDisponibilidad(Double asientoDisponible){
        this.asientoDisponible = asientoDisponible;
    }

    public Double getDisponibilidad(){
        return asientoDisponible;
    }

  

}
