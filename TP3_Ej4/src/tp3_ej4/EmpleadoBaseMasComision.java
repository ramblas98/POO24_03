/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej4;

/**
 *
 * @author aaronz
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String nombre, String apellido, String nroseg, double totalVentas, double comisionPorVentas, double salarioBase){
        super(nombre, apellido, nroseg, totalVentas, comisionPorVentas);
        this.salarioBase = salarioBase;
    }
    @Override
    public double calcularSalario(){
        return super.calcularSalario() + salarioBase;
    }
}
