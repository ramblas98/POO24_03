/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej4;

/**
 *
 * @author aaronz
 */
public class Empleado {
    private String nombre, apellido,nroseg;
    private double salarioBase;
    
    public Empleado(String nombre, String apellido, String nroseg,double salarioBase){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroseg = nroseg;
        this.salarioBase = salarioBase;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getNroSeg(){
        return nroseg;
    }
    public void setNroSeg(String nroseg){
        this.nroseg = nroseg;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salariobase){
        this.salarioBase = salariobase;
    }
    public double calcularSalario(){
        return salarioBase;
    }
}
