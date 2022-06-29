/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.vehiculos;

/**
 *
 * 21. Crea un proyecto llamado Coches, dentro crea un paquete llamado
 * daw.vehiculos e implementa la clase Vehiculo que hay en los apuntes (páginas
 * 8 y 9). Crea también, según los apuntes, la clase MisVehiculos, con el método
 * main() vacío. * 22. En la clase MisVehiculos, crea un objeto tipo Vehiculo
 * llamado miCacharro con los valores que tú quieras. Muestra los datos del
 * vehículo miCacharro accediendo directamente a sus atributos. Vuelve a mostrar
 * los atributos en pantalla, usando los métodos getters.
 *
 * 23.Modifica, usando directamente el atributo (sin usar métodos), la matrícula
 * del vehículo miCacharro poniendo el valor que tú quieras. Vuelve a modificar
 * la matrícula pero esta vez usando el método setMatricula(). Muestra los
 * resultados de los cambios en pantalla.
 *
 * 26. ¿Qué es un alias? Implementa el ejemplo de la clase Vehiculo que hay en
 * los apuntes (págs 14 y 15)
 *
 *
 *
 */
public class MisVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo miCacharro = new Vehiculo("1757XWJ", "Porche", "Carrera", "Negro", 70000);

        System.out.println("Mi cacharro es un: \n" + miCacharro.getMarca() + "\n" + "Modelo: " + miCacharro.getModelo() + "\n"
                + "de color: " + miCacharro.getColor() + "\n" + "con al Matricula: " + miCacharro.getMatricula());

        System.out.println("////////Modifico la matriculo sin metodos///////");

       // miCacharro.matricula = "1878JJJ"; una vez que he echo privado los atributos no puedo acceder a ellos directamente

        System.out.println("Mi cacharro es un: \n" + miCacharro.getMarca() + "\n" + "Modelo: " + miCacharro.getModelo() + "\n"
                + "de color: " + miCacharro.getColor() + "\n" + "con al Matricula: " + miCacharro.getMatricula());

        System.out.println("//////////Modifico la matricula usando el set matricula//////////");

        miCacharro.setMatricula("2222MMM");

        System.out.println("Mi cacharro es un: \n" + miCacharro.getMarca() + "\n" + "Modelo: " + miCacharro.getModelo() + "\n"
                + "de color: " + miCacharro.getColor() + "\n" + "con al Matricula: " + miCacharro.getMatricula());

        System.out.println("////////////genero un alias de miCacharro que llamo miCacharro2");

        Vehiculo miCacharro2;

        miCacharro2 = miCacharro;

        System.out.println(miCacharro2.toString());

    }
}
