/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto1;
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author RENE
 */
public class Pto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int vecX[]= new int[2];
    int vecY[]= new int[2];   //podira poner ambos en un solo arreglo pero es mas ordenado asi
    System.out.println("escribir distancias");
    Scanner scan = new Scanner (System.in);
    
    for(int i=0;i<2;i++){
        System.out.println("escriba el valor de X"+i);
    vecX[i]=scan.nextInt();
    System.out.println("escriba el valor de Y"+i);              //aqui me salta un error el cual es por el arreglo asi que por eso pongo el arreglo en 0,1,2
    vecY[i]=scan.nextInt();
    }
    

        int val1=vecX[1]-vecX[0];
        int val2=vecY[1]-vecY[0];
        System.out.println("Resultado: "+(sqrt(((val1*val1))+(val2*val2))));
        
        
    }
    
}
