//////////////////////////////////////
//  Ejercicio02 - Christian Ramos   //
/////////////////////////////////////

package Boletin10.Sencillos;

import java.util.ArrayList;

public class Ejercicio02 {
    public static void main(String[] args) {
        
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Sevilla");
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Valencia");
        ciudades.add("Bilbao");
        
        System.out.println("Hay "+ciudades.size()+" ciudades.\n");
        for(int i=0;i<ciudades.size();i++){
            System.out.println(ciudades.get(i));
        }
        
    }
}
