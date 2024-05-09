
package tp3_ej4;

public class EmplBmasCom extends Empleado{

    public EmplBmasCom() {
    }

    public EmplBmasCom(String nombre, String ape, int ndeSegSoc, double totalVentas, double comisionVentas, double salarioBase) {
        super(nombre, ape, ndeSegSoc, totalVentas, comisionVentas, salarioBase);
    }

    @Override
    public double salario() {
        return (this.getSalarioBase()+this.getComisionVentas()*this.getTotalVentas());
    }
    
}
