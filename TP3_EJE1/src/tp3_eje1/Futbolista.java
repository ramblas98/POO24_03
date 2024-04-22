/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_eje1;

/**
 *
 * @author usuario
 */
public class Futbolista extends MiembroEquipo{
    private String puesto;
    private double peso;

    public Futbolista() {
    }

    public Futbolista(String puesto, double peso, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.puesto = puesto;
        this.peso = peso;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void jugarPartido(){
        System.out.println("Jugador en juego");
    }
    
}
