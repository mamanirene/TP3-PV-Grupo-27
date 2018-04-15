/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto6.test;
import Pto6.modelo.Rectangulo;
import Pto6.utils.GestorRectangulos;
import java.util.Scanner;
/**
 *
 * @author RENE
 */
public class Principal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos;
        Rectangulo rct1 = new Rectangulo(2,3);
        Rectangulo rct2= new Rectangulo(3,5);
        Rectangulo rct3= new Rectangulo (4,4);
        GestorRectangulos gesrec = new GestorRectangulos();
        
        gesrec.cargarRectangulo(rct1);
        gesrec.cargarRectangulo(rct2);
        gesrec.cargarRectangulo(rct3);
        
        //Mostramos todos los rectangulos con sus atributos que se encuentran en el arraylist
        for (Rectangulo rct: gesrec.getRectangulos ()){
        
         System.out.println("Base: "+rct.getBase());
            System.out.println("Altura: "+rct.getAltura());
            System.out.println("Superficie: "+rct.getSuperficie());
            System.out.println("Perimetro: " +rct.getPerimetro());
        
    }
        //aqui solicitamos la posicion a eliminar
         Scanner dat = new Scanner (System.in);
        System.out.println("Ingrese Posicion  a eliminar, Recuerde que el Primer elemento esta en la posicion 0:");
        pos=dat.nextInt();
        if (pos<= gesrec.rectangulos.size())
        gesrec.eliminar(pos);
        
        //Luego Mostramos el estado final del arraylist
        for (Rectangulo rct: gesrec.getRectangulos ()){
        
         System.out.println("Base: "+rct.getBase());
            System.out.println("Altura: "+rct.getAltura());
            System.out.println("Superficie: "+rct.getSuperficie());
            System.out.println("Perimetro: " +rct.getPerimetro());
    }
    
}
}
