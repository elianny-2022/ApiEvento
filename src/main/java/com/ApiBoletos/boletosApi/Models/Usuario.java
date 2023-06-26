package com.ApiBoletos.boletosApi.Models;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;
    private String nombre;
    private String direccion;
    private String correo;
    private String contraseña;
    private String historial;

    public Usuario(String nombre, String direccion, String correo, String contraseña, String historial){

        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.historial = historial;
    }

    public Usuario(){

    }

    public void setUsuarioId(Long usuarioId){
        this.usuarioId = usuarioId;
    }

    public Long getUsuarioId(){
        return usuarioId;
    }

     public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

     public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getDireccion(){
        return direccion;
    }

     public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getCorreo(){
        return correo;
    }

     public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public String getContraseña(){
        return contraseña;
    }

     public void setHistorial(String historial){
        this.historial = historial;
    }

    public String getHistorial(){
        return historial;
    }
}
