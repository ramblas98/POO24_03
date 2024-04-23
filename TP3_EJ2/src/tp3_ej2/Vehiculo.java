/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej2;

import java.util.Objects;

/**
 *
 * @author Luis Mendoza
 */
public class Vehiculo {
    private int patente;
    private String marca;

    public Vehiculo(int patente, String marca) {
        this.patente = patente;
        this.marca = marca;
    }
    public Vehiculo(){
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + '}';
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (this.patente != other.patente) {
            return false;
        }
        return Objects.equals(this.marca, other.marca);
    }
    
    
}
