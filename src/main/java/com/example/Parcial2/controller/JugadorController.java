package com.example.Parcial2.controller;

import com.example.Parcial2.model.Jugador;
import com.example.Parcial2.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/jugadores")
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    // 1. GET /api/jugadores/equipo/{equipoId}
    @GetMapping("/equipo/{equipoId}")
    public List<Jugador> getJugadoresByEquipo(@PathVariable Long equipoId) {
        return jugadorService.getJugadoresByEquipo(equipoId);
    }

    // 2. GET /api/jugadores/goles?minGoles=X
    @GetMapping("/goles")
    public List<Jugador> getJugadoresConMasDeGoles(@RequestParam int minGoles) {
        return jugadorService.getJugadoresConMasDeGoles(minGoles);
    }
}

