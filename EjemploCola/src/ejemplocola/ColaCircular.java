/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocola;

/**
 *
 * @author alex_
 */
public class ColaCircular {

    private static final int MAXTAMQ = 99;
    protected int frente;
    protected int fin;
    protected Object[] listaCola;

    // avanza una posición
    private int siguiente(int r) {
        return (r + 1) % MAXTAMQ;
    }

    // inicializa la cola vacía
    public ColaCircular() {
        frente = 0;
        fin = MAXTAMQ - 1;
        listaCola = new Object[MAXTAMQ];
    }

    // operaciones de modificación de la cola
    public void insertar(Object elemento) throws ColaLlenaException {
        if (!colaLlena()) {
            fin = siguiente(fin);
            listaCola[fin] = elemento;
        } else {
            throw new ColaLlenaException("Overflow en la cola");
        }
    }

    public Object quitar() throws ColaVaciaException {
        if (!colaVacia()) {
            Object tm = listaCola[frente];
            frente = siguiente(frente);
            return tm;
        } else {
            throw new ColaVaciaException("Cola vacia ");
        }
    }

    public void borrarCola() {
        frente = 0;
        fin = MAXTAMQ - 1;
    }

    // acceso a la cola
    public Object frenteCola() throws ColaVaciaException {
        if (!colaVacia()) {
            return listaCola[frente];
        } else {
            throw new ColaVaciaException("Cola vacia ");
        }
    }

    // métodos de verificación del estado de la cola
    public boolean colaVacia() {
        return frente == siguiente(fin);
    }

    public boolean colaLlena() {
        return frente == siguiente(siguiente(fin));
    }

 public void imprimirCola() {
    if (colaVacia()) {
        System.out.println("La cola está vacía");
    } else {
        System.out.print("Cola: ");
        int i = frente;
        while (i != siguiente(fin)) { // Condición corregida para manejar todos los elementos
            System.out.print(listaCola[i] + " ");
            i = siguiente(i);
        }
        System.out.println(); // Salto de línea al final
    }
}

    // nuevo: retorna el tamaño de la cola
    public int tamañoCola() {
        if (colaVacia()) {
            return 0;
        } else if (fin >= frente) {
            return fin - frente + 1;
        } else {
            return (MAXTAMQ - frente) + (fin + 1);
        }
    }

    // nuevo: verifica si un elemento está en la cola
    public boolean contiene(Object elemento) {
        if (colaVacia()) {
            return false;
        }

        int i = frente;
        while (i != siguiente(fin)) {
            if (listaCola[i].equals(elemento)) {
                return true;
            }
            i = siguiente(i);
        }

        return listaCola[fin].equals(elemento); // Verifica el último elemento
    }

    // Excepciones personalizadas para mayor claridad
    public class ColaLlenaException extends Exception {
        public ColaLlenaException(String mensaje) {
            super(mensaje);
        }
    }

    public class ColaVaciaException extends Exception {
        public ColaVaciaException(String mensaje) {
            super(mensaje);
        }
    }
}

