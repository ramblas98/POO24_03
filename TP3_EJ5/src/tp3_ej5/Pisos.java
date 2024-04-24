/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej5;

/**
 *
 * @author Luis Mendoza
 */
public class Pisos extends Inmuebles{
    private int numPiso;

    public Pisos(int numPiso) {
        this.numPiso = numPiso;
    }
    
    public Pisos() {
    }
    
    public Pisos(String direccion, String estado, int edadInmueble, double metrosCuadrados, double precioBase, int numPiso) {
        super(direccion,estado,edadInmueble,metrosCuadrados,precioBase);
        this.numPiso = numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    public int getNumPiso() {
        return numPiso;
    }

    @Override
    public String toString() {
        return "Pisos{" + "numPiso=" + numPiso + '}';
    }
    
    public void precioPiso(){
        double a = this.getPrecioBase() * 0.03;
        if(this.numPiso>=3){
            this.setPrecioFinal(this.getPrecioFinal() + a);
        }
    }
    
    public void mostrarPiso(){
    System.out.println("Imformacion del piso: ");
    System.out.println("*Direccion: " + this.getDireccion());
    System.out.println("*Estado: " + this.getEstado());
    System.out.println("*Edad del Inmueble: " + this.getEdadInmueble());
    System.out.println("*Metros Cuadrados: " + this.getMetrosCuadrados());
    System.out.println("*Numero de piso: " + this.numPiso);
    System.out.println("*PrecioBase: " + this.getPrecioBase());
    System.out.println("*Precio Final: " + this.getPrecioFinal());
    }
}
