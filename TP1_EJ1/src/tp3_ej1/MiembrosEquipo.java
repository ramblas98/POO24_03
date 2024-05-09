
package tp3_ej1;

public class MiembrosEquipo {
    private String nombres, apellidos;
    private int edad, id;
    

    public MiembrosEquipo() {
    }

    public MiembrosEquipo(String nombres, String apellidos, int edad, int id) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void concentrarse(){
        System.out.println("El miembro del equipo "+this.getNombres()+" "+this.getApellidos()+"  se ha concentrado");
        
    }
    
    public void viajar(){
        System.out.println("El miembro del equipo "+this.getNombres()+" "+this.getApellidos()+"  ha  viajado");
    }
    
}
