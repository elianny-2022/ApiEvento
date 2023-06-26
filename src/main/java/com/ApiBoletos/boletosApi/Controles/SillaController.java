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

import com.ApiBoletos.boletosApi.Models.Silla;
import com.ApiBoletos.boletosApi.Services.SillaService;

@RestController
public class SillaController {
    
     @Autowired
    SillaService sillaService;

    @GetMapping("/silla/list")
    public List<Silla> listSillas(){
        return sillaService.listSilla();
    }

    @GetMapping("/sillas/find/{id}")
    public ResponseEntity<Silla> findById(@PathVariable Long id){
        try{
            Silla silla = sillaService.findById(id);
            return new ResponseEntity<Silla>(silla, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Silla>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/silla/save")
    public void saveSilla(@RequestBody Silla silla){
        sillaService.saveSilla(silla);
    }

    @PutMapping("/silla/update/{id}")
    public ResponseEntity<Silla> update (@RequestBody Silla silla, @PathVariable Long id){
        try {
            Silla silla2 = sillaService.findById(id);
            sillaService.saveSilla(silla);
            return new ResponseEntity<Silla>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/silla/delete/{id}")
    public void delete(@PathVariable Long id){
        sillaService.delete(id);
    }
}
