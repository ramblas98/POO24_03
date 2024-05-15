
package tp3_ej5;

public class Inmueble {
    private String direccion;
    private double nDeM2;
    private int anios;
    private boolean estado;
    private double precioBase;

    public Inmueble() {
    }

    public Inmueble(String direccion, double nDeM2, int anios, boolean estado, double precioBase) {
        this.direccion = direccion;
        this.nDeM2 = nDeM2;
        this.anios = anios;
        this.estado = estado;
        this.precioBase = precioBase;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getnDeM2() {
        return nDeM2;
    }

    public int getAnios() {
        return anios;
    }

    public boolean isEstado() {
        return estado;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setnDeM2(double nDeM2) {
        this.nDeM2 = nDeM2;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    public double precio(){
        return 0;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "direccion=" + direccion + ", nDeM2=" + nDeM2 + ", anios=" + anios + ", estado=" + estado + ", precioBase=" + precioBase + '}';
    }
    
    
    
    
    
}
