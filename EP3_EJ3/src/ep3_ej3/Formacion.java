package ep3_ej3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alumno
 */
public class Formacion {
    
    private ArrayList<Vagon> misV;
    private ArrayList<Locomotora> misL;
    
    private Formacion(){
        this.misV = new ArrayList();
        this.misL = new ArrayList();
    }
    
    private Formacion(Vagon v,Locomotora L){
        misV.add(v);
        misL.add(L);
        
    }
    
    
    
    
    public int totalPasajeros() {
        int t=0;
        for (Vagon v: misV) {
            t += v.cantidadPasajeros;
        }
        return t;
    }
    
    public int cantidadVLivianos(){
        int c=0;
        for(Vagon v: misV){
            if(v.pesoMaximo()<2500) {
                c ++;
            }
            
        }
        return c;
      
    }
    
    
    public double empuje() {
     double k=0;
     double total=0;
     double total1=0;
     if (this.puedeMoverse() == true) {
         return 0;
     } else {
         for(Vagon v: misV) {
             total += v.pesoMaximo();
         }
        for (Locomotora L: misL) {
            total1 += L.arrastreUtil();
        }
        k= total - total1;
        return k;
     }
    }
    
    public boolean puedeMoverse() {
        double p=0; 
        double m=0; boolean b=false;
        for(Vagon v: misV) {
            p+= v.pesoMaximo();
        }
        for(Locomotora L: misL) {
            m += L.arrastreUtil();
        }
        
        if(p<m) b=true;
        return b;
        
    }
    
    public boolean esEficiente() {
        boolean band= true;
        for(Locomotora loc: misL){
            if(loc.getPesoMaximoArrastre()<5* loc.getPeso()) band=false;
            
        }
        return band;
    }
    
    public double velocidadMaxima() {
        double men=0;
        for(Locomotora l: misL) {
            if(l.getVelocidadMaxima()<men) {
                men=l.getVelocidadMaxima();
            }
            
            
        }
        return men;
    }
    
    public Vagon masPesado(){
        double may=0;
        Vagon Vmay = new Vagon();
        
        for (Vagon v: misV){
            if(v.pesoMaximo()>may){
                may=v.pesoMaximo();
                Vmay=v;
            }
        }
        return Vmay;
    }
    
    public boolean esCompleja(){
        boolean t=false;
        
        int cantLocomotoras = this.misL.size();
        int cantVagones = this.misV.size();
        if((cantLocomotoras + cantVagones)>20) t= true;
        int pesoTotal =0;
        for (Locomotora l: misL ){
            pesoTotal += l.getPeso();
        }
        
        for(Vagon v: misV){
            pesoTotal += v.pesoMaximo();
        }
        if(pesoTotal>10000) t= true;
        
        return t;
    }
    
    public void agregar(Locomotora L){
        misL.add(L);
        
    }
}
//  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
