/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej4;

/**
 *
 * @author aaronz
 */
public class EmpleadoPorComision extends Empleado {
    private double totalVentas;
    private double comisionPorVentas;
    
    public EmpleadoPorComision(String nombre, String apellido, String nroseg, double totalVentas, double comisionPorVentas){
        super(nombre, apellido,nroseg,0);
        this.totalVentas = totalVentas;
        this.comisionPorVentas = comisionPorVentas;
    }
    public double getTotalVentas(){
        return totalVentas;
    }
    public void setTotalVentas(double totalVentas){
        this.totalVentas = totalVentas;
    }
    public double getComisionPorVentas(){
        return comisionPorVentas;
    }
    public void setComisionPorVentas(double comisionPorVenta){
        this.comisionPorVentas = comisionPorVentas;
    }
    @Override
    public double calcularSalario(){
        return totalVentas * comisionPorVentas;
    }
}
