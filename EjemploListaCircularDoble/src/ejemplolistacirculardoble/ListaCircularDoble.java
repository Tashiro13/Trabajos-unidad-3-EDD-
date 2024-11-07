/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplolistacirculardoble;

/**
 *
 * @author alex_
 */
class ListaCircularDoble {
    private Nodo cabeza;

    public ListaCircularDoble() {
        cabeza = null;
    }

    // Método para agregar un nuevo nodo al final
    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            Nodo ultimo = cabeza.anterior;
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.anterior = ultimo;
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
        }
    }

    // Método para insertar un nodo en una posición específica
    public void insertar(int dato, int posicion) {
        Nodo nuevoNodo = new Nodo(dato);
        if (posicion == 0) {
            agregarAlFinal(dato);
            return;
        }

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        int contador = 0;

        while (contador < posicion - 1 && actual.siguiente != cabeza) {
            actual = actual.siguiente;
            contador++;
        }

        nuevoNodo.siguiente = actual.siguiente;
        nuevoNodo.anterior = actual;
        actual.siguiente = nuevoNodo;
        nuevoNodo.siguiente.anterior = nuevoNodo;
    }

    // Método para eliminar un nodo
    public void eliminar(int dato) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            if (actual.dato == dato) {
                if (actual == cabeza && actual.siguiente == cabeza) {
                    cabeza = null; // Lista queda vacía
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                    if (actual == cabeza) {
                        cabeza = actual.siguiente; // Actualizar cabeza si se elimina el primer nodo
                    }
                }
                System.out.println("Nodo con dato " + dato + " eliminado.");
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
        
        System.out.println("Nodo con dato " + dato + " no encontrado.");
    }

    // Método para buscar un nodo
    public boolean buscar(int dato) {
        if (cabeza == null) {
            return false;
        }

        Nodo actual = cabeza;
        do {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false;
    }

    // Método para mostrar la lista
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println();
    }

    // Método para comprobar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

public void vaciar() {
    cabeza = null; // Al hacer esto, Java eliminará todos los nodos.
    // Si tu lista circular tiene un tamaño, puedes también restablecerlo a 0.
}
}
