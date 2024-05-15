
package tp3_ej4;


public class EmplPorCom extends Empleado{
    private String color;
    public EmplPorCom() {
    }

    public EmplPorCom(String nombre, String ape, int ndeSegSoc, double totalVentas, double comisionVentas) {
        super(nombre, ape, ndeSegSoc, totalVentas, comisionVentas, 0);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    @Override
    public double salario() {
        return this.getComisionVentas()*this.getTotalVentas();
        
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.print(" color de camisa del empleado: "+color+".");
        System.out.println(" ");
    }
    
    
}
