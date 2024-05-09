
package tp3_ej2;

public class TP3_EJ2 {
    public static void main(String[] args) {
        Autobus bus = new Autobus(20, 150, "2ECO11", "Mercedes-benz");
        Camion camion = new Camion(4.5, 3, "EQ2342", "Scania" );
        
        System.out.println(camion.mostrarCamion());
        camion.pesoPorComparti();
        
        System.out.println("Recaudado : $"+bus.totalRecaudado(100, 3, 8));
        System.out.println(bus.toString());
    }
    
}
