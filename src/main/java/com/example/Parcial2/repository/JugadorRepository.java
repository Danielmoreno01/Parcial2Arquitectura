package com.example.Parcial2.repository;


import com.example.Parcial2.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {


 //Obtener todos los jugadores de un equipo específico
    @Query(value =
            "SELECT * " +
                    "  FROM jugador " +
                    " WHERE id_equipo = :equipoId",
            nativeQuery = true)
    List<Jugador> findJugadoresByEquipo(@Param("equipoId") Long equipoId);

    //2. Obtener los jugadores que han marcado más de X goles
    @Query(value =
            "SELECT j.* " +
                    "  FROM jugador j " +
                    "  JOIN estadistica_jugador e ON j.id_jugador = e.id_jugador " +
                    " GROUP BY j.id_jugador " +
                    "HAVING SUM(e.goles) > :minGoles",
            nativeQuery = true)
    List<Jugador> findJugadoresConMasDeGoles(@Param("minGoles") int minGoles);
}
