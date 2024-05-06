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
public class Deposito {
    private ArrayList<Formacion> misF;
    private ArrayList<Locomotora> misL;
    
    public Deposito(){
        this.misF = new ArrayList();
        this.misL = new ArrayList();
    }
    public ArrayList<Formacion> getFormacion(){
        return misF;
    }
    public ArrayList<Locomotora> getLocomotora(){
        return misL;
    }
    public ArrayList<Vagon> Conjunto(){
        ArrayList <Vagon> mconj = new ArrayList();
        for(Formacion f:misF){
            mconj.add(f.masPesado());
        }
        return mconj;
    }
    public boolean condExp(){
        for(Formacion f : this.getFormacion()){
            if(f.esCompleja()) return true;
        }
        return false;
    }
    public void agregarLocomotora(Locomotora l){
        this.misL.add(l);
    }
    public void agregarFormacion(Formacion f){
        this.misF.add(f);
    }
}
