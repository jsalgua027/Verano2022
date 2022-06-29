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
public class Ejer10 {

    /**
     * Modifica el código anterior para que variable2 valga 30.
     */
    public static void main(String[] args) {
        int variable = 3, variable2;
        switch (variable) {

            case 1:
                variable2 = 5;
                break;
            case 2:
                variable2 = 20;
                break;
            case 3:
                variable2 = 30;
                break;
            case 4:
                variable2 = 10;
                break;
            default:
                variable2 = 100;
                break;

        }
        System.out.println(variable2);
    }
    
}
