/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_eje2;

import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Camion extends Vehiculo{
    private int capacidadCarga;
    private int cantCompartimientos;
    private double cargaDividida[];

    public Camion() {
        this.cargaDividida = new double[1];
        Arrays.fill(cargaDividida, 0, 0, 0);
    }

    public Camion(int capacidadCarga, int cantCompartimientos, double[] cargaDividida) {
        this.capacidadCarga = capacidadCarga;
        this.cantCompartimientos = cantCompartimientos;
        this.cargaDividida = new double[cantCompartimientos];
        
        Arrays.fill(cargaDividida, 0, cantCompartimientos, 0);
    }

    public Camion(int capacidadCarga, int cantCompartimientos, double[] cargaDividida, String patente, String marca) {
        super(patente, marca);
        this.capacidadCarga = capacidadCarga;
        this.cantCompartimientos = cantCompartimientos;
        this.cargaDividida = cargaDividida;
         Arrays.fill(cargaDividida, 0, cantCompartimientos, 0);
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public int getCantCompartimientos() {
        return cantCompartimientos;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void setCantCompartimientos(int cantCompartimientos) {
        this.cantCompartimientos = cantCompartimientos;
    }
    
    public void agregarCarga(int nroCompartimiento,double pesoCarga){
        this.cargaDividida[nroCompartimiento] = pesoCarga;
    }

    @Override
    public String toString() {
        return "Camion{" + "marca = " + this.getMarca() + ", cantCompartimientos=" + cantCompartimientos + '}';
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
        final Camion other = (Camion) obj;
        if (this.capacidadCarga != other.capacidadCarga) {
            return false;
        }
        if (this.cantCompartimientos != other.cantCompartimientos) {
            return false;
        }
        return Arrays.equals(this.cargaDividida, other.cargaDividida);
    }
   
}
