
package tp3_ej4;


public class TP3_EJ4 {

    public static void main(String[] args) {
        EmplPorCom a = new EmplPorCom("nico", "mont", 23, 10, 20);
        EmplBmasCom b = new EmplBmasCom("nico", "asd", 23, 10, 20, 100);
        
        System.out.println(a.salario());
        System.out.println(b.salario());

    }
    
}
