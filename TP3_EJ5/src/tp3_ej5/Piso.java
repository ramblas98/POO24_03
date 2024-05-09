
package tp3_ej5;

public class Piso extends Inmueble {
     private int nDePiso;

    public Piso() {
    }

    public Piso(String direccion, double nDeM2, int anios, boolean estado, double precioBase) {
        super(direccion, nDeM2, anios, estado, precioBase);
    }

    @Override
    public double precio(){
        double pre=this.getPrecioBase();
        if(this.getAnios()<15) pre*=0.99;
        else pre*=0.98;
        if(this.nDePiso>=3) pre*=1.03;
        
        return pre;
    }
    
}
