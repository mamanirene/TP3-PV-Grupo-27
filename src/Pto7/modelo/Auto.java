/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto7.modelo;
import Pto7.utils.GestorAutos;

/**
 *
 * @author RENE
 */
public class Auto {
    private String patente;
    private String marca;
    private String color;
     private int modelo;
     private String tipodecombustible;

    /**public Auto() {
        patente = new String();
        marca = new String();
       color = new String();
        tipodecombustible = new String();
        
    }*/
      public Auto(String p, String m, String c, int mod,String tip ) {
        patente = p;
        marca = m;
       color = c;
       modelo= mod;
        tipodecombustible = tip;
        
    }
    
     // @return the patente
     
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
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

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tipodecombustible
     */
    public String getTipodecombustible() {
        return tipodecombustible;
    }

    /**
     * @param tipodecombustible the tipodecombustible to set
     */
    public void setTipodecombustible(String tipodecombustible) {
        this.tipodecombustible = tipodecombustible;
    }
     public void mostrarDatos(){
        System.out.println(" Patente: " + getPatente() + " Marca: "+getMarca() + " - Color: "+getColor() + " Modelo: "+getModelo() + " Tipo de combustible "+getTipodecombustible());
    
}
     
}
