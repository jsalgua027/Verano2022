/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.poo_ejer17_ejer18;

/**
 *
 * @author JoseIgnacio
 */
public class TestCajaCarton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);
        CajaCarton cajaChica = new CajaCarton(25, 30, 15, 17);

        System.out.println("las dimensiones de la caja grande es \n"
                + "de ancho: " + cajaGrande.getAncho() + "\n"
                + "de alto: " + cajaGrande.getAlto() + "\n"
                + "de largo: " + cajaGrande.getLargo() + "\n"
                + "con un peso de: " + cajaGrande.getPeso());
        System.out.println("/////////////////////////////////////////////////////////////////////////");
        System.out.println("las dimensiones de la caja chica es \n"
                + "de ancho: " + cajaChica.getAncho() + "\n"
                + "de alto: " + cajaChica.getAlto() + "\n"
                + "de largo: " + cajaChica.getLargo() + "\n"
                + "con un peso de: " + cajaChica.getPeso());
        System.out.println("////////////////////USAMOS EL METODO SET PESO EJERCICO 10/////////");
       
      
            System.out.println(  cajaChica.setpeso(1200));
            
         System.out.println("//////////////////Ejercicio 11//////");
           cajaChica.setPeso(1200);
           System.out.println("El peso de la cajaChica es: "+ cajaChica.getPeso());
    }

}
