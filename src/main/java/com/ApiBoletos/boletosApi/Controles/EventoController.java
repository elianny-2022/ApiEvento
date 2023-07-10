package com.ApiBoletos.boletosApi.Controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiBoletos.boletosApi.Models.Evento;
import com.ApiBoletos.boletosApi.Services.EventoService;

@CrossOrigin(origins = "http://localhost:5045/", maxAge = 3600)
@RestController
@RequestMapping(path = "eventos")
public class EventoController {
    
     @Autowired
    EventoService eventoService;

    @GetMapping("/evento/list")
    public List<Evento> listEvento(){
        return eventoService.listEvento();
    }

    @GetMapping("/eventos/find/{id}")
    public ResponseEntity<Evento> findById(@PathVariable Long id){
        try{
            Evento evento = eventoService.findById(id);
            return new ResponseEntity<Evento>(evento, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Evento>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/evento/save")
    public void saveEvento(@RequestBody Evento evento){
        eventoService.saveEvento(evento);
    }

    @PutMapping("/evento/update/{id}")
    public ResponseEntity<Evento> update (@RequestBody Evento evento, @PathVariable Long id){
        try {

            eventoService.saveEvento(evento);
            return new ResponseEntity<Evento>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
     


    @DeleteMapping("/evento/delete/{id}")
    public void delete(@PathVariable Long id){
        eventoService.delete(id);
    }
}
