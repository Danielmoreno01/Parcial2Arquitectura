package com.example.Parcial2.controller;

import com.example.Parcial2.model.Partido;
import com.example.Parcial2.service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partidos")
public class PartidoController {

    @Autowired
    private PartidoService partidoService;
    // 3. GET /api/partidos/goles/{equipoId}
    @GetMapping("/goles/{equipoId}")
    public Integer getTotalGolesByEquipo(@PathVariable Long equipoId) {
        return partidoService.getTotalGolesByEquipo(equipoId);
    }

    // 4. GET /api/partidos/resultados
    @GetMapping("/resultados")
    public List<Object[]> getResultadosConNombres() {
        return partidoService.getResultadosConNombres();
    }
}

