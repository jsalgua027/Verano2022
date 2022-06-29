/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3_estruc_repeticion;

import java.sql.Array;

/**
 *
 * @author JoseIgnacio
 */
public class Ejer10 {

    /**
     * Implementa un programa Java que permita visualizar todas las letras
     * minúsculas, desde la 'a' hasta la 'z', usando un for.
     */
    public static void main(String[] args) {
//         char letras[]= {'a','b','c', 'd', 'e', 'f','g','h','i', 'j','k','l','m','n','ñ','o','p','q','r','s','t','x','v','w','z'};
//         int indice =0;
//         while ( indice <= letras.length){
//             System.out.println(letras.toString()+1);

        final char z = 'z';

        for (char a = 'a'; a <= z; a++) {
            System.out.println(a);
        }

    }
}


