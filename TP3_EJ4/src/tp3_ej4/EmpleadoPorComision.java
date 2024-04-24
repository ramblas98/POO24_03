/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej4;

/**
 *
 * @author Luis Mendoza
 */
public class EmpleadoPorComision extends Empleado{
    private double totalVentas,comision;

    public EmpleadoPorComision(double totalVentas, double comision) {
        this.totalVentas = totalVentas;
        this.comision = comision;
    }
    public EmpleadoPorComision(){
    }
    public EmpleadoPorComision(String nombre, String apellido, int claveSocial,double totalVentas, double comision) {
        super(nombre,apellido,claveSocial,0);
        this.totalVentas = totalVentas;
        this.comision = comision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public double getComision() {
        return comision;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "EmpledoPorComision{" + "totalVentas=" + totalVentas + ", comision=" + comision + '}';
    }
    public void mostrar(){
    System.out.println("Datos Del Empleado Por Comision: ");
    System.out.println("*Nombre: " + this.getNombre());
    System.out.println("*Apellido: " + this.getApellido());
    System.out.println("*Clave Social: " + this.getClaveSocial());
    System.out.println("*Sueldo Base: " + this.getSalarioBase());
    System.out.println("*Total Ventas: " + this.totalVentas);
    System.out.println("*Comision: " + this.comision);
    }
    
    public void sueldo(){
    double a = this.comision / 100;
    this.setSalarioBase(a * this.totalVentas);
    }
    
    // (⁠◍⁠•⁠ᴗ⁠•⁠◍⁠)
    
}  
