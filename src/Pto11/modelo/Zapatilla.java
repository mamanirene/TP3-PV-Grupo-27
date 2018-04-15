/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto11.modelo;
import Pto11.util.GestorZapatillas;
/**
 *
 * @author RENE
 */
public class Zapatilla {
    private String marca;
    private String calidad;

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Zapatilla(String marca, String calidad) {
        this.marca = marca;
        this.calidad = calidad;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    
    public void mostrarDatos(){
    
        System.out.println(" Marca: " + getMarca() + "| Calidad: " + getCalidad());
    
    }
}
