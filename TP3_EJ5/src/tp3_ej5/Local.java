
package tp3_ej5;

public class Local extends Inmueble {
    private int nDeVentanas;

    public Local() {
    }

    public Local(int nDeVentanas, String direccion, double nDeM2, int anios, boolean estado, double precioBase) {
        super(direccion, nDeM2, anios, estado, precioBase);
        this.nDeVentanas = nDeVentanas;
    }

    

    @Override
    public double precio() {
        double pre=this.getPrecioBase();
        if(this.getAnios()<15) pre*=0.99;
        else pre*=0.98;
        if(this.getnDeM2()>50) pre*=1.01;
        if(this.nDeVentanas<=1) pre*=0.98;
        else if(this.nDeVentanas>4) pre*=1.02;
        return pre; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
