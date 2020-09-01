/////////////////////////////////////
//  Ejercicio01 - Christian Ramos   //
/////////////////////////////////////

package Boletin10.Sencillos;

import java.util.ArrayList;

public class Ejercicio01 {
    public static void main(String[] args) {
        
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Sevilla");
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Valencia");
        ciudades.add("Bilbao");
        
        for(int i=0;i<ciudades.size();i++){
            System.out.println(ciudades.get(i));
        }
        
    }
}
