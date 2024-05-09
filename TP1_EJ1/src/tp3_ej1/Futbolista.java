
package tp3_ej1;


public class Futbolista extends MiembrosEquipo{
    private String puesto;
    private double peso;

    public Futbolista() {
    }

    public Futbolista(String puesto, double peso, String nombres, String apellidos, int edad, int id) {
        super(nombres, apellidos, edad, id);
        this.puesto = puesto;
        this.peso = peso;
    }
    
    public void jugarPartido(){
        System.out.println("El miembro del equipo "+this.getNombres()+" "+this.getApellidos()+" esta jugando al partido...");
    }
}
