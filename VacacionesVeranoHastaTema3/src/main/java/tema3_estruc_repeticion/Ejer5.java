/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3_estruc_repeticion;

import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class Ejer5 {

    /**
     * Implementa el programa del ejercicio 2 usando un do – while.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.println("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;

        do {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;

        } while (x <= n);

    }

}
