/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplocola;

import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class EjemploColaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear una instancia de la cola circular
        ColaCircular cola = new ColaCircular();
        Scanner scanner = new Scanner(System.in);

        // Variable para controlar el menú
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- Menú de Cola Circular ---");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Quitar elemento");
            System.out.println("3. Ver frente de la cola");
            System.out.println("4. Verificar si un elemento está en la cola");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            if (opcion == 1) {
                // Insertar elemento
                System.out.print("Ingrese el elemento a insertar: ");
                String elemento = scanner.nextLine();

                try {
                    if (!cola.colaLlena()) {
                        cola.insertar(elemento);
                        System.out.println("Elemento '" + elemento + "' insertado correctamente.");
                    } else {
                        System.out.println("Error: La cola está llena.");
                    }
                } catch (ColaCircular.ColaLlenaException e) {
                    System.out.println(e.getMessage());
                }

            } else if (opcion == 2) {
                // Quitar elemento
                try {
                    if (!cola.colaVacia()) {
                        Object eliminado = cola.quitar();
                        System.out.println("Elemento '" + eliminado + "' eliminado de la cola.");
                    } else {
                        System.out.println("Error: La cola está vacía.");
                    }
                } catch (ColaCircular.ColaVaciaException e) {
                    System.out.println(e.getMessage());
                }

            } else if (opcion == 3) {
                // Ver frente de la cola
                try {
                    if (!cola.colaVacia()) {
                        System.out.println("El frente de la cola es: " + cola.frenteCola());
                    } else {
                        System.out.println("Error: La cola está vacía.");
                    }
                } catch (ColaCircular.ColaVaciaException e) {
                    System.out.println(e.getMessage());
                }

            } else if (opcion == 4) {
                // Verificar si un elemento está en la cola
                System.out.print("Ingrese el elemento a verificar: ");
                String elemento = scanner.nextLine();

                if (cola.contiene(elemento)) {
                    System.out.println("El elemento '" + elemento + "' está en la cola.");
                } else {
                    System.out.println("El elemento '" + elemento + "' NO está en la cola.");
                }

            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

            // Imprimir el estado actual de la cola después de cada operación
            cola.imprimirCola();
        }

        scanner.close();
    }
}
