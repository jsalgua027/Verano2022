/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3_estruc_seleccion;

import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class Ejer4 {

    /**
     *Reescribe el programa del ejercicio 1 usando el operador ternario ?:.
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("escanear edad:");
        int edad = scanner.nextInt();
        
        String resultado = (edad >= 18)? "Es mayor de edad":"Es menor de edad";
        System.out.println(resultado);
        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }
    
}
