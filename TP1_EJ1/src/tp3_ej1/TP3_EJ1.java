
package tp3_ej1;

public class TP3_EJ1 {

    
    public static void main(String[] args) {
        Entrenador jorge = new Entrenador(245, "Jorge", "Lopez", 42, 2022);
        Futbolista pablo = new Futbolista("Defensor", 76, "Pablo", "Martin", 24, 1444);
        Masajista nahu = new Masajista("Kinesiologo", 3, "Nahuel", "Troyano", 25, 1472);
        
        jorge.concentrarse();
        jorge.viajar();
        jorge.dirigirPartido();
        pablo.concentrarse();
        nahu.darMasaje();
        pablo.jugarPartido();
        
    }
    
}
