/////////////////////////////////////
//  Ejercicio04 - Christian Ramos  //
/////////////////////////////////////

package Boletin9;

import Boletin9.Clases.Fraccion;

public class Ejercicio04 {
    public static void main(String[] args) {
    
    Fraccion fraccion1=new Fraccion(15, 5);
    Fraccion fraccion2=new Fraccion(2, 8);
    
    System.out.println("[ FRACCIÓN POR DEFECTO ]");
    System.out.println(fraccion1+"\n");
    
    System.out.println("[ FRACCIÓN POR INVERTIDA ]");
    fraccion1.invertir();
    System.out.println(fraccion1+"\n");
    fraccion1.invertir();
    
    System.out.println("[ FRACCIÓN MULTIPLICADA ]");
    System.out.print(fraccion1);
    fraccion1.multiplica(fraccion2);
    System.out.print("*"+fraccion2+"= "+fraccion1+"\n\n");
    
    System.out.println("[ FRACCIÓN DIVIDIDA ]");
    System.out.print(fraccion1);
    fraccion1.divide(fraccion2);
    System.out.print("/"+fraccion2+"= "+fraccion1+"\n\n");
    
    System.out.println("[ FRACCIÓN SIMPLIFICADA ]");
    fraccion1.simplifica();
    System.out.println(fraccion1+"\n");
    
    }
}
