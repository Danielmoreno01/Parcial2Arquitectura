package com.example.Parcial2.model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_jugador;

    private String nombre;
    private String posicion;
    private Integer dorsal;
    private Date fecha_nac;
    private String nacionalidad;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    @OneToMany(mappedBy = "jugador")
    private List<EstadisticaJugador> estadisticas;

    public Jugador() {
    }

    public Jugador(Integer id_jugador, String nombre, String posicion, Integer dorsal, Date fecha_nac, String nacionalidad, Equipo equipo, List<EstadisticaJugador> estadisticas) {
        this.id_jugador = id_jugador;
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.fecha_nac = fecha_nac;
        this.nacionalidad = nacionalidad;
        this.equipo = equipo;
        this.estadisticas = estadisticas;
    }

    public Integer getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(Integer id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<EstadisticaJugador> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<EstadisticaJugador> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id_jugador=" + id_jugador +
                ", nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", dorsal=" + dorsal +
                ", fecha_nac=" + fecha_nac +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", equipo=" + equipo +
                ", estadisticas=" + estadisticas +
                '}';
    }
    // Getters y Setters
}
