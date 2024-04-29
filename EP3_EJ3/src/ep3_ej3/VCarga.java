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
public class VCarga extends Vagon{
    
    private double cargaMaxima;
    
    public VCarga(){
        
    }
    
    public VCarga(double largo,double anchoUtil,double cargaMaxima){
        super(largo,anchoUtil);
        this.cargaMaxima = cargaMaxima;
    }
    
    @Override
    public double pesoMaximo(){
        return cargaMaxima + 160;
    }
    
    public double getCargaMaxima(){
        return cargaMaxima;
    }
    
}
