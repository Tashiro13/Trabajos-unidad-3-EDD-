/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplolistaenlazada;

/**
 *
 * @author alex_
 */
public class Lista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

   public void agregar(int dato) {
    Nodo nuevoNodo = new Nodo(dato);
    if (cabeza == null) {
        cabeza = nuevoNodo;
    } else {
        Nodo temp = cabeza;
        while (temp.siguiente != null) {
            temp = temp.siguiente;
        }
        temp.siguiente = nuevoNodo;
        nuevoNodo.anterior = temp; // Enlaza el nuevo nodo con el último nodo
    }
}

    public void mostrar() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
    
    
    public boolean eliminar(int dato) {
        // Si la lista está vacía
        if (cabeza == null){
            return false;
        } 

        Nodo temp = cabeza;

        while (temp != null) {
            if (temp.dato == dato) {
                if (temp.anterior != null) {
                    temp.anterior.siguiente = temp.siguiente;
                } else {
                    cabeza = temp.siguiente; // Si es el primer nodo
                }
                if (temp.siguiente != null) {
                    temp.siguiente.anterior = temp.anterior;
                }
                return true; // Elemento eliminado
            }
            temp = temp.siguiente;
        }
        return false; // Elemento no encontrado
    }
    public boolean buscar(int dato) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.dato == dato) {
                return true; // Elemento encontrado
            }
            temp = temp.siguiente;
        }
        return false; // Elemento no encontrado
    }
    
    public boolean estaVacia() {
        return cabeza == null;
    }
}
