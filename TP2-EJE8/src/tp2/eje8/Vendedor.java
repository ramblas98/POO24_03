/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.eje8;

/**
 *
 * @author usuario
 */
public class Vendedor {
    private Persona datoPersona;
    private int legajo;
    private String zonaDeVenta;
    private double ventasMensuales[];

    public Vendedor() {
        int i;
        this.legajo = -1;
        this.zonaDeVenta = "\0";
        this.ventasMensuales = new double[12];
        for(i=0;i<12;i++) this.ventasMensuales[i+1]= 0;
    }

    public Vendedor(Persona datoPersona, int legajo, String zonaDeVenta) {
        int i;
        this.ventasMensuales = new double[12];
        this.datoPersona = datoPersona;
        this.legajo = legajo;
        this.zonaDeVenta = zonaDeVenta;
        for(i=0;i<12;i++) this.ventasMensuales[i]= 0;
    }

    public Persona getDatoPersona() {
        return datoPersona;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getZonaDeVenta() {
        return zonaDeVenta;
    }

    public double getVentasMensual(int mes) {
        return this.ventasMensuales[mes];
    }

    public void setDatoPersona(Persona datoPersona) {
        this.datoPersona = datoPersona;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setZonaDeVenta(String zonaDeVenta) {
        this.zonaDeVenta = zonaDeVenta;
    }

    public void setVentasMensuales(double ventaMes, int pos) {
        this.ventasMensuales[pos] = ventaMes;
    }
    
    
    //@SuppressWarnings("empty-statement")
    public double totalAnual(){
        int i;
        double total=0;
        for(i=0;i<12;i++){
            total = total + this.ventasMensuales[i+1];
        }
        return total;
    }
    
    public double comision(){
        if(totalAnual()<50000) return 0;
        if(totalAnual()>=50000 && totalAnual()<75000) return totalAnual()*0.15;
        if (totalAnual()>=75000 && totalAnual()<100000) return totalAnual()*0.20;
        if(totalAnual()>=100000) return totalAnual()*0.3;
        return 0;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "datoPersona=" + datoPersona + ", legajo=" + legajo + ", zonaDeVenta=" + zonaDeVenta + ", ventaTotal" + this.totalAnual() + '}';
    }
    
    
}
