/////////////////////////////////////
//  Ejercio09 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;
import Boletin9.Boletin4.Clases.Cubo;

public class Ejercicio09 {
    public static void main(String[] args) {
        
        Cubo c1=new Cubo(100,20);
        Cubo c2=new Cubo(100,80);
        
        System.out.println("C1: Capacidad: "+c1.getCapacidad()+"     Litros Actuales: "+c1.getLitros_actual());
        System.out.println("C2: Capacidad: "+c2.getCapacidad()+"     Litros Actuales: "+c2.getLitros_actual());
        c1.verter_a(c2);
        System.out.println("C1: Capacidad: "+c1.getCapacidad()+"     Litros Actuales: "+c1.getLitros_actual());
        System.out.println("C2: Capacidad: "+c2.getCapacidad()+"     Litros Actuales: "+c2.getLitros_actual());
        
        
        System.out.println("\n-----------------------------\n");
        
        
        Cubo c3=new Cubo(100,30);
        Cubo c4=new Cubo(100,90);
        
        System.out.println("C3: Capacidad: "+c3.getCapacidad()+"     Litros Actuales: "+c3.getLitros_actual());
        System.out.println("C4: Capacidad: "+c4.getCapacidad()+"     Litros Actuales: "+c4.getLitros_actual());
        c3.verter_a(c4);
    }
}
