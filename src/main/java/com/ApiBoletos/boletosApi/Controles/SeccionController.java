package com.ApiBoletos.boletosApi.Controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ApiBoletos.boletosApi.Models.Boleto;
import com.ApiBoletos.boletosApi.Models.Seccion;
import com.ApiBoletos.boletosApi.Services.BoletoService;
import com.ApiBoletos.boletosApi.Services.SeccionService;

@RestController
public class SeccionController {
    
     @Autowired
    SeccionService seccionService;

    @GetMapping("/listseccion/seccion")
    public List<Seccion> listSeccion(){
        return seccionService.listSeccion();
    }

    @GetMapping("/seccion/find/{id}")
    public ResponseEntity<Seccion> findById(@PathVariable Long id){
        try{
            Seccion seccion = seccionService.findById(id);
            return new ResponseEntity<Seccion>(seccion, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Seccion>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/seccion/save")
    public void saveSeccion(@RequestBody Seccion seccion){
        seccionService.saveSeccion(seccion);
    }

    @PutMapping("/seccion/update/{id}")
    public ResponseEntity<Seccion> update (@RequestBody Seccion seccion, @PathVariable Long id){
        try {
            seccionService.saveSeccion(seccion);
            return new ResponseEntity<Seccion>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/seccion/delete/{id}")
    public void delete(@PathVariable Long id){
        seccionService.delete(id);
    }
}
