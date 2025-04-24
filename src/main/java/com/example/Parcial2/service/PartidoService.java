package com.example.Parcial2.service;

import com.example.Parcial2.model.Partido;
import com.example.Parcial2.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {

    @Autowired
    private PartidoRepository partidoRepository;

    public Partido savePartido(Partido partido) {
        return partidoRepository.save(partido);
    }

    public Partido getPartidoById(Long id) {
        return partidoRepository.findById(id).orElse(null);
    }

    public void deletePartido(Long id) {
        partidoRepository.deleteById(id);
    }
    /**
     * 3. Obtener el número total de goles marcados por un equipo en todos sus partidos
     */
    public Integer getTotalGolesByEquipo(Long equipoId) {
        // Llama al método nativo en el repository
        Integer total = partidoRepository.findTotalGolesByEquipo(equipoId);
        // Por si acaso devuelve null (sin partidos), lo normalizamos a 0
        return (total != null) ? total : 0;
    }

    /**
     * 4. Obtener los resultados de todos los partidos indicando los nombres de los equipos
     */
    public List<Object[]> getResultadosConNombres() {
        // Llama al método nativo en el repository
        return partidoRepository.findResultadosConNombres();
    }
}
