package com.example.Parcial2.controller;
import com.example.Parcial2.model.Equipo;
import com.example.Parcial2.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @PostMapping
    public Equipo createEquipo(@RequestBody Equipo equipo) {
        return equipoService.saveEquipo(equipo);
    }

    @GetMapping("/{id}")
    public Equipo getEquipo(@PathVariable Long id) {
        return equipoService.getEquipoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipo(@PathVariable Long id) {
        equipoService.deleteEquipo(id);
    }

    // Otros métodos según sea necesario
}
