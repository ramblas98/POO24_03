/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej6;

/**
 *
 * @author aaronz
 */
public class VCarga extends Vagon {
    private double cargaMaxima;
    
    public VCarga(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }
    public double getCargaMaxima(){
        return cargaMaxima;
    }
    public void setCargaMaxima(){
        this.cargaMaxima = cargaMaxima;
    }
    @Override
    public double pesoMaximo(){
        return (this.getCargaMaxima() + 160);
    }
}
