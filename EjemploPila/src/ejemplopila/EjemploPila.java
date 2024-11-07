/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopila;

import java.io.*;

/**
 *
 * @author alex_
 */
public class EjemploPila {

   /**
*Numero de control: 23550373
 * @author Alexis Cruz Martinez_
 * Materia: Estructura de datos 
 */
    public static void main(String[] args) {
        // TODO code application logic here
        	 PilaLineal pila;
     int x;
         final int CLAVE = -1;
	BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
                    System.out.println("Teclea los elementos (termina con -1).");
    }
  public class PilaLineal{
     private static final int TAMPILA = 49;
         private int cima;
             private TipoDeDato []listaPila;
	
         public PilaLineal() {
	cima = -1; // condición de pila vacía
                     listaPila = new TipoDeDato[TAMPILA];
	 }
	 // operaciones que modifican la pila
	 public void insertar(TipoDeDato elemento){...}
	 public TipoDeDato quitar(){...}
	 public void limpiarPila(){...}
	 //	operación de acceso a la pila
	 public	 TipoDeDato cimaPila(){...}
	 // verificación estado de la pila
	 public boolean pilaVacia(){...}
	 public boolean pilaLlena(){...}
}

}
