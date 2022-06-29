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
public class Ejer13 {

    /**
     * Modifica el programa del ejercicio 11 para que se vea el código numérico (número entero) de cada una de las letras.

     */
    public static void main(String[] args) {
       final char  z='Z';
       char a='A';
       
       
       do{
           System.out.println((int)a);
           a++;
           
           
       }while(a <= z);
    }
    
}
