/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej2;

/**
 *
 * @author Luis Mendoza
 */
public class Autobuses extends Vehiculo {
    private int asientos;
    private double prePorAsient;

    public Autobuses(int asientos, double prePorAsient) {
        this.asientos = asientos;
        this.prePorAsient = prePorAsient;
    }
    public Autobuses(){
    }
    
    public Autobuses(int asientos, double prePorAsient,int patente, String marca) {
        super(patente,marca);
        this.asientos = asientos;
        this.prePorAsient = prePorAsient;
    }

    public int getAsientos() {
        return asientos;
    }

    public double getPrePorAsient() {
        return prePorAsient;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setPrePorAsient(double prePorAsient) {
        this.prePorAsient = prePorAsient;
    }

    @Override
    public String toString() {
        return "Autobuses{" + "asientos=" + asientos + ", prePorAsient=" + prePorAsient + '}';
    }
    
    public static double recaudado(Autobuses a,int ninios,int jubilados){
    double total;
    double adults = a.asientos - ninios - jubilados; 
    double ni = a.prePorAsient - (a.prePorAsient * 0.75);
    double jub = a.prePorAsient * 0.5;
    total = (ni * ninios) + (jub * jubilados) + (adults * a.prePorAsient);
    
    return total;
    } 
}
