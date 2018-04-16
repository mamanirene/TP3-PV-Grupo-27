/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto3.test;
import java.util.Scanner;
/**
 *
 * @author RENE
 */
public class Principal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vec[]=new int[4];
Scanner scan = new Scanner(System.in);
        System.out.println("escriba la hipotenusa");
        vec[0]=scan.nextInt();
        System.out.println("escriba el cateto mayor");
        vec[1]=scan.nextInt();
        System.out.println("escriba el cateto menor");
        vec[2]=scan.nextInt();
        if(vec[0]<vec[1] || vec[0]<vec[2]){System.out.println("no se ha formado la figura.");
        if(vec[1]<vec[2]){System.out.println("no se ha formado la figura.");}}
        else{System.out.println("El Perimetro es: "+(vec[0]+vec[1]+vec[2]));
                }
}
    }
    

