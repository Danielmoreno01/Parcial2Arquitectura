package com.example.Parcial2.repository;
import com.example.Parcial2.model.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {
    // Métodos personalizados si es necesario
}
