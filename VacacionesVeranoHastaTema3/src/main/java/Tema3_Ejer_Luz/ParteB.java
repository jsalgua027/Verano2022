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
public class ParteB {

    /**
     * PARTE B Modifica el programa anterior para que realice discriminación
     * horaria y ajuste el precio de la energía en función de ese horario. Para
     * ello hay que saber cuántas horas está funcionando el aparato en horas
     * punta, cuántas en horas llanas y cuántas en horas valle. Cada uno de esos
     * tramos horarios tiene un precio del kWh diferente, que el usuario
     * introducirá por teclado teniendo en cuenta que el precio en horas punta
     * es el más caro, luego sigue el precio en horas llanas y finalmente el
     * precio más barato es el de horas valle, sabiendo que todos los precios
     * estarán dentro del rango 0.1 y 0.45. Por lo tanto, el precio final
     * dependerá de los consumos realizados en dichos tramos y el precio en cada
     * tramo.
     *
     *
     * Por ejemplo, una lavadora consume 450Wh y tarda 2.5h en hacer la colada.
     * De esas 2.5 horas, 1 hora lava en hora punta y la otra hora y media el
     * consumo se realiza en horas llanas. Si el precio del kWh en horas punta
     * es 0.31, en horas llanas 0.27 y en horas valle 0.18, el gasto final sería
     * la suma del consumo en cada tramo por el precio del kWh en cada tramo:      *
     * 0.45kWh * 1 h * 0.31€/kWh = 0.13€ (hora punta) 0.45kWh * 1.5 h *
     * 0.27€/kWh = 0.18€ (hora llana) 0.45kWh * 0 h * 0.18€/kWh = 0€ (hora
     * valle) El precio final de la colada es 0.31€.
     *
     * Aclaraciones:      *
     * Usa entrada y salida estándar (Scanner y System.out). Limita la salida a
     * 2 decimales con printf. Si algún dato introducido no es válido entonces
     * se debe solicitar de nuevo. El programa se debe ejecutar tantas veces
     * como sea necesario, hasta que el usuario indique que quiere salir (en
     * ambas clases). Incluye comentarios. Presta atención a la legibilidad del
     * código, nombres de variables, clases, etc.
     */
    public static void main(String[] args) {
      Scanner entrada= new Scanner(System.in);
      
      double decimal;
        System.out.println("pon un decimal:  ");
      decimal = entrada.nextDouble();
      
        System.out.println(decimal);
      
      
      
    }

}
