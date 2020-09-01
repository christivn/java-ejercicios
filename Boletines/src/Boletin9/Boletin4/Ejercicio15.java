/////////////////////////////////////
//  Ejercicio15 - Christian Ramos   //
/////////////////////////////////////

package Boletin9.Boletin4;

import Boletin9.Boletin4.Clases.Coche;
import Boletin9.Boletin4.Clases.Concesionario;

public class Ejercicio15 {
    public static void main(String[] args) {
        
        Coche[] coches=new Coche[3];
        coches[0]=new Coche("4353HGB","Seat Leon","1.6 tdi",10000,"Gris");
        coches[1]=new Coche("1225AGH","Renault Megane","1.5 diesel",7000,"Negro");
        coches[2]=new Coche("5742JTY","Mercedes GLE","2,9 diesel",35000,"Blanco");
        
        Concesionario concesionario=new Concesionario(coches);
        
        System.out.println(concesionario+"\n\n");
        
        Coche nuevo_coche=new Coche("6542LJA","BMW Serie 3 M3","2,3 diesel",64000,"Negro");
        concesionario.nuevoCoche(nuevo_coche);
        
        System.out.println(concesionario);
        
    }
}
