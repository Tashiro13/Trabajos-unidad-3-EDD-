/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

 /**
*Numero de control: 23550373
 * @author Alexis Cruz Martinez_
 * Materia: Estructura de datos 
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Escribe un texto para saber si es palindromo o no");
        String s = x.nextLine();
        if(palin(s)){
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }

    private static boolean palin(String s) {
        s = s.toLowerCase();
            if(s.length()<=1){
                return true;
        } else {
             if(s.charAt(0) == s.charAt(s.length()-1)){
                return palin(s.substring(1,s.length()-1));
                }   else{
                    return false;}       
            }
    }
    
}
