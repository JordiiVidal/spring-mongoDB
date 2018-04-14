package com.springmongo.springmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Vidiic on 02/04/2018.
 */
@Document(collection = "jugadores")
public class Player {

    @Id
    private String ident;
    private String nombre;
    private String apellidos;
    private int dorsal;
    private String posicion;
    private String nacionalidad;
    private int edad;

    public Player( String nombre, String apellidos, int dorsal, String posicion, String nacionalidad, int edad) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }




}
