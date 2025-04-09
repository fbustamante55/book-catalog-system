/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Fabia
 */
public class ListaSimple {
    private Nodo head;

    public ListaSimple() {
        this.head = null;
    }

    public void agregarLibro(Libro libro) {
        Nodo newNode = new Nodo(libro);
        if (head == null) {
            head = newNode;
        } else {
            Nodo temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Libro[] obtenerLibros() {
        int size = 0;
        Nodo temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        Libro[] libros = new Libro[size];
        temp = head;
        int i = 0;
        while (temp != null) {
            libros[i] = (Libro) temp.data;
            i++;
            temp = temp.next;
        }

        return libros;
    }

    public void eliminarLibro(int id) {
        Nodo temp = head;
        Nodo prev = null;
        while (temp != null && ((Libro) temp.data).getId() != id) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return;
        if (prev == null) {
            head = temp.next;
        } else {
            prev.next = temp.next;
        }
    }
}
