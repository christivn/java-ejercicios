/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin9;

import Boletin9.Clases.Pizza;

public class Ejercicio05 {
    public static void main(String[] args) {
    
        Pizza p1 = new Pizza("margarita");
        p1.setTamano(Pizza.tam.mediana);
        Pizza p2 = new Pizza("funghi");
        p2.setTamano(Pizza.tam.familiar);
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos");
        p3.setTamano(Pizza.tam.mediana);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
    
    }
}
