/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Fabia
 */
public class Categoria {
    private int id;
    private String nombre;
    private ListaSimple libros;

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.libros = new ListaSimple();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ListaSimple getLibros() {
        return libros;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
