
package tp3_ej2;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private int compartimientos;

    public Camion(double capacidadCarga, int compartimientos, String patente, String marca) {
        super(patente, marca);
        this.capacidadCarga = capacidadCarga;
        this.compartimientos = compartimientos;
    }
    
    public void pesoPorComparti(){
        System.out.println("La capacidad de peso o carga por compartimiento del camion es de "+(capacidadCarga*1000)/compartimientos +" kg.");
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
        if (Double.doubleToLongBits(this.capacidadCarga) != Double.doubleToLongBits(other.capacidadCarga)) {
            return false;
        }
        return this.compartimientos == other.compartimientos;
    }
    
    public String mostrarCamion(){
        return "Camion "+this.getMarca()+" de "+ compartimientos +" compartimientos";
    }
}
