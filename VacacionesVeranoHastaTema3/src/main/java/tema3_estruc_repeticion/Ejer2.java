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
public class Ejer2 {

    /**
     * 2.- Intenta averiguar qué realiza el siguiente programa, sin implementarlo. Implementa el
        programa en el entorno y compara tus resultados con la ejecución.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
        //suma uno a la valariable x hasta el valor que le indiques por scanner
    }

}
