package com.example.Parcial2.repository;
import com.example.Parcial2.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Long> {



    // 3. Obtener el número total de goles marcados por un equipo en todos sus partidos
    @Query(value =
            "SELECT COALESCE(SUM(p.goles_local),0) + COALESCE(SUM(p.goles_visita),0) " +
                    "  FROM partido p " +
                    " WHERE p.equipo_local = :equipoId " +
                    "    OR p.equipo_visita = :equipoId",
            nativeQuery = true)
    Integer findTotalGolesByEquipo(@Param("equipoId") Long equipoId);

    //4. Obtener los resultados de todos los partidos indicando los nombres de los equipos
    @Query(value =
            "SELECT " +
                    "  p.id_partido, " +
                    "  loc.nombre AS equipo_local, " +
                    "  vis.nombre AS equipo_visita, " +
                    "  p.goles_local, " +
                    "  p.goles_visita " +
                    "FROM partido p " +
                    "JOIN equipo loc ON p.equipo_local = loc.id_equipo " +
                    "JOIN equipo vis ON p.equipo_visita = vis.id_equipo",
            nativeQuery = true)
    List<Object[]> findResultadosConNombres();
}