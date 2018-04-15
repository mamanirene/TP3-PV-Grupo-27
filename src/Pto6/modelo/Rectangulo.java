/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pto6.modelo;

/**
 *
 * @author RENE
 */
public class Rectangulo {
    private double base;
    private double altura;
    private double superficie;
    private double perimetro;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
      //  this.superficie = superficie;
       // this.perimetro = perimetro;
    }

    public Rectangulo() {
    }
    

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return base*altura;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return 2*base + 2*altura;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
}
