/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Fabia
 */
public class Catalogo {
    private ListaDobleCircular categorias;

    public Catalogo() {
        categorias = new ListaDobleCircular();
    }

    public ListaDobleCircular getCategorias() {
        return categorias;
    }

    public void getLibrosEditorial(String editorial) {
        Categoria[] categoriasArr = categorias.obtenerCategorias();
        for (Categoria categoria : categoriasArr) {
            Libro[] libros = categoria.getLibros().obtenerLibros();
            for (Libro libro : libros) {
                if (libro.getEditorial().equals(editorial)) {
                    System.out.println(libro.getTitulo());
                }
            }
        }
    }

    public Libro[] devuelveLibrosCategoria(int categoriaId) {
        Categoria[] categoriasArr = categorias.obtenerCategorias();
        for (Categoria categoria : categoriasArr) {
            if (categoria.getId() == categoriaId) {
                return categoria.getLibros().obtenerLibros();
            }
        }
        return new Libro[0];
    }

    public void eliminaLibroCategoria(int categoriaId, int libroId) {
        Categoria[] categoriasArr = categorias.obtenerCategorias();
        for (Categoria categoria : categoriasArr) {
            if (categoria.getId() == categoriaId) {
                categoria.getLibros().eliminarLibro(libroId);
            }
        }
    }

    public void imprimaCategorias() {
        Categoria[] categoriasArr = categorias.obtenerCategorias();
        for (Categoria categoria : categoriasArr) {
            System.out.println("Categoría " + categoria.getNombre() + " tiene " + categoria.getLibros().obtenerLibros().length + " libros.");
        }
    }
}
