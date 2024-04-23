/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej1;

/**
 *
 * @author Luis Mendoza
 */
public class Entrenador extends MienbroDelClub{
    private int idFederacion;

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public Entrenador() {
    }
    
    public Entrenador(int idFederacion,int id, int edad, String nombre, String apellidos) {
        super(id,edad,nombre,apellidos);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    
    public void dirigirPartido(){
    }
    public void entrenamiento(){
    }
    
}
