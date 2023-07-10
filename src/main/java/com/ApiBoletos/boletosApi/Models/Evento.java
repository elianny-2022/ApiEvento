package com.ApiBoletos.boletosApi.Models;

import java.sql.Date;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Evento")
public class Evento { 
    
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long eventoId;
     private String nombreEvento;
     private String tipoEvento;
     private String descripcion;
     private Date fecha;
     private String hora;
     private String ubicacion;

     //Relacion con evento
     @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL, orphanRemoval = true)
     private List<Boleto> boletos = new ArrayList<>();
    
  

     public Evento(String nombreEvento, Date fecha, String ubicacion, String tipoEvento,
                     String descripcion, String hora ){

        this.nombreEvento = nombreEvento;
        this.descripcion = descripcion;
        this.tipoEvento = tipoEvento;
        this.fecha = fecha;
        this.hora = hora;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
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

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }
     public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public Date getFecha(){
        return fecha;
    }
     public void setHora(String hora){
        this.hora = hora;
    }

    public String getHora(){
        return hora;
    }

     public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public String getUbicacion(){
        return ubicacion;
    }

}
