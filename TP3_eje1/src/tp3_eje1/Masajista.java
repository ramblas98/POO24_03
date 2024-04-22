/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_eje1;

/**
 *
 * @author mesue
 */
public class Masajista extends EquipoDeFutbol{
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(String titulacion, int aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    public Masajista(){
        
    }
    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    public void darMasaje(){
        System.out.println("anda a dar masaje capo");
    }
}

