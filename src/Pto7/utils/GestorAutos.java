/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto7.utils;

import Pto7.test.Principal7;
import Pto7.modelo.Auto;
import Pto7.utils.GestorAutos;
import java.util.Scanner;

/**
 *
 * @author RENE
 */
public class GestorAutos {
    
    Auto [] arreglo; 
    Auto a;
     public GestorAutos() {
        arreglo = new Auto [4];
    }


    public void setArreglo(Auto[] arreglo) {
        this.arreglo = arreglo;
    }
     public Auto[] getArreglo() {
        return arreglo;
    }
     public GestorAutos(int tamanioArreglo){
        arreglo = new Auto[tamanioArreglo];
    }
    public void agregarAuto(Auto auto, int posicion){
        arreglo[posicion] = auto;
    }
    public void borrarAuto(int posicion){
    arreglo[posicion]=arreglo[posicion-1];
    }
  // public void eliminarAuto(Auto auto){
    //    a.(auto);}
    
    public void editarAuto(String Pa, String mar,String col, int mod, String tipdecos  ){
        Scanner dat =new Scanner(System.in);
        
        
                            System.out.println("Ingrese Patente:");
                             Pa=dat.nextLine();
                            System.out.println("Ingrese Marca:");
                            mar=dat.nextLine();
                            System.out.println("Ingrese Color:");
                            col=dat.nextLine();
                            System.out.println("Ingrese Modelo:");
                            mod=dat.nextInt();
                            System.out.println("Ingrese Tipo de combustible: ");
                            tipdecos=dat.nextLine();
                          
                    
       a.setPatente(Pa);
       a.setMarca(mar);
       a.setColor(col);
       a.setModelo(mod);
       a.setTipodecombustible(tipdecos);
         
    }
          public void mostrarArreglo(){
        for(Auto a:arreglo){
            a.mostrarDatos();
        }
    
    }         
        
}
