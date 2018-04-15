/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto6.utils;
import Pto6.modelo.Rectangulo;
import java.util.ArrayList;
//import java.util.List;
/**
 *
 * @author RENE
 */
public class GestorRectangulos {
    public ArrayList<Rectangulo>rectangulos= new ArrayList();
    

    
      public void cargarRectangulo(Rectangulo nuevorectangulo) {
          this.rectangulos.add(nuevorectangulo);
        
        
    }
    
    public void eliminar(int posicion){
        
       this.rectangulos.remove(posicion);
    }

    /**
     * @return the rectangulos
     */
    public ArrayList<Rectangulo> getRectangulos() {
        return rectangulos;
    }

    /**
     * @param rectangulos the rectangulos to set
     */
    public void setRectangulos(ArrayList<Rectangulo> rectangulos) {
        this.rectangulos = rectangulos;
    }
     
     
     

   
    
}
