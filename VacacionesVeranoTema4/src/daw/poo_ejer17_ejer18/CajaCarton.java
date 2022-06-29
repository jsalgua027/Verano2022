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
public class CajaCarton {
    //dimesiones en milimeros y el peso en gramos
    private double ancho;
    
    private double alto;
    
    private double largo;
    
    private double peso;

    public CajaCarton(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "CajaCarton{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + ", peso=" + peso + '}';
    }
    
    public static void abrir(){
        
    }
    
    public static void cerrar(){
        
    }
    /*
    Implementa el método setPeso(int gramos) de la clase 'CajaCarton'
    para que en caso de que el peso sea negativo o mayor que 1000gr,
    se muestre un mensaje advirtiendo al usuario de que el peso pasado 
    como argumento no es válido y se establecerá a cero.
    */
    public  double  setpeso(double gramos){
        if (gramos <0 || gramos> 1000){
            System.out.println("El peso pasado no es valido");
            gramos = 0;
        }
        return gramos;
    }
    
}
