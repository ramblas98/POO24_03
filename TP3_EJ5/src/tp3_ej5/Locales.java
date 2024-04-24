/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej5;

/**
 *
 * @author Luis Mendoza
 */
public class Locales extends Inmuebles{
    private int numVentanas;

    public Locales(int numVentanas) {
        this.numVentanas = numVentanas;
    }
    
    public Locales() {
    }
    
    public Locales(String direccion, String estado, int edadInmueble, double metrosCuadrados, double precioBase, int numVentanas) {
        super(direccion,estado,edadInmueble,metrosCuadrados,precioBase);
        this.numVentanas = numVentanas;
    }

    public void setNumVentanas(int numVentanas) {
        this.numVentanas = numVentanas;
    }

    public int getNumVentanas() {
        return numVentanas;
    }

    @Override
    public String toString() {
        return "Locales{" + "numVentanas=" + numVentanas + '}';
    }
    
    public void precioLocal(){
        double a = this.getPrecioBase() * 0.001;
        double b = this.getPrecioBase() * 0.002;
        if(this.getMetrosCuadrados()>50 ){
            this.setPrecioFinal(this.getPrecioFinal() + a);
        }
        if(this.numVentanas<=1){
            this.setPrecioFinal(this.getPrecioFinal() - b);
        }
        if(this.numVentanas>4){
            this.setPrecioFinal(this.getPrecioFinal() + b);
        }
    }
    public void mostrarLocal(){
    System.out.println("Imformacion del piso: ");
    System.out.println("*Direccion: " + this.getDireccion());
    System.out.println("*Estado: " + this.getEstado());
    System.out.println("*Edad del Inmueble: " + this.getEdadInmueble());
    System.out.println("*Metros Cuadrados: " + this.getMetrosCuadrados());
    System.out.println("*Numero de ventanas: " + this.numVentanas);
    System.out.println("*PrecioBase: " + this.getPrecioBase());
    System.out.println("*Precio Final: " + this.getPrecioFinal());
    }
    
}
