/////////////////////////////////////
//  Ejercicio06 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;
import Boletin9.Boletin4.Clases.PuntoCoordenada;

public class Ejercicio06 {
    public static void main(String[] args) {
    
    PuntoCoordenada p1=new PuntoCoordenada(100,200);
    PuntoCoordenada p2=new PuntoCoordenada(400,800);
    
    System.out.println("P1: "+p1);
    System.out.println("P2: "+p2);
    
    System.out.print("\n");
    
    System.out.println("Distancia de p1 a p2: "+p1.medirDistancia(p2));
    
    }
}
