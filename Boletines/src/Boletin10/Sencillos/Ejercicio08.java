/////////////////////////////////////
//  Ejercicio08 - Christian Ramos   //
/////////////////////////////////////

package Boletin10.Sencillos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio08 {
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
        String ciudad="";
        for(;;){
            System.out.print("Introduce el numero de indice: ");
            num=s.nextInt();
            
            if(num>ciudades.size() || num<0){
                System.out.println("[ NÚMERO INTRODUCIDO FUERA DE RANGO ]\n");
            } else { 
                
            System.out.print("Introduce el nombre de una ciudad: ");
            ciudad=s.next();
                
            break; }
        }
        
        System.out.println("\nLa ciudad número "+num+" se ha cambiado de "+ciudades.get(num)+" a "+ciudad);
        ciudades.set(num, ciudad);
        
                System.out.println("\n[ LISTA DE CIUDADES ]");
        for(int i=0;i<ciudades.size();i++){
            System.out.println(i+". "+ciudades.get(i));
        }
        System.out.print("\n");
        
    }
}
