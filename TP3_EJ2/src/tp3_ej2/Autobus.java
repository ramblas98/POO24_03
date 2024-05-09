
package tp3_ej2;

public class Autobus extends Vehiculo {
    private int numAsientos;
    private double precioAsiento;

    public Autobus(int numAsientos, double precioAsiento,  String patente, String marca) {
        super(patente, marca);
        this.numAsientos = numAsientos;
        this.precioAsiento = precioAsiento;
    }
    
    public double totalRecaudado(int cantTotal, int ninios, int jubilados){
        double recau =0;
        recau += 0.25*precioAsiento*ninios + 0.5*precioAsiento*jubilados;
        cantTotal = cantTotal - ninios - jubilados;
        recau += cantTotal*precioAsiento;
        return recau;
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
        final Autobus other = (Autobus) obj;
        if (this.numAsientos != other.numAsientos) {
            return false;
        }
        return Double.doubleToLongBits(this.precioAsiento) == Double.doubleToLongBits(other.precioAsiento);
    }
    
    @Override
    public String toString() {
        return "Autobus{" + "numAsientos=" + numAsientos + ", precioAsiento= $" + precioAsiento + '}';
    }
    
}
