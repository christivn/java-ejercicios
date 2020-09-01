/////////////////////////////////////
//  Ejercicio03 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios1_al_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        
        for(int i=0;i<10;i++){
            System.out.print("Introduce un número ("+(i+1)+"/10): ");
            int num=s.nextInt();
            a.add(num);
        }
        
        System.out.println("\nLista: "+a);
        
        Collections.sort(a);
        System.out.println("Lista Ordenada: "+a);
    }
}
