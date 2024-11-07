/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplestack_pila;

/**
 *
 * @author alex_
 */
class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    // Método para agregar un elemento a la pila
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " ha sido apilado.");
    }

    // Método para eliminar el elemento superior de la pila
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        System.out.println(poppedData + " ha sido desapilado.");
        return poppedData;
    }

    // Método para ver el elemento superior sin sacarlo de la pila
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return -1;
        }
        return top.data;
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }
}

