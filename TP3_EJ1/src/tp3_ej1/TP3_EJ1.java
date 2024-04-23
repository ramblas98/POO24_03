/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ej1;

/**
 *
 * @author Luis Mendoza
 */
public class TP3_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MienbroDelClub pers0 = new MienbroDelClub(345678,34,"Luis","Mendoza");
        System.out.println(pers0);
        System.out.println();
        Masajista pers1 = new Masajista("Fisioterapeuta",18);
        System.out.println(pers1);
        System.out.println();
        Futbolista pers2 = new Futbolista(71,"Lateral Izquierdo");
        System.out.println(pers2);
        System.out.println();
        Entrenador pers3 = new Entrenador(456249);
        System.out.println(pers3);
        System.out.println();
    }
    
}
