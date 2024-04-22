/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_eje2;

/**
 *
 * @author usuario
 */

public class Autobus extends Vehiculo{
    private int asientos;
    private double precioAsiento;

    public Autobus() {
    }

    public Autobus(int asientos, double precioAsiento) {
        this.asientos = asientos;
        this.precioAsiento = precioAsiento;
    }

    public Autobus(int asientos, double precioAsiento, String patente, String marca) {
        super(patente, marca);
        this.asientos = asientos;
        this.precioAsiento = precioAsiento;
    }

    public int getAsientos() {
        return asientos;
    }

    public double getPrecioAsiento() {
        return precioAsiento;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setPrecioAsiento(double precioAsiento) {
        this.precioAsiento = precioAsiento;
    }
    
    public double recaudacion(int ninios,int adultos,int jubilados){
        return ninios*this.precioAsiento*0.75+adultos*this.precioAsiento + jubilados*this.precioAsiento*0.5;
    }

    @Override
    public String toString() {
        return "Autobus{" + "asientos=" + asientos + ", precioAsiento=" + precioAsiento + '}';
    }
    
    
}