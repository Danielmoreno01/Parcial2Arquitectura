package com.example.Parcial2.repository;

import com.example.Parcial2.model.EstadisticaJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadisticaJugadorRepository extends JpaRepository<EstadisticaJugador, Long> {
    // Métodos personalizados si es necesario
}
