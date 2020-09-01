/////////////////////////////////////
//  Ejercicio01 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;
import Boletin9.Boletin4.Clases.Bombilla;

public class Ejercicio01 {
    public static void main(String[] args) {
    
    Bombilla bombilla01=new Bombilla(1);
    Bombilla bombilla02=new Bombilla(2,true);
    
    System.out.println("La bombilla bombilla01 está "+bombilla01);
    System.out.println("La bombilla bombilla02 está "+bombilla02);
    
    System.out.println("");
    
    bombilla01.setEstado(true);
    System.out.println("La bombilla bombilla01 está "+bombilla01);
    
    }
}
