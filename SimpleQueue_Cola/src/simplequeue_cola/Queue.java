/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplequeue_cola;

/**
 *
 * @author alex_
 */
class Queue {
    private Node front;  // El frente de la cola
    private Node rear;   // El final de la cola

    public Queue() {
        this.front = this.rear = null;
    }

    // Método para agregar un elemento al final de la cola
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // Si la cola está vacía, el nuevo nodo será el frente y el final
        if (this.rear == null) {
            this.front = this.rear = newNode;
            System.out.println(data + " ha sido encolado.");
            return;
        }

        // Añadir el nuevo nodo al final de la cola y actualizar el final
        this.rear.next = newNode;
        this.rear = newNode;
        System.out.println(data + " ha sido encolado.");
    }

    // Método para eliminar el elemento al frente de la cola
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return -1;
        }

        int dequeuedData = this.front.data;
        this.front = this.front.next;

        // Si el frente se vuelve null, también se debe actualizar el final
        if (this.front == null) {
            this.rear = null;
        }

        System.out.println(dequeuedData + " ha sido desencolado.");
        return dequeuedData;
    }

    // Método para ver el elemento al frente de la cola sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        return this.front.data;
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return front == null;
    }
}
