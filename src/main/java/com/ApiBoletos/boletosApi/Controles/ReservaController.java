package com.ApiBoletos.boletosApi.Controles;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ApiBoletos.boletosApi.Models.Boleto;
import com.ApiBoletos.boletosApi.Services.BoletoService;
import com.ApiBoletos.boletosApi.Services.ReservaService;

@RestController
@RequestMapping(path = "/api/reservas")
public class ReservaController {
    private  ReservaService reservaService;
    private BoletoService boletoService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @PostMapping("/{eventoId}")
    public ResponseEntity<List<Boleto>> crearReserva(@PathVariable Long eventoId,
     @RequestParam int cantidadBoletos, @RequestParam String asiento) {
        List<Boleto> boletosReservados = reservaService.crearReserva(eventoId, cantidadBoletos, asiento);
        return ResponseEntity.ok(boletosReservados);
    }

    @GetMapping("/{eventoId}/boletos")
    public ResponseEntity<List<Boleto>> obtenerBoletosPorEvento(@PathVariable Long eventoId) {
        List<Boleto> boletos = reservaService.obtenerBoletosPorEvento(eventoId);
        return ResponseEntity.ok(boletos);
    }
    /*  @GetMapping("/cantidad-boletos-disponibles")
    public int obtenerCantidadBoletosDisponibles(@RequestParam("tipoAsiento") String tipoAsiento) {
        return boletoService.obtenerCantidadBoletosDisponibles(tipoAsiento);
    } */
}

