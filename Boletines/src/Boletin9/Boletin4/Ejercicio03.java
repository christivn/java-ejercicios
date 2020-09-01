/////////////////////////////////////
//  Ejercicio03 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;
import Boletin9.Boletin4.Clases.Monedero;

public class Ejercicio03 {
    public static void main(String[] args) {
    
    Monedero cartera=new Monedero();
    
    System.out.println("Tienes "+cartera.getSaldo()+"€");
    
    cartera.addSaldo(100);
    System.out.println("Tienes "+cartera.getSaldo()+"€");
    
    cartera.addSaldo(50);
    System.out.println("Tienes "+cartera.getSaldo()+"€");
    
    cartera.removeSaldo(25);
    System.out.println("Tienes "+cartera.getSaldo()+"€");
    
    }
}
