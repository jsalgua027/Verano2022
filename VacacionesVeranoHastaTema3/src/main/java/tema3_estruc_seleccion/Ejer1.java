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
public class Ejer1 {

    /**
     * 1.- Implementa el siguiente programa y realiza ejecuciones
     *     para los siguientes datos de
           edad: 10,18 y 67. ¿Cuáles son los resultados?
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("escanear edad:");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        System.out.print("mostrar la edad: ");
        System.out.println(edad);
        // Con 10 no es mayor de edad 
        // Con 18 es mayor de edad
        // Con 67 es mayor edad
    }
}


