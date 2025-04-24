package com.example.Parcial2.controller;


import com.example.Parcial2.model.EstadisticaJugador;
import com.example.Parcial2.service.EstadisticaJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estadisticas")

    public class EstadisticaJugadorController {

    @Autowired
    private EstadisticaJugadorService estadisticasService;

    @PostMapping
    public EstadisticaJugador createEstadisticas(@RequestBody EstadisticaJugador estadisticas) {
        return estadisticasService.saveEstadisticas(estadisticas);
    }

    @GetMapping("/{id}")
    public EstadisticaJugador getEstadisticas(@PathVariable Long id) {
        return estadisticasService.getEstadisticasById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEstadisticas(@PathVariable Long id) {
        estadisticasService.deleteEstadisticas(id);
    }

}
