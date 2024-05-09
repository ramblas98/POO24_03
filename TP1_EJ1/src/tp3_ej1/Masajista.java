package tp3_ej1;

public class Masajista extends MiembrosEquipo {
    private String titulacion;
    private int aExperiencia;
    
    public Masajista(){
    }



    public Masajista(String titulacion, int aExperiencia, String nombres, String apellidos, int edad, int id) {
        super(nombres, apellidos, edad, id);
        this.titulacion = titulacion;
        this.aExperiencia = aExperiencia;
    }
     
    

    public void darMasaje(){
        //da masaje
        System.out.println("El miembro del equipo "+this.getNombres()+" "+this.getApellidos()+" ha dado un masaje");
    }
}
