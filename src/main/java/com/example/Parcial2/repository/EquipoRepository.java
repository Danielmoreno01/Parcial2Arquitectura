package com.example.Parcial2.repository;
import com.example.Parcial2.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    // Métodos personalizados aquí
}
