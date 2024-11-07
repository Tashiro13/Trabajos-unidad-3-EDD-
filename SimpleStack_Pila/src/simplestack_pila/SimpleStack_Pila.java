/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplestack_pila;

/**
 * Numero de Control: 23550373
 * @author Alexis Cruz Martinez
 * Materia: Estructura de Datos
 */
public class SimpleStack_Pila {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Elemento en la cima: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("¿Está vacía la pila? " + stack.isEmpty());
    }
}
