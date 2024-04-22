/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_eje1;

/**
 *
 * @author mesue
 */
public class Futbolista extends EquipoDeFutbol{
    private String puseto;
    private double peso;

    public Futbolista(String puseto, double peso){
        this.puseto = puseto;
        this.peso = peso;
    }
    public Futbolista(){
        
    }
    public String getPuseto() {
        return puseto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPuseto(String puseto) {
        this.puseto = puseto;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void jugarPartido(){
        System.out.println("anda a jugar capo");
    }
}

