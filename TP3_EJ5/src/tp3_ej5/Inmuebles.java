/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej5;

/**
 *
 * @author Luis Mendoza
 */
public class Inmuebles {
    private String direccion,estado;
    private int edadInmueble;
    private double metrosCuadrados,precioBase,precioFinal;

    public Inmuebles(String direccion, String estado, int edadInmueble, double metrosCuadrados, double precioBase) {
        this.direccion = direccion;
        this.estado = estado;
        this.edadInmueble = edadInmueble;
        this.metrosCuadrados = metrosCuadrados;
        this.precioBase = precioBase;
    }
    
    public Inmuebles(){
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstado() {
        return estado;
    }

    public int getEdadInmueble() {
        return edadInmueble;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    
    

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEdadInmueble(int edadInmueble) {
        this.edadInmueble = edadInmueble;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    
    

    @Override
    public String toString() {
        return "Inmuebles{" + "direccion=" + direccion + ", estado=" + estado + ", edadInmueble=" + edadInmueble + ", metrosCuadrados=" + metrosCuadrados + ", precioBase=" + precioBase + '}';
    }
    
    
    public void precioInmueble(){
       double a = this.precioBase * 0.01;
       double b = this.precioBase * 0.02;
       if(this.edadInmueble<15){
            this.setPrecioFinal(this.precioBase - a);
       }
       else {
            this.setPrecioFinal(this.precioBase);
       }
    }
    
}
