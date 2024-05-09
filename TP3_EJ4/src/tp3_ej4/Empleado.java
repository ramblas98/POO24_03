
package tp3_ej4;

public class Empleado {
    private String nombre, ape;
    private int ndeSegSoc;
    private double totalVentas, comisionVentas, salarioBase;

    public Empleado() {
    }

    public Empleado(String nombre, String ape, int ndeSegSoc, double totalVentas, double comisionVentas, double salarioBase) {
        this.nombre = nombre;
        this.ape = ape;
        this.ndeSegSoc = ndeSegSoc;
        this.totalVentas = totalVentas;
        this.comisionVentas = comisionVentas;
        this.salarioBase = salarioBase;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApe() {
        return ape;
    }

    public int getNdeSegSoc() {
        return ndeSegSoc;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public double getComisionVentas() {
        return comisionVentas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void setNdeSegSoc(int ndeSegSoc) {
        this.ndeSegSoc = ndeSegSoc;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public void setComisionVentas(double comisionVentas) {
        this.comisionVentas = comisionVentas;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double salario(){
        return 0;
        //
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", ape=" + ape + ", ndeSegSoc=" + ndeSegSoc + " salario = $"+this.salario()+'}';
    }
    
    
}
