/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ej4;

/**
 *
 * @author Luis Mendoza
 */
public class TP3_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoPorComision num1 = new EmpleadoPorComision("Luis","Mendoza",234577,2636980.56,16.4);
        num1.sueldo();
        num1.mostrar();
        System.out.println();
        
        EmpleadoPorComision num2 = new EmpleadoPorComision("Denzel","washington",167597,2336980.73,14.9);
        num2.sueldo();
        num2.mostrar();
        System.out.println();
        
        EmpleadoBaseMasComision num3 = new EmpleadoBaseMasComision("Andrew","Garfield",127495,315000,2736980.44,13.2);
        num3.sueldo2();
        num3.mostrar2();
        System.out.println();
        
        EmpleadoBaseMasComision num4 = new EmpleadoBaseMasComision("Robert","Downey Jr.",107525,360000,2836980.80,17.1);
        num4.sueldo2();
        num4.mostrar2();
        System.out.println();
        
    }
    
}
