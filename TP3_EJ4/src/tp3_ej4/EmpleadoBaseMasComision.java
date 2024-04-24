/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej4;

/**
 *
 * @author Luis Mendoza
 */
public class EmpleadoBaseMasComision extends  Empleado{
    private double comi,ventasT;

    public EmpleadoBaseMasComision(double comi, double ventasT) {
        this.comi = comi;
        this.ventasT = ventasT;
    }
    public EmpleadoBaseMasComision() {
    }
    public EmpleadoBaseMasComision(String nombre, String apellido, int claveSocial,double salarioBase, double comi, double ventasT) {
        super(nombre,apellido,claveSocial,salarioBase);
        this.comi = comi;
        this.ventasT = ventasT;
    }

    public double getComi() {
        return comi;
    }

    public double getVentasT() {
        return ventasT;
    }

    public void setComi(double comi) {
        this.comi = comi;
    }

    public void setVentasT(double ventasT) {
        this.ventasT = ventasT;
    }

    @Override
    public String toString() {
        return "EmpleadoBaseMasComision{" + "comi=" + comi + ", ventasT=" + ventasT + '}';
    }
    public void mostrar2(){
    System.out.println("Datos Del Empleado Base Mas Comision: ");
    System.out.println("*Nombre: " + this.getNombre());
    System.out.println("*Apellido: " + this.getApellido());
    System.out.println("*Clave Social: " + this.getClaveSocial());
    System.out.println("*Sueldo Base: " + this.getSalarioBase());
    System.out.println("*Total Ventas: " + this.comi);
    System.out.println("*Comision: " + this.ventasT);
    }
    
    public void sueldo2(){
    double a = this.comi / 100;
    this.setSalarioBase((a *  this.ventasT) + this.getSalarioBase());
    }
}
