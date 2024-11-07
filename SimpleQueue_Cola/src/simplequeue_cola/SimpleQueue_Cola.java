/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplequeue_cola;


   /**
 * Numero de Control: 23550373
 * @author Alexis Cruz Martinez
 * Materia: Estructura de Datos
 */
public class SimpleQueue_Cola {

   public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Elemento en el frente: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("¿Está vacía la cola? " + queue.isEmpty());
    }
}
