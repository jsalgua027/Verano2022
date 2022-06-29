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
public class Ejer4 {

    /**
     * 4.- Intenta averiguar qué realiza el siguiente programa, sin implementarlo. Implementa el
          programa en el entorno y compara tus resultados con la ejecución.
     */
    public static void main(String[] args) {
        int numero = 1;
        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);
    }
    //imprime hasta 10, termina el primer bucle y se mete en el do while para contar  hasta 1

}
