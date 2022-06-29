/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3Banco;

import java.util.Scanner;

/**
 *
 * El Banco Tetimo quiere desarrollar un programa de estudio de viabilidad
 * hipotecaria para potenciales clientes de la entidad. Este programa debe
 * decidir si un cliente es "apto" para ser timado por el banco o por el
 * contrario, según los datos aportados por el cliente, el banco lo rechaza y lo
 * declara "no apto" por no ser rentable.
 *
 * Según los gerentes de Tetimo, cuando un cliente aterriza en su web para
 * solicitar una hipoteca, lo primero que deben saber es su edad y su sueldo
 * bruto mensual. Hay que tener en cuenta que no se conceden préstamos a menores
 * de edad y a mayores de 65 años. Si la edad es válida, el programa solicita al
 * cliente la cantidad total de pasta que necesita para su hipoteca. Si esa
 * cantidad que se solicita supera la cantidad resultante de multiplicar el
 * sueldo bruto anual del cliente por el factor multiplicativo, entonces la
 * hipoteca se rechaza. En Tetimo el factor multiplicativo es de 5,85. Por
 * ejemplo, si un cliente gana al año 30000 pavos, no podría pedir más de
 * 30000*5,85. Si el cliente ha pasado el filtro de edad y el filtro de la
 * cantidad a solicitar, el programa le solicita el número de años en los que
 * quiere devolver la hipoteca. Tetimo no concede hipotecas a más de 30 años y a
 * menos de cinco. Además, si la edad de la persona sumada a los años a devolver
 * el préstamo supera los 75 años, el préstamo se rechaza.
 *
 *
 *
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        
//        int tiempoPrestamos = entrada.nextInt(); // varible para que el cliente introduzca dato años prestamo
        final double FACTOR_MUL = 5.85;// constante factor multiplicativo
        final int TIEMPO_MAX = 30; //Constante para el control de los años maximo del prestamo
        final int TIEMPO_MIN = 5; // //Constante para el control de los años minimo del prestamo

        System.out.println("-----BIENVENIDO  AL BANCO TETIMO-----");
        System.out.println("Elija una opcion");
        System.out.println("1.Para solicita un prestamo");
        System.out.println("2.Para salir del menu");

        int opcion = entrada.nextInt(); // variable para gestion del Menu

        switch (opcion) {
            case 1:
                System.out.println("comencemos las gestiones");
                System.out.println("¿Cuantos años tienes");
                int edad = entrada.nextInt(); // varible para que el cliente introduzca dato edad
                if (edad > 18 && edad < 65) {
                    System.out.println("¿Cuanto es su sueldo bruto mensual?");
                    double sueldoMes = entrada.nextDouble();// varible para que el cliente introduzca dato sueldo mensual
                    System.out.println("¿Diganos el importe total del prestamo");
                    double prestamoSolicitado = entrada.nextDouble();// variable para recoger el dinero solicitado del prestamo
                    if (prestamoSolicitado < (sueldoMes * FACTOR_MUL)) {
                        System.out.println("¿En cuantos años quiere pagar el prestamo");
                        int aniosSoliciPresta = entrada.nextInt();
                        if (aniosSoliciPresta > 4 && aniosSoliciPresta <= 30) {
                            if ((edad + aniosSoliciPresta) > 75) {
                                System.out.println("Lo sentimos pero usted terminara el prestamos con demasiados años, no se lo concedemos");
                            } else {
                                System.out.println("Felicidades le concedemos el prestamo");
                            }
                        } else {
                            System.out.println("Los años inidicados estan fuera de los requisitos para concederle el prestamos");
                        }

                    } else {
                        System.out.println("La cantidad solicitada supera los requisitos necesarios para concederle el prestamo");
                    }

                } else {
                    System.out.println("La edad no es correcta");
                }

                break;
            case 2:
                System.out.println("Ha elegido salir");
                break;

        }

    }
}
