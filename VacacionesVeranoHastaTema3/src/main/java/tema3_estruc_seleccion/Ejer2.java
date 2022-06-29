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
public class Ejer2 {

    /**
     * 2.- Utilizando el operador ternario ?: de Java, implementa las siguientes sentencias:
            a) Si el número “x” es mayor o igual que 135 se devolverá “mayor”, si es menor se
            devolverá “menor”. Las cadenas que se devuelven se guardarán en una variable
            llamada resultado.
            b) Si el número “x” es menor o igual que cero se imprimirá en pantalla “Menor que
            cero”, si no se imprimirá “Mayor que cero”.
            c) Guardar el valor absoluto de un número entero en una variable entera (sin usar la
            función Math.abs())
     */
    public static void main(String[] args) {
        Scanner entraDatos = new Scanner(System.in);
        //A/////
        
        String resultado;
        System.out.println("Di un Número: ");
        int x = entraDatos.nextInt();
//        resultado = (x>135)?"mayor":"menor";
//        System.out.println(resultado);
//        
        
        ///B////
        
//        resultado = (x<=0)?"Menor que cero":"Mayor que cero";
//        System.out.println(resultado);
        
         ///C////
        int entero = entraDatos.nextInt();
         int resultado2 = (x < 0) ? entero : entero * -1;
         System.out.println(resultado2);
    }
        
           
}
