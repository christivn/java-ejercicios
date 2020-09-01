/////////////////////////////////////
//  Ejercicio04 - Christian Ramos   //
/////////////////////////////////////

package Boletin10.Sencillos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Sevilla");
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Valencia");
        ciudades.add("Bilbao");
        
        System.out.println("[ LISTA DE CIUDADES ]");
        for(int i=0;i<ciudades.size();i++){
            System.out.println(ciudades.get(i));
        }
        System.out.print("\n");
        
        System.out.print("Introduce la ciudad a buscar: ");
        String ciudad=s.next();
        
        int cont=0;
        for(int i=0;i<ciudades.size();i++){
            if(ciudad.toLowerCase().equals(ciudades.get(i).toLowerCase())){
                cont++;
            }
        }
        
        if(cont!=0){
            System.out.println("La ciudad de "+ciudad+" se encuentra en la lista.");
        } else {
            System.out.println("La ciudad de "+ciudad+" NO se encuentra en la lista.");
        }
        
    }
}
