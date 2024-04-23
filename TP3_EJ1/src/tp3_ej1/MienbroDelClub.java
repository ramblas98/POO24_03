/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej1;

/**
 *
 * @author Luis Mendoza
 */
public class MienbroDelClub {
    private int id,edad;
    private String nombre,apellidos;

    public MienbroDelClub(int id, int edad, String nombre, String apellidos) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public MienbroDelClub(){
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "MienbroDelClub{" + "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    public void concentrarse(){
    
    }
    
    public void viajar(){
    
    }
}
