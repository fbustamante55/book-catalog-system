/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Fabia
 */
public class ListaDobleCircular {
    private Nodo head;

    public ListaDobleCircular() {
        this.head = null;
    }

    public void agregarCategoria(Categoria categoria) {
        Nodo newNode = new Nodo(categoria);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Nodo temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public Categoria[] obtenerCategorias() {
        int size = 0;
        Nodo temp = head;
        if (temp != null) {
            do {
                size++;
                temp = temp.next;
            } while (temp != head);
        }

        Categoria[] categorias = new Categoria[size];
        temp = head;
        int i = 0;
        if (temp != null) {
            do {
                categorias[i] = (Categoria) temp.data;
                i++;
                temp = temp.next;
            } while (temp != head);
        }
        return categorias;
    }
}
