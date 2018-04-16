/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto2.test;
import java.util.Scanner;
/**
 *
 * @author RENE
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int vec[]= new int[10];
       Scanner scan = new Scanner(System.in);
        System.out.println("escribir PuntoX");
       vec[0]=scan.nextInt();
        System.out.println("escribir PuntoY");
       vec[1]=scan.nextInt();
        System.out.println("escribir Altura");
       vec[2]=scan.nextInt();
        System.out.println("escribir Base");
       vec[3]=scan.nextInt();
if(vec[2]==vec[3]){System.out.println("la base no puede ser igual que la altura");}
else{
        vec[4]=(vec[0]+vec[3]);
        vec[5]=(vec[1]+vec[2]);
       /**
        * despues de guardar las variebles de punto(x,y) base y altura, ahora guardamos 
        * en la posicion 4 y 5 del Vector los valores del punto2 sumamos al x del punto original la longitud de la base 
        * y obtenemos el x del nuevo punto, ahora hacemos lo mismo para el y de punto al cual le sumamos la altura y nos dara
        * el resultado deceado
        */
       System.out.println("Primer punto(X) "+vec[1]+" punto(y) "+vec[2]);
        System.out.println("Segundo punto(X) "+vec[0]+" punto(y) "+vec[4]);
        System.out.println("Tercer punto(X) "+vec[4]+" punto(y) "+vec[5]);
        System.out.println("Cuarto punto(X) "+vec[5]+" punto(y) "+vec[1]);
        
    }
    }
    
    }
    

