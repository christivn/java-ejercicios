/////////////////////////////////////
//  Ejercicio01 - Christian Ramos  //
/////////////////////////////////////

package Boletin9;

import Boletin9.Clases.Caballo;

public class Ejercicio01 {
    public static void main(String[] args) {
    
    Caballo caballo01=new Caballo("Relampago", "Negro", 15);
    
    System.out.println("El caballo 1 se llama: "+caballo01.getNombre());
    System.out.println("El caballo 1 es de color: "+caballo01.getColor());
    System.out.println("El caballo 1 tiene una edad de: "+caballo01.getEdad());
    
    }
}
