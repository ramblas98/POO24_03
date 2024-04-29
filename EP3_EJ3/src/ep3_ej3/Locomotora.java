package ep3_ej3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Locomotora {
    
     private double peso;
     private double pesoMaximoArrastre;
     private double velocidadMaxima;
     
     
     
     public Locomotora(){
         
     }
     
     public Locomotora(double peso, double pesoMaximoArrastre,double velocidadMaxima){
        this.peso =peso;
        this.pesoMaximoArrastre = pesoMaximoArrastre;
        this.velocidadMaxima = velocidadMaxima;
     }
     
    
    public double arrastreUtil() {
        return pesoMaximoArrastre - peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPesoMaximoArrastre(){
        return pesoMaximoArrastre;
    }
    
    public void setPesoMaximoArrastre(double pesoMaximoArrastre){
        this.pesoMaximoArrastre = pesoMaximoArrastre;
    }
    
    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
    public void setVelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    
    
   
}
