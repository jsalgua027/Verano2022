/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3_estruc_repeticion;

/**
 *
 * @author JoseIgnacio
 */
public class Ejer12 {

    /**
     * Modifica el programa del ejercicio 10 para que se vea el código numérico (número entero) de cada una de las letras.

     */
    public static void main(String[] args) {
        final char z = 'z';

        for (char a = 'a'; a <= z; a++) {
            System.out.println((int)a);
        }
    }

}
