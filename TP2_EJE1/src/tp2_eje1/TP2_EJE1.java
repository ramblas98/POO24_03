/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_eje1;

import java.util.*;
/**
 *
 * @author usuario
 */
public class TP2_EJE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner teclado = new Scanner(System.in);
        double x,y;
        
        //x = teclado.nextDouble();
        //y = teclado.nextDouble();
        x = 5;
        y = -1;
        
        Complejo com1= new Complejo(x,y);
        System.out.println("Complejo 1: ");
        com1.mostrar();
        System.out.println("Conjugado "+ com1.conjugado());
        System.out.println("Modulo " + com1.modulo());
        
        x=2;
        y=3;
        
        Complejo com2= new Complejo(x,y);
        System.out.println("Complejo 2: ");
        com2.mostrar();
        System.out.println("Conjugado "+ com2.conjugado());
        System.out.println("Modulo " + com2.modulo());
        
        x=1;
        y=-2;
        
        Complejo com3= new Complejo(x,y);
        System.out.println("Complejo 3: ");
        com3.mostrar();
        System.out.println("Conjugado "+ com3.conjugado());
        System.out.println("Modulo " + com3.modulo());
        
        System.out.println("Suma de com1 y com2 "+ Complejo.suma(com1,com2));
        System.out.println("Resta de com1 y com2 "+ Complejo.resta(com1,com2));
        System.out.println("Producto de com1 y com2 "+ Complejo.producto(com1,com2));
        System.out.println("Division de com1 y com2 "+ Complejo.division(com1,com2));
        
        System.out.println("com1 inc com2 ");
        com1.inc(com2);
        com1.mostrar();
        System.out.println("com1 dec com2 ");
        com1.dec(com2);
        com1.mostrar();
        System.out.println("com1 inc com3 ");
        com1.inc(com3);
        com1.mostrar();
        System.out.println("com1 dec com3 ");
        com1.dec(com3);
        com1.mostrar();
        
        System.out.println("com1 por com2 ");
        com1.por(com2);
        com1.mostrar();
        System.out.println("com1 div com2 ");
        com1.div(com2);
        com1.mostrar();
        System.out.println("com2 por com3 ");
        com2.por(com3);
        com2.mostrar();
        System.out.println("com2 dec com3 ");
        com2.div(com3);
        com2.mostrar();
    }
    
}
