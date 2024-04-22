/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_eje1;

/**
 *
 * @author mesue
 */
public class Entrenador extends EquipoDeFutbol {
    private int idFederacion;

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    public Entrenador(){
        
    }
    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido(){
        System.out.println("anda a dirigir capo");
    }
    public void dirigirEntrenamiento(){
        System.out.println("anda a dirigir capo");
    }
}
