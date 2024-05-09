
package tp3_ej5;

public class TP3_EJ5 {
    public static void main(String[] args){
        Piso p = new Piso("Alvear 213", 47, 16, false, 45000);
        Local l = new Local(6, "Bernardo M123", 65, 0, true, 90000);
        
        System.out.println(p.precio());
        System.out.println(l.precio());
    }
    
}
