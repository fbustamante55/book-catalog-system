/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Fabia
 */
public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String editorial;

    public Libro(int id, String titulo, String autor, String editorial) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
