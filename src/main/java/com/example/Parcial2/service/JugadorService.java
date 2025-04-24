package com.example.Parcial2.service;

import com.example.Parcial2.model.Jugador;
import com.example.Parcial2.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public Jugador saveJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public Jugador getJugadorById(Long id) {
        return jugadorRepository.findById(id).orElse(null);
    }

    public void deleteJugador(Long id) {
        jugadorRepository.deleteById(id);
    }

    /**
     * 1. Obtener todos los jugadores de un equipo específico
     */
    public List<Jugador> getJugadoresByEquipo(Long equipoId) {
        return jugadorRepository.findJugadoresByEquipo(equipoId);
    }

    /**
     * 2. Obtener los jugadores que han marcado más de X goles
     */
    public List<Jugador> getJugadoresConMasDeGoles(int minGoles) {
        return jugadorRepository.findJugadoresConMasDeGoles(minGoles);
    }


    // Otros métodos según sea necesario
}
