/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Developer;

/**
 *
 * @author ITCA
 */
public class CalculoInterSimple {
    public static void main(String [] args) {
        double interes, capitalPrestado, tiempo, tasaDeInteres, tiempoEnMeses;
        
        interes = 1144;
        capitalPrestado = 1200.00;
        tasaDeInteres = 0.08;
        
        tiempo = interes /(capitalPrestado * tasaDeInteres);
        tiempoEnMeses = tiempo +12;
            System.out.println("Tiempo: " + tiempo +"años");
           System.out.println("Tiempo: " + tiempoEnMeses + "meses");
    }
}
