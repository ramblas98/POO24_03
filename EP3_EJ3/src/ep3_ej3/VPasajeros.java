package ep3_ej3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class VPasajeros extends Vagon{
    
    private int cantidadPasajeros;
    
    public VPasajeros(){
    
    }
    
    public VPasajeros(double largo,double anchoUtil,int cantidadPasajeros){
        super(largo,anchoUtil);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    @Override
    public double pesoMaximo(){
        if(anchoUtil <= 2.5) {
            return cantidadPasajeros * 80;
            
        }else {
            return cantidadPasajeros * 10;
        }
    }
    
    public int getCantidadPasajeros(){
        return cantidadPasajeros;
    }
    
    
}