/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_eje1;

import static java.lang.Math.*;

/**
 *
 * @author usuario
 */
public class Complejo {
    private double re;
    private double im;
    
    public Complejo(){
        this.re = 0;
        this.im = 0;
    }

    public Complejo(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getIm() {
        return im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }
    
    public void setIm(int im) {
        this.im = im;
    }
    
    public void inc(Complejo a){
        this.re = this.re + a.re;
        this.im = this.im + a.im;
    }
    
    public void dec(Complejo a){
        this.re = this.re - a.re;
        this.im = this.im - a.im;
    }
    
    public void por(Complejo a){
        double aux1, aux2;
        aux1= this.re;
        aux2= this.im;
        this.re = aux1 * a.re - aux2 * a.im;
        this.im = aux1 * a.im + aux2 * a.re;
    }
    
    public void div(Complejo a){
        double aux1, aux2,aux3,aux4;
        aux1= this.re;
        aux2= this.im;
        
        aux3= a.re/(pow(a.re,2)+pow(a.im,2));
        aux4= -a.im/(pow(a.re,2)+pow(a.im,2));
        
        this.re = aux1 * aux3 - aux2 * aux4;
        this.im = aux1 * aux4 + aux2 * aux3;
    }
    
    public double modulo(){
        return sqrt(pow(this.re,2)+pow(this.im,2));
    }
    
    public Complejo conjugado(){
        return new Complejo(this.re, (this.im*(-1)));
    }
    
    public static Complejo suma(Complejo a, Complejo b){
        return new Complejo(a.re+b.re,a.im+b.im);
    }
    
    public static Complejo resta(Complejo a, Complejo b){
        return new Complejo(a.re-b.re,a.im-b.im);
    }
    
    public static Complejo producto(Complejo a, Complejo b){
        return new Complejo((a.re*b.re-a.im*b.im),(a.re*b.im+a.im*b.re));
    }
    
    public static Complejo division(Complejo a, Complejo b){
        double aux1, aux2;
        
        aux1 = b.re/(pow(b.re,2)+pow(b.im,2));
        aux2= -b.im/(pow(b.re,2)+pow(b.im,2));
        return new Complejo((a.re*aux1-a.im*aux2),(a.re*aux2+a.im*aux1));
    }
    
    public void mostrar(){
        System.out.println("("+this.re+","+this.im+")" );
  
    }

    @Override
    public String toString() {
        return "("+ re +","+ im + ')';
    }
    

}
