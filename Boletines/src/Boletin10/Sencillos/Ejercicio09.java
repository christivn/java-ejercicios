/////////////////////////////////////
//  Ejercicio09 - Christian Ramos   //
/////////////////////////////////////

package Boletin10.Sencillos;

import java.util.ArrayList;

public class Ejercicio09 {
    public static void main(String[] args) {
        
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Sevilla");
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Valencia");
        ciudades.add("Bilbao");
        
        System.out.println("\n[ LISTA DE CIUDADES ]");
        for(int i=0;i<ciudades.size();i++){
            ciudades.set(i, "Cdd "+ciudades.get(i));
            System.out.println(i+". "+ciudades.get(i));
        }
        System.out.print("\n");
        
    }
}
