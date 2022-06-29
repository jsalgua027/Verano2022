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
public class Ejer11 {

    /**
     * Implementa un programa Java que permita visualizar todas las letras mayúsculas, 
     * desde la 'A' hasta la 'Z', usando un do – while.
     */
    public static void main(String[] args) {
       final char  z='Z';
       char a='A';
       
       
       do{
           System.out.println(a);
           a++;
           
           
       }while(a <= z);
       
       
    }
    
}
