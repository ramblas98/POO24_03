/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej2;

/**
 *
 * @author Luis Mendoza
 */
public class Camion extends Vehiculo{
    private int compartimentos;
    private double capacidadDeCarga;

    public Camion(int compartimentos, double capacidadDeCarga) {
        this.compartimentos = compartimentos;
        this.capacidadDeCarga = capacidadDeCarga;
    }
    public Camion(){
    }
    public Camion(int compartimentos, double capacidadDeCarga,int patente, String marca) {
        super(patente,marca);
        this.compartimentos = compartimentos;
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getCompartimentos() {
        return compartimentos;
    }

    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCompartimentos(int compartimentos) {
        this.compartimentos = compartimentos;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public String toString() {
        return "Camion{" + "compartimentos=" + compartimentos + ", capacidadDeCarga=" + capacidadDeCarga + '}';
    }
    
    public static double CantPesoComp(Camion a){
        double peso;
        peso = a.capacidadDeCarga / a.compartimentos; 
        return peso;
    }
    
    public static String marcaYcompartimientos(Vehiculo a,Camion b){
      String j = "Marca: ";
      j += a.getMarca();
      j += " - Compartimentos: ";
      j += b.compartimentos;
      
      return j;
    
    }
}
