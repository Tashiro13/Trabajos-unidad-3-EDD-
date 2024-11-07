/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolistacirculardoble;

import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class EjemploListaCircularDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircularDoble lista = new ListaCircularDoble();
        int opcion;

        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar elemento al final");
            System.out.println("2. Insertar elemento en posición específica");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Comprobar si la lista está vacía");
            System.out.println("7. Vaciar lista");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

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
                            lista.agregarAlFinal(dato);
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, ingresa un número válido o 'salir' para terminar.");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingresa el dato a insertar: ");
                    int datoInsertar = scanner.nextInt();
                    System.out.print("Ingresa la posición (0 para al final): ");
                    int posicion = scanner.nextInt();
                    lista.insertar(datoInsertar, posicion);
                    break;
                case 3:
                    System.out.print("Ingresa el dato a eliminar: ");
                    int datoEliminar = scanner.nextInt();
                    lista.eliminar(datoEliminar);
                    break;
                case 4:
                    System.out.print("Ingresa el dato a buscar: ");
                    int datoBuscar = scanner.nextInt();
                    boolean encontrado = lista.buscar(datoBuscar);
                    System.out.println("Elemento " + (encontrado ? "encontrado." : "no encontrado."));
                    break;
                case 5:
                    System.out.println("Elementos en la lista:");
                    lista.mostrarLista();
                    break;
                case 6:
                    System.out.println("¿La lista está vacía? " + (lista.estaVacia() ? "Sí" : "No"));
                    break;
                case 7:
                    lista.vaciar();
                    System.out.println("La lista ha sido vaciada.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
