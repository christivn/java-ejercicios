/////////////////////////////////////
//  Ejercicio11 - Christian Ramos   //
/////////////////////////////////////

package Boletin10.Sencillos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Sevilla");
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Valencia");
        ciudades.add("Bilbao");
        ciudades.add("Sevilla");
        ciudades.add("Barcelona");
        
        for(;;){
        System.out.println("[ LISTA DE CIUDADES ]");
        for(int i=0;i<ciudades.size();i++){
            System.out.println(ciudades.get(i));
        }
        System.out.print("\n");
        
        String ciudad;
        int indice=-1;
        for(;;){
            System.out.print("Introduce una ciudad: ");
            ciudad=s.next();
            ciudad=ciudad.toLowerCase();
            
            for(int i=0;i<ciudades.size();i++){
                if(ciudades.get(i).toLowerCase().equals(ciudad)){
                    indice=i;
                    ciudades.remove(indice);
                }
            }
            
            if(indice==-1){
               System.out.println("[ La ciudad introducida no existe ]\n");
            } else { break; }
        }
        
        System.out.println("\nLa ciudad "+ciudad+" y sus ocurrencias ha sido eliminada");
        
    }
    }
}
