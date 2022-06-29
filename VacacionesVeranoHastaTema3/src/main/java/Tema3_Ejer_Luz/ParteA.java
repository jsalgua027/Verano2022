/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3_Ejer_Luz;

import java.util.Scanner;

/**
 *
 * @author JoseIgnacio
 */
public class ParteA {

    /**
     * PARTE A Por todos es sabido que el precio de la energía no para de subir,
     * y en concreto, la luz que se paga en los hogares está a un precio
     * astronómico.
     *
     * La idea es que realices una calculadora de consumo eléctrico, de forma
     * que se pueda introducir el consumo en vatios de un aparato (entre 1 y
     * 4500), las horas que está funcionando al día y el precio del kWh (entre
     * 0.1 y 0.45) para saber cuántos € hay que pagar por el consumo de ese
     * aparato.
     *
     * Por ejemplo, una lavadora consume 450Wh y tarda 2.5h en hacer la colada,
     * en total consume 1.12kW en esas dos horas y media. Suponiendo un precio
     * de 0.30€/kWh entonces la lavadora ha gastado en lavar la ropa:
     * 1.12kW*0.3€/kWh = 0.33€.
     *
     * Aclaraciones: * Usa entrada y salida estándar (Scanner y System.out).
     * Limita la salida a 2 decimales con printf. Si algún dato introducido no
     * es válido entonces se debe solicitar de nuevo. El programa se debe
     * ejecutar tantas veces como sea necesario, hasta que el usuario indique
     * que quiere salir (en ambas clases). Incluye comentarios. Presta atención
     * a la legibilidad del código, nombres de variables, clases, etc.
     *
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;// variable de control del bucle
        boolean bucle = true;
        do {
            System.out.println("vamos a calcular el precio de la luz");
            System.out.println("1.Para calcular el precio");
            System.out.println("2 o mas para Salir");
            opcion = entrada.nextInt();
            if (opcion >= 2) {
                bucle = false;
            } else {

                System.out.println("Introduce el consumo en Watios de su aparato Electrico");
                int consumoWatios = entrada.nextInt();
                if (consumoWatios >= 1 && consumoWatios <= 4500) {
                    entrada.nextLine();
                    System.out.println("¿Cuantas horas al dia lo usas");
                    double horasUso = entrada.nextDouble();
                    if (horasUso >= 1 && horasUso <= 24) {
                        double comsumoHorasKiloWatios = (consumoWatios * horasUso) / 1000;
                        entrada.nextLine();
                        System.out.println("Indique el precio hora");
                        
                        double precioHora = entrada.nextDouble();
                        if (precioHora >= 0.1 && precioHora <= 0.45) {
                            double resultadoCoste = comsumoHorasKiloWatios * precioHora;
                                System.out.printf("El precio final de cosumo de su aparato es de [ %.2f €]\n\n",resultadoCoste);
                        } else {
                            System.out.println("El precio es erroneo");
                        }
                    } else {
                        System.out.println("Las horas indicadas son erroneas");
                    }

                } else {
                    System.out.println("El consumo en Watios indicado es erroneno");
                }
            }
        } while (bucle == true);
    }

}
