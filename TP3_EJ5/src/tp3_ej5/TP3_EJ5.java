/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ej5;

/**
 *
 * @author Luis Mendoza
 */
public class TP3_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pisos num1 = new Pisos("Espana 1045","Nuevo",0,25,230455.43,4);
        num1.precioInmueble();
        num1.precioPiso();
        num1.mostrarPiso();
        System.out.println();
        
        
        Locales num2 = new Locales("La madrid 145","Usado",16,52,603678.2,8);
        num2.precioInmueble();
        num2.precioLocal();
        num2.mostrarLocal();
        System.out.println();
    }
    
}
