package com.example.Parcial2.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_partido;

    private Date fecha;
    private String estadio;
    private Integer goles_local;
    private Integer goles_visita;

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visita")
    private Equipo equipoVisita;

    @OneToMany(mappedBy = "partido")
    private List<EstadisticaJugador> estadisticas;

    // Getters y Setters
}

