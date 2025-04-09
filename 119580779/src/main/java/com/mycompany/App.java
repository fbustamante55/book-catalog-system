/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany;

/**
 *
 * @author Fabia
 */
public class App {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        // Precargar categorías y libros
        Categoria accion = new Categoria(1, "Acción");
        accion.getLibros().agregarLibro(new Libro(1, "La Revolución", "Akal", "Comares"));
        accion.getLibros().agregarLibro(new Libro(2, "La Odisea", "Akal", "Comares"));
        catalogo.getCategorias().agregarCategoria(accion);

        Categoria romance = new Categoria(2, "Romance");
        romance.getLibros().agregarLibro(new Libro(3, "La esposa del viajero en el tiempo", "Akal", "Comares"));
        romance.getLibros().agregarLibro(new Libro(4, "Orgullo y prejuicio", "Akal", "Comares"));
        catalogo.getCategorias().agregarCategoria(romance);

        Categoria novela = new Categoria(3, "Novela");
        novela.getLibros().agregarLibro(new Libro(5, "Cien años de soledad", "Comares", "Comares"));
        catalogo.getCategorias().agregarCategoria(novela);

        Categoria ciencia = new Categoria(4, "Ciencia");
        ciencia.getLibros().agregarLibro(new Libro(6, "El origen de las especies", "Comares", "Comares"));
        ciencia.getLibros().agregarLibro(new Libro(7, "El futuro de la mente", "Akal", "Comares"));
        catalogo.getCategorias().agregarCategoria(ciencia);

        Categoria misterio = new Categoria(5, "Misterio");
        misterio.getLibros().agregarLibro(new Libro(8, "Perdida", "Comares", "Comares"));
        misterio.getLibros().agregarLibro(new Libro(9, "La Odisea", "Comares", "Comares"));
        misterio.getLibros().agregarLibro(new Libro(10, "Manos de luz", "Akal", "Comares"));
        catalogo.getCategorias().agregarCategoria(misterio);

        // Invocar getLibrosEditorial
        System.out.println("Libros de la editorial Comares:");
        catalogo.getLibrosEditorial("Comares");

        // Invocar devuelveLibrosCategoria
        System.out.println("\nLibros de la categoría Acción:");
        Libro[] librosCategoria = catalogo.devuelveLibrosCategoria(1);
        for (Libro libro : librosCategoria) {
            System.out.println(libro);
        }

        // Invocar imprimaCategorias
        System.out.println("\nImprimir categorías:");
        catalogo.imprimaCategorias();

        // Invocar eliminaLibroCategoria
        System.out.println("\nEliminando un libro de la categoría Acción:");
        catalogo.eliminaLibroCategoria(1, 1);
        catalogo.imprimaCategorias(); // Verificar que el libro ha sido eliminado
    }
}
