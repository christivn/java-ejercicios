/////////////////////////////////////
//  Ejercicio04 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios1_al_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            System.out.print("Introduce una palabra ("+(i+1)+"/10): ");
            String palabra=s.next();
            a.add(palabra);
        }
        
        System.out.println("\nLista: "+a);
        
        Collections.sort(a);
        System.out.println("Lista Ordenada: "+a);
        
    }
}
