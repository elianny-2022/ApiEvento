package com.ApiBoletos.boletosApi.Models;

import javax.persistence.*;

@Entity
@Table(name = "Seccion")
public class Seccion {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seccionId;
    private String nombre;
    private String capacidad;

    @OneToOne()
    private Evento evento;

    public Seccion(String nombre, String capacidad, Evento evento){
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.evento = evento;
    }

    public Seccion(){

    }

    public void setSeccioId(Long seccionId){
        this.seccionId = seccionId;
    }

    public Long getSeccionId(){
        return seccionId;
    }

     public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCapacidad(String capacidad){
        this.capacidad = capacidad;
    }

    public String getCapacidad(){
        return capacidad;
    }
    
}
