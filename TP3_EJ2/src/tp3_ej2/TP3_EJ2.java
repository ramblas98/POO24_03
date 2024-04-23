/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ej2;
import java.util.Scanner;
/**
 *
 * @author Luis Mendoza
 */
public class TP3_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo num1 = new Vehiculo(345065,"Mercedes");
        System.out.println(num1);
        System.out.println();
        Autobuses num2 = new Autobuses(32,800);
        System.out.println(num2);
        System.out.println();
        Camion num3 = new Camion(4,5.34);
        System.out.println(num3);
        System.out.println();
        int ninios = 16;
        int jubilados = 10;
        double recau;
        
        recau = Autobuses.recaudado(num2, ninios, jubilados);
        String h = Camion.marcaYcompartimientos(num1, num3);
        
        System.out.println("Total Recaudado: " + recau);
        System.out.println();
        System.out.println(h);
        System.out.println();
        
    }

   
    
}
