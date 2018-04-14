package com.springmongo.springmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "equipos")
public class Team {

    @Id
    private String id;
    private String nombre;
    private int socios;
    private String localidad;
    private String presidente;
    private String estadio;

    public Team( String nombre, int socios, String localidad, String presidente, String estadio) {
        this.nombre = nombre;
        this.socios = socios;
        this.localidad = localidad;
        this.presidente = presidente;
        this.estadio = estadio;
    }

    public String getId() {return id;}

    public String getNombre() {return nombre;}

    public int getSocios() {return socios;}

    public String getLocalidad() {return localidad;}

    public String getPresidente() {return presidente;}

    public String getEstadio() {return estadio;}

    @Override
    public String toString() {
        return "Team{" +
                "nombre='" + nombre + '\'' +
                ", socios=" + socios +
                ", localidad='" + localidad + '\'' +
                ", presidente='" + presidente + '\'' +
                ", estadio='" + estadio + '\'' +
                '}';
    }
}
