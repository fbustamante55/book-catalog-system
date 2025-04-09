/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Fabia
 */
public class Nodo {
    Object data;
    Nodo next;
    Nodo prev;

    public Nodo(Object data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
