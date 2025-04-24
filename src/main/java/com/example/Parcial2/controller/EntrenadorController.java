package com.example.Parcial2.controller;

import com.example.Parcial2.model.Entrenador;
import com.example.Parcial2.service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/entrenadores")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @PostMapping
    public Entrenador createEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.saveEntrenador(entrenador);
    }

    @GetMapping("/{id}")
    public Entrenador getEntrenador(@PathVariable Long id) {
        return entrenadorService.getEntrenadorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEntrenador(@PathVariable Long id) {
        entrenadorService.deleteEntrenador(id);
    }

}
