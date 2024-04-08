/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_ej1;

/**
 *
 * @author Mangel
 */
public class Complejo {
    private double real;
    private double imag;
    
    public Complejo (double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    
    public String toString () {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + (-imag) + "i";
        }
    }
    
    //metodos de instancia
    
    public Complejo suma(Complejo otro) {
        return new Complejo(this.real + otro.real, this.imag + otro.imag);
    }
    
    public Complejo resta(Complejo otro) {
        return new Complejo(this.real + otro.real, this.imag - otro.imag);
    }
    
    public Complejo multiplicacion (Complejo otro) {
        double nuevoReal = this.real * otro.real - this.imag * otro.imag;
        double nuevoImag = this.real * otro.imag + this.imag * otro.real;
        return new Complejo(nuevoReal, nuevoImag);
    }
    
    public Complejo division(Complejo otro) {
        double denominador = otro.real * otro.real + otro.imag * otro.imag;
        double nuevoReal = (this.real * otro.real + this.imag * otro.imag) / denominador;
        double nuevoImag = (this.imag * otro.real - this.real * otro.imag) / denominador;
        return new Complejo (nuevoReal, nuevoImag);
    }
    
    public double modulo () {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }
    
    public Complejo conjugado() {
        return new Complejo(this.real, -this.imag);
    }
    
    //metodos de clase
    public static Complejo suma(Complejo c1, Complejo c2) {
        return c1.suma(c2);
    }
    
    public static Complejo resta(Complejo c1, Complejo c2) {
        return c1.resta(c2);
    }
    
    public static Complejo multiplicacion(Complejo c1, Complejo c2) {
        return c1.multiplicacion(c2);
    }
    
    public static Complejo division(Complejo c1, Complejo c2) {
        return c1.division(c2);
    }
    
    public static void main(String[] args) {
        Complejo c1= new Complejo(2,3);
        Complejo c2= new Complejo(1,-1);
        
        System.out.println("Numero Complejo 1: " + c1);
        System.out.println("Numero Complejo 2: " + c2);
        
        System.out.println("Suma: " + c1.suma(c2));
        System.out.println("Resta: " + c1.resta(c2));
        System.out.println("Multiplicacion: " + c1.multiplicacion(c2));
        System.out.println("Modulo: " + c1.modulo());
        System.out.println("Conjugado: " + c1.conjugado());
        
        System.out.println("Suma: " + Complejo.suma(c1, c2));
        System.out.println("resta: " + Complejo.resta(c1, c2));
        System.out.println("Multiplicacion: " + Complejo.multiplicacion(c1, c2));
        System.out.println("Division: " + Complejo.division(c1, c2));
    }
    
}
