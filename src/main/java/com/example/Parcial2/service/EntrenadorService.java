package com.example.Parcial2.service;

import com.example.Parcial2.model.Entrenador;
import com.example.Parcial2.repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrenadorService {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public Entrenador saveEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    public Entrenador getEntrenadorById(Long id) {
        return entrenadorRepository.findById(id).orElse(null);
    }

    public void deleteEntrenador(Long id) {
        entrenadorRepository.deleteById(id);
    }

    // Otros métodos según sea necesario
}
