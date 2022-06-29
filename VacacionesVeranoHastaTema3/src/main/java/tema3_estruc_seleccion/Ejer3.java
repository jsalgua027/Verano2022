/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3_estruc_seleccion;

/**
 *
 * @author JoseIgnacio
 */
public class Ejer3 {

    /**
     *3.- ¿Qué devuelven estas expresiones?
            a) boolean unaCondicion = true;
            resultado = unaCondicion ? valor1 : valor2;
            b) int x = 10;
            int y = (x > 9) ? 100 : 200;
            c) int publico = 19500;
            int vendidas = 19000;
            int aforo = 2000;
            String status = (publico < aforo) ? "Cabe mas gente": (vendidas <
            aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
     */
    public static void main(String[] args) {
       //A//
       /*
        boolean unaCondicion = true;
           String    resultado = unaCondicion ? valor1 : valor2;
        */   
           
        //B//
            int x = 10;
            int y = (x > 9) ? 100 : 200;
            // devuelve 100
            
        //C// 
            int publico = 19500;
            int vendidas = 19000;
            int aforo = 20000;
            String status = (publico < aforo) ? "Cabe mas gente": (vendidas <
            aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
            
            // aun no hemos vendido todos
    }
    
}
