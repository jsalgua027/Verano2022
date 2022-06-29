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
public class Ejer8 {

    /**
     * ¿Qué realiza el siguiente programa Java?

     */
    public static void main(String[] args) {
        char departamento = 'B';

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
            default:
                System.out.println("Departamento no válido");
        }
        System.out.println("Código para el departamento es " + departamento);
    }
  // muestra la salidad del sout segun el char que le damos y tambien nos indica el chart en la otra linea
}
