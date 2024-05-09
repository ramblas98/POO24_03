
package tp3_ej4;


public class EmplPorCom extends Empleado{

    public EmplPorCom() {
    }

    public EmplPorCom(String nombre, String ape, int ndeSegSoc, double totalVentas, double comisionVentas) {
        super(nombre, ape, ndeSegSoc, totalVentas, comisionVentas, 0);
    }

    
    
    @Override
    public double salario() {
        return this.getComisionVentas()*this.getTotalVentas();
        
    }
}
