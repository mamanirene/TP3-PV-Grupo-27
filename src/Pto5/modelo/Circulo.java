/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pto5.modelo;

import java.math.MathContext;

/**
 *
 * @author RENE
 */
public class Circulo {
    
    private double radio;
    private String color;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double obtenerSuperficie(){
    
    double sup;
    
   double rad=this.radio;
    sup= 3.14 * Math.pow(rad, 2);
   return sup ;
     
    
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
