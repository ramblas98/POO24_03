/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej6;

/**
 *
 * @author aaronz
 */
public class Locomotora {
    private int peso,pesoMaximo,velocidadMaxima;
    
    public Locomotora(int peso, int pesoMaximo, int velocidadMaxima){
        this.peso = peso;
        this.pesoMaximo = pesoMaximo;
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getPeso(){
        return peso;
    }       
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPesoMaximo(){
        return pesoMaximo;
    }
    public void setPesoMaximo(int pesoMaximo){
        this.pesoMaximo = pesoMaximo;
    }
    
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public double arrastreUtil(){
        return (this.pesoMaximo - this.peso);
    }
}
