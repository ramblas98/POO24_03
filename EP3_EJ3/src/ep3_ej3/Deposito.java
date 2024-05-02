package ep3_ej3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Miguel
 */
public class Deposito {
    
    private ArrayList<Formacion> misF;
    private ArrayList<Locomotora> misL;
    
    
    
    public  ArrayList<Vagon> conjunto(){
        ArrayList<Vagon> conj = new ArrayList();
        
        for (Formacion F: misF) {
            conj.add(F.masPesado());
            
        }
        return conj;
    }
    
    public boolean nConductorExperimentado(){
        boolean f= false;    
    
        for(Formacion F: misF){
        if(F.esCompleja()==true){
            f=true;
            break;
        }     
        }
        return f;
    }
    
    public void agregarLocomotora(){
        
        for(Formacion F: misF){
            if(F.puedeMoverse()){
                System.out.println("La formacion ya puede moverse");
                
            } else {
                double m= F.empuje();
                
                for(Locomotora L: misL){
                    if (L.arrastreUtil()>=m) {
                        F.agregar(L);
                        System.out.println("Se agrego una locomotora a la formacion.");
                    }else System.out.println("No hay locomotora disponible con suficiente arrastre util.");
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
        
}
