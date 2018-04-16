/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto4.test;
import java.util.Scanner;
/**
 *
 * @author RENE
 */
public class Principal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vec[]= new int[11];
int max=0;
int min=0;
Scanner scan = new Scanner(System.in);
        System.out.println("escriba los numeros");
for(int i=0;i<=10;i++){
    System.out.println("i: "+i);
vec[i]=scan.nextInt();
if(max<vec[i]){max=vec[i];}
if(min>vec[i]){min=vec[i];}
}
for(int i=0;i<=10;i++){
    System.out.println("numero "+ vec[i] +" en la pocicion "+ i);
}
        System.out.println("mayor: "+max);
        System.out.println("menor: "+min);

    }
    
}
