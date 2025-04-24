package com.example.Parcial2.service;

import com.example.Parcial2.model.EstadisticaJugador;
import com.example.Parcial2.repository.EstadisticaJugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadisticaJugadorService {

    @Autowired
    private EstadisticaJugadorRepository estadisticasRepository;

    public EstadisticaJugador saveEstadisticas(EstadisticaJugador estadisticas) {
        return estadisticasRepository.save(estadisticas);
    }

    public EstadisticaJugador getEstadisticasById(Long id) {
        return estadisticasRepository.findById(id).orElse(null);
    }

    public void deleteEstadisticas(Long id) {
        estadisticasRepository.deleteById(id);
    }

    // Otros métodos según sea necesario
}
