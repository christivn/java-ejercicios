/////////////////////////////////////
//  Ejercicio06 - Christian Ramos  //
/////////////////////////////////////

package Boletin9;
import Boletin9.Clases.Tiempo;

public class Ejercicio06 {
    public static void main(String[] args) {
    
    Tiempo tiempo01=new Tiempo(0, 30, 40);
    Tiempo tiempo02=new Tiempo(0, 35, 20);
        
        System.out.println("   [ SUMA ]");
        System.out.println("  "+tiempo01+"   Tiempo nº1");
        System.out.println("+ "+tiempo02+"   Tiempo nº2");
        System.out.println("  ----------");
        tiempo01.suma(tiempo02);
        System.out.println("  "+tiempo01+"\n\n");


    tiempo01=new Tiempo(0, 35, 40);
    tiempo02=new Tiempo(0, 30, 20);
        
        System.out.println("   [ RESTA ]");
        System.out.println("  "+tiempo01+"   Tiempo nº1");
        System.out.println("- "+tiempo02+"   Tiempo nº2");
        System.out.println("  ----------");
        tiempo01.resta(tiempo02);
        System.out.println("  "+tiempo01+"\n");
    
    }
}
