/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto11.test;
import Pto11.modelo.Zapatilla;
import Pto11.util.GestorZapatillas;
 import java.util.Scanner;

/**
 *
 * @author RENE
 */
public class Principal11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String m1,m2,m3;
        String c1,c2,c3;
        Scanner dat= new Scanner (System.in);
        
        System.out.println("Ingrese Marca: ");
        m1=dat.nextLine();
        System.out.println("Ingrese Calidad: (si es original o copia)");
        c1=dat.nextLine();
          System.out.println("Ingrese Marca: ");
        m2=dat.nextLine();
        System.out.println("Ingrese Calidad: (si es original o copia)");
        c2=dat.nextLine();
          System.out.println("Ingrese Marca: ");
        m3=dat.nextLine();
        System.out.println("Ingrese Calidad: (si es original o copia)");
        c3=dat.nextLine();
        
        
        
        
    Zapatilla z1 = new Zapatilla (m1,c1);
    Zapatilla z2 = new Zapatilla(m2,c2);
    Zapatilla z3 = new Zapatilla(m3 , c3);
    GestorZapatillas gestorzap = new GestorZapatillas();
    gestorzap.agregarZapatilla(z1,0);
     gestorzap.agregarZapatilla(z2, 1);
     gestorzap.agregarZapatilla(z3, 2);
     
     gestorzap.mostrarArreglo();
    }
}
