package com.example.demo;

public class Asignatura {
    
    private String codigo;
    private String nombre;

    public Asignatura(String codigo, String nombre) {

        this.codigo = codigo;
        this.nombre = nombre;

    }

    public String getCodigo(){

        return codigo;
    }

    public String getNombre(){

        return nombre;
    }

}