/////////////////////////////////////
//  Ejercicio05 - Christian Ramos   //
/////////////////////////////////////

package Boletin10.Sencillos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio05 {
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
            System.out.println(i+". "+ciudades.get(i));
        }
        System.out.print("\n");
        
        int num;
        for(;;){
            System.out.print("Introduce el numero de indice: ");
            num=s.nextInt();
            
            if(num>ciudades.size() || num<0){
                System.out.println("[ NÚMERO INTRODUCIDO FUERA DE RANGO ]\n");
            } else { break; }
        }
        
        System.out.println("La ciudad número "+num+" es "+ciudades.get(num));
        
    }
}
