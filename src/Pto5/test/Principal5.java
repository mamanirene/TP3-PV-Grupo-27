/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto5.test;

import Pto5.modelo.Circulo;
import Pto5.utils.GestorCirculos;
import java.util.Scanner;
/**
 *
 * @author RENE
 */
public class Principal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner (System.in);
        double rad;
        String col;
         double rad2;
        String col2;
       
         GestorCirculos gestor = new GestorCirculos();
        
        System.out.println("Ingrese Radio1: ");
            rad=dato.nextDouble();
         System.out.println("Ingrese Radio2: ");
        rad2=dato.nextDouble();
         System.out.println("Ingrese Color del circulo1: ");
            col=dato.nextLine();
         System.out.println("Ingrese Color del circulo2: ");
             col2=dato.nextLine();

         Circulo c1 = new Circulo(rad,col);
         Circulo c2 = new Circulo(rad2,col2);
         gestor.agregarCirculo (c1);
         gestor.agregarCirculo(c2);
    
            for (Circulo circulo: gestor.getCirculos()){
    
            System.out.println("Radio: "+circulo.getRadio());
            System.out.println("Color: "+circulo.getColor());
            System.out.println("Superficie: "+circulo.obtenerSuperficie());
    
    }
    
    
    
   }
     
}
