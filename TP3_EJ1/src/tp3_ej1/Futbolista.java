/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej1;

/**
 *
 * @author Luis Mendoza
 */
public class Futbolista extends MienbroDelClub{
    private double peso;
    private String puesto;

    public Futbolista(double peso, String puesto) {
        this.peso = peso;
        this.puesto = puesto;
    }
    
    public Futbolista(){
    }
    
    public Futbolista(double peso, String puesto,int id, int edad, String nombre, String apellidos) {
        super(id,edad,nombre,apellidos);
        this.peso = peso;
        this.puesto = puesto;
    }

    public double getPeso() {
        return peso;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "peso=" + peso + ", puesto=" + puesto + '}';
    }
     
    public void jugarPartido(){
    
    }
}
