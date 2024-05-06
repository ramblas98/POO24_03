/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej6;

/**
 *
 * @author aaronz
 */
public class VPasajero extends Vagon {
    private double largo, ancho;
    
    public VPasajero(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    public double getAncho(){
        return ancho;
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public double getLargo(){
        return largo;
    }
    public void setLargo(double largo){
        this.largo = largo;
    }
    @Override
    public int cantidadPasajeros(){
        double cant;
        if(this.ancho <= 2.5){
            cant = this.largo * 8;
        }
        else cant = this.largo *10;
        return (int) cant;
    }
    @Override
    public double pesoMaximo(){
        return (this.cantidadPasajeros() * 80);
    }
    
}
