/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_eje1;

/**
 *
 * @author usuario
 */
public class Entrenador extends MiembroEquipo{
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirPartido(){
        System.out.println("Dirigiendo partido");
    }
    
     public void dirigirEntrenamiento(){
        System.out.println("Dirigiendo entrenamiento");
    }
}
