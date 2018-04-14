/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto7.test;
import Pto7.modelo.Auto;
import Pto7.utils.GestorAutos;
import java.util.Scanner;
/**
 *
 * @author RENE
 */
public class Principal7 {

  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc,mo=0;  boolean band=false;
        String Pa=null,m=null,c=null,tdc=null;
        
        Auto a1 = new Auto("AIY 342","Renault 9", "Bordo", 1994, "Nafta" );
        Auto a2 = new Auto("SOP 724", "Fiat ", "Rojo",1998,"Nafta");
        Auto a3 = new Auto ("LKS 591", "Chevrolet", "Blanco", 2015, "Gasoil");
        GestorAutos arreglodeautos = new GestorAutos(3);
        arreglodeautos.agregarAuto(a1, 0);
        arreglodeautos.agregarAuto(a2, 1);
        arreglodeautos.agregarAuto(a3, 2);
        
        arreglodeautos.mostrarArreglo();
        
       while(!band)
        {
            Scanner dat = new Scanner(System.in); 
            System.out.println("* * * * * * - - - - * * * * * *");
            System.out.println("ELIJA UNA OPCION ");
            System.out.println("1.- Editar Auto de la 1ra posicion ");
            System.out.println("2.- Editar Auto de la 2da posicion ");
            System.out.println("3.- Editar Auto de la 3ra posicion ");
            System.out.println("4.- Salir ");
            
            opc = dat.nextInt();   
            switch(opc)
                {
                   case 1:
                        {  
                            
                            arreglodeautos.editarAuto(Pa, m, c, mo, tdc);
                           arreglodeautos.mostrarArreglo();    
                        }break;
                   case 2:
                        {
                          arreglodeautos.editarAuto(Pa, m, c, mo, tdc);
                           arreglodeautos.mostrarArreglo();    
                         
    
                        }break;
                    case 3:
                        { 
                            arreglodeautos.editarAuto(Pa, m, c, mo, tdc);
                           arreglodeautos.mostrarArreglo();    
                           
                        } break;
                    case 4:
                    {
                            band=true;
                        } break;
                    default:
                       System.out.println("Solo números entre 1 y 4");
    
      }
    
            
    }
   
}
    
}
