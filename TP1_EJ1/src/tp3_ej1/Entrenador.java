
package tp3_ej1;

public class Entrenador extends MiembrosEquipo{
    private int idFedereacion;
    
    
    public Entrenador() {
    }

    public Entrenador(int idFedereacion, String nombres, String apellidos, int edad, int id) {
        super(nombres, apellidos, edad, id);
        this.idFedereacion = idFedereacion;
    }
    
    public void dirigirPartido(){
        System.out.println("El miembro del equipo "+this.getNombres()+" "+this.getApellidos()+" esta dirigiendo el partido...");
    }
    
}
