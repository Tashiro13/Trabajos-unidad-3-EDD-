/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolistaenlazada;

import java.util.Scanner;

/**
 * Numero de Control: 23550373
 * @author Alexis Cruz Martinez
 * Materia: Estructura de Datos
 */
public class EjemploListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Comprobar si está vacía");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:

                    System.out.println("Ingresa los elementos a la lista doblemente enlazada (escribe 'salir' para terminar):");

                    while (true) {
                        System.out.print("Elemento: ");
                        String input = scanner.nextLine();

                        if (input.equalsIgnoreCase("salir")) {
                            break;
                        }

                        try {
                            int dato = Integer.parseInt(input);
                            lista.agregar(dato);
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, ingresa un número válido o 'salir' para terminar.");
                        }
                    }

                    /*
                    System.out.print("Ingresa el elemento a agregar: ");
                    int datoAgregar = scanner.nextInt();
                    lista.agregar(datoAgregar);
                     */
                    break;
                case 2:
                    System.out.print("Ingresa el elemento a eliminar: ");
                    int datoEliminar = scanner.nextInt();
                    if (lista.eliminar(datoEliminar)) {
                        System.out.println("Elemento eliminado.");
                    } else {
                        System.out.println("Elemento no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el elemento a buscar: ");
                    int datoBuscar = scanner.nextInt();
                    if (lista.buscar(datoBuscar)) {
                        System.out.println("Elemento encontrado.");
                    } else {
                        System.out.println("Elemento no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Elementos en la lista:");
                    lista.mostrar();
                    break;
                case 5:
                    if (lista.estaVacia()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("La lista no está vacía.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

}
