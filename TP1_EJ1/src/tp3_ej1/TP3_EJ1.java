
package tp3_ej1;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Calendar;
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
        
        

        // Mostrar la fecha ingresada
        Calendar c1 = GregorianCalendar.getInstance();
        Calendar c2 = GregorianCalendar.getInstance();
        
        
        //System.out.println("Fecha actual: "+c1.getTime().toLocaleString());
        
        c1.set(2018, 1, 22);
        c2.set(2018, 1, 22);
        boolean sameDate = c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR) &&
                  c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) &&
                  c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH);
        System.out.println(sameDate);
        //System.out.println("Fecha vieja: "+c1.getTime().toLocaleString());
    }
    
}
