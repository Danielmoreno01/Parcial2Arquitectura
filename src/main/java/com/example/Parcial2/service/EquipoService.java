package com.example.Parcial2.service;
import com.example.Parcial2.model.Equipo;
import com.example.Parcial2.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public Equipo saveEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public Equipo getEquipoById(Long id) {
        return equipoRepository.findById(id).orElse(null);
    }

    public void deleteEquipo(Long id) {
        equipoRepository.deleteById(id);
    }

    // Otros métodos según sea necesario
}
