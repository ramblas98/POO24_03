/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej6;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aaronz
 */
public class Formacion {
    private ArrayList<Locomotora> misL;
    private ArrayList<Vagon> misV;
    
    public Formacion(){
        this.misL = new ArrayList();
        this.misV = new ArrayList();
    }
    //getters y setters
    public List<Locomotora> getLocomotoras(){
        return misL;
    }
    public List<Vagon> getVagones(){
        return misV;
    }
    public void agregarLocomotora(Locomotora l){
        misL.add(l);
    }
    public void agregarVagon(Vagon v){
        misV.add(v);
    }
    public int totalPasajeros(){
        int total = 0;
        for(Vagon v : misV){
            total += v.cantidadPasajeros();
        }
        return total;
    }
    public int cantidadVagonesLivianos(){
        int cont = 0;
        for(Vagon v:misV){
            if(v.esLiviana()) cont+=1;
        }
        return cont;
    }
    public boolean esEficiente(){
        boolean band = true;
        for(Locomotora l:misL){
            if(l.getPesoMaximo() < 5 * l.getPeso()) band=false;
        }
        return band;
    }
    public double velocidadMaxima(){
        double men = 0;
        for(Locomotora l:misL){
            if(l.getVelocidadMaxima()<men){
                men = l.getVelocidadMaxima();
            }
        }
        return men;
    }
    public boolean puedeMoverse(){
        double p=0,m=0;
        boolean b=false;
        for(Vagon v:misV){
            p+= v.pesoMaximo();
        }
        for(Locomotora l:misL){
            m+=l.arrastreUtil();
        }
        if(p<m) b=true;
        return b;
    }
    public Vagon masPesado(){
        double may = 0;
        Vagon vMay = new Vagon();
        for(Vagon v:misV){
            if(v.pesoMaximo()>may){
                may = v.pesoMaximo();
                vMay = v;
            }
        }
        return vMay;
    }
    public boolean esCompleja(){
        int suma = 0,pesototal=0;
        boolean b=false;
        suma = misL.size() + misV.size();
        if(suma > 20){
            b=true;
        }
        
        for(Locomotora l:misL){
            pesototal+= l.arrastreUtil();
        }
        for(Vagon v:misV){
            pesototal+= v.pesoMaximo();
        }
        if(pesototal > 10000){
            b=true;
        }
        return b;
    }
}
