/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej4;

/**
 *
 * @author Luis Mendoza
 */
public class Empleado {
    private String nombre,apellido;
    private int claveSocial;
    private double salarioBase;

    public Empleado(String nombre, String apellido, int claveSocial, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.claveSocial = claveSocial;
        this.salarioBase = salarioBase;
    }
    public Empleado(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getClaveSocial() {
        return claveSocial;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setClaveSocial(int claveSocial) {
        this.claveSocial = claveSocial;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", claveSocial=" + claveSocial + ", salarioBase=" + salarioBase + '}';
    }
 
   
    
    
    
}
