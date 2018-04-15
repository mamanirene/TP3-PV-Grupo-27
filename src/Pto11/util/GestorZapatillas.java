/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto11.util;

import java.util.ArrayList;
import Pto11.modelo.Zapatilla;

/**
 *
 * @author RENE
 */
public class GestorZapatillas {
    
   Zapatilla [] arreglo;

  public GestorZapatillas(){
  
  arreglo= new Zapatilla[3];
          
  }

    public Zapatilla[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Zapatilla[] arreglo) {
        this.arreglo = arreglo;
    }

    public GestorZapatillas(Zapatilla[] arreglo) {
        this.arreglo = arreglo;
    }
   
    public void agregarZapatilla(Zapatilla zapatilla, int posicion){
        arreglo[posicion] = zapatilla;
    }
    
     public void mostrarArreglo(){
        for(Zapatilla z:arreglo){
            z.mostrarDatos();
        }
    
    }
}
