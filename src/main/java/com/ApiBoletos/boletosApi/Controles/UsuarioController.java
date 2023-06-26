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

import com.ApiBoletos.boletosApi.Models.Usuario;
import com.ApiBoletos.boletosApi.Services.UsuarioService;

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/list/usuario")
    public List<Usuario> listUsuario(){
        return usuarioService.listUsuario();
    }

    @GetMapping("/usuario/usuarios/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        try{
            Usuario usuario = usuarioService.findById(id);
            return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/usuario/save")
    public void saveUsuario(@RequestBody Usuario usuario){
        usuarioService.saveUsuario(usuario);
    }

    @PutMapping("/usuario/update/{id}")
    public ResponseEntity<Usuario> update (@RequestBody Usuario usuario, @PathVariable Long id){
        try {
            usuarioService.saveUsuario(usuario);
            return new ResponseEntity<Usuario>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/usuario/delete/{id}")
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
