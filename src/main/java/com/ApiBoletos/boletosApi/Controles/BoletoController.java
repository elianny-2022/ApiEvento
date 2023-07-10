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

import com.ApiBoletos.boletosApi.Models.Boleto;
import com.ApiBoletos.boletosApi.Services.BoletoService;

@CrossOrigin(origins = "http://localhost:5045/", maxAge = 3600)
@RestController
@RequestMapping(path = "boletos")
public class BoletoController {
    
     @Autowired
    BoletoService boletoService;

    @GetMapping("/listboleto/boleto")
    public List<Boleto> listBoleto(){
        return boletoService.listBoleto();
    }

    @GetMapping("/boleto/find/{id}")
    public ResponseEntity<Boleto> findById(@PathVariable Long id){
        try{
            Boleto boleto = boletoService.findById(id);
            return new ResponseEntity<Boleto>(boleto, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Boleto>(HttpStatus.NOT_FOUND);
        }
    }
     

    @PostMapping("/boleto/save")
    public void saveBoleto(@RequestBody Boleto boleto){
        boletoService.saveBoleto(boleto);
    }

    @PutMapping("/boleto/update/{id}")
    public ResponseEntity<Boleto> update (@RequestBody Boleto boleto, @PathVariable Long id){
        try {
            boletoService.saveBoleto(boleto);
            return new ResponseEntity<Boleto>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/boleto/delete/{id}")
    public void delete(@PathVariable Long id){
        boletoService.delete(id);
    }
}
