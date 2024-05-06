/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ej4;
import java.util.Scanner;
/**
 *
 * @author aaronz
 */
public class TP3_Ej4 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoPorComision empComision1 = new EmpleadoPorComision("Mica","Perez","123-45-6789",10000,0.5);
        EmpleadoPorComision empComision2 = new EmpleadoPorComision("Aaron","Zerda","43-949",150000,0.3);
        EmpleadoBaseMasComision empBaseComision1 = new EmpleadoBaseMasComision("Carlos","Lopez","45-67",20000,0.04,2000);
        EmpleadoBaseMasComision empBaseComision2 = new EmpleadoBaseMasComision("Danna","Zerda","54-32",25000,0.02,2500);
        System.out.println("Nombre\tSalario");
        System.out.println("----------------");
        System.out.println(empComision1.getNombre() + "\t" + empComision1.calcularSalario());
        System.out.println(empComision2.getNombre() + "\t" + empComision2.calcularSalario());
        System.out.println(empBaseComision1.getNombre() + "\t" + empBaseComision1.calcularSalario());
        System.out.println(empBaseComision2.getNombre() + "\t" + empBaseComision2.calcularSalario());
    }
    
}
