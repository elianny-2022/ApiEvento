package com.ApiBoletos.boletosApi.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;

import com.ApiBoletos.boletosApi.Models.Boleto;
import com.ApiBoletos.boletosApi.Models.Evento;
import com.ApiBoletos.boletosApi.Repository.BoletoRepository;
import com.ApiBoletos.boletosApi.Repository.EventoRepository;

@Service
public class ReservaService {
    private final BoletoRepository boletoRepository;
    private final EventoRepository eventoRepository;

    public ReservaService(BoletoRepository boletoRepository, EventoRepository eventoRepository) {
        this.boletoRepository = boletoRepository;
        this.eventoRepository = eventoRepository;
    }

    public List<Boleto> crearReserva(Long eventoId, int cantidadBoletos, String asiento) {
        Evento evento = eventoRepository.findById(eventoId)
                .orElseThrow(() -> new NoSuchElementException("Evento no encontrado"));

      /*   int boletosDisponibles = boletoRepository.findBoletosDisponiblesByEvento(evento.getEventoId());
        

        if (cantidadBoletos > boletosDisponibles) {
            throw new IllegalArgumentException("No hay suficientes boletos disponibles");
        } */

        List<Boleto> boletosReservados = new ArrayList<>();

    // Obtener los boletos disponibles según el tipo de asiento
    //List<Boleto> listboletosDisponibles = boletoRepository.findByEventoAndAsientoAndDisponible(evento.getEventoId(), asiento);

    // Verificar si hay suficientes boletos disponibles
   /*  if (listboletosDisponibles.size() < cantidadBoletos) {
        throw new IllegalArgumentException("No hay suficientes boletos disponibles");
    }

    /* boletoRepository.reducirBoletos(eventoId, asiento, cantidadBoletos); 
    for (int i = 0; i < cantidadBoletos; i++) {
        Boleto boleto = listboletosDisponibles.get(i);
        boleto.setDisponible(false);
        boletoRepository.save(boleto);
        boletosReservados.add(boleto);
    } */

    return boletosReservados;
}


    public List<Boleto> obtenerBoletosPorEvento(Long eventoId) {
        Evento evento = eventoRepository.findById(eventoId)
                .orElseThrow(() -> new NoSuchElementException("Evento no encontrado"));

        return boletoRepository.findByEvento(evento);
    }
}

