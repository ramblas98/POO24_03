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
public class Vagon {
    protected double largo;
    protected double anchoUtil;
    
    public Vagon(){
        
    }
    
    public Vagon(double largo,double anchoUtil){
        this.largo = largo;
        this.anchoUtil = anchoUtil;
    }
    
    public double pesoMaximo(){
        return 0;
    }
    
    public double getLargo(){
        return largo;
    }
    
    public double getAnchoUltil(){
        return anchoUtil;
    }
    
}
