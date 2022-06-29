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
public class Ejer3 {

    /**
     * Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 -
     * 120, etc. No se introducen valores por teclado.
     */
    public static void main(String[] args) {
       
        int numeroImpresiones = 0;
        int resultado = 0;
        int x = 15;
        while (numeroImpresiones <= 25) {

            System.out.println(x);
            System.out.println("-");
            numeroImpresiones = numeroImpresiones + 1;
            x = x * 2;
        }

    }

}
