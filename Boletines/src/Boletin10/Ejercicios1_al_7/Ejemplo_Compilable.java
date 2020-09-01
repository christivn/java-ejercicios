/////////////////////////////////////
//  Ejemplo_Compilable - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios1_al_7;

import java.util.Scanner;

public class Ejemplo_Compilable {
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        
        System.out.print("Introduce la primera palabra: ");
        String p1=s.next();
        
        System.out.print("Introduce la egunda palabra: ");
        String p2=s.next();
        
        int Hashcode_P1 = p1.hashCode();
        int Hashcode_P2 = p2.hashCode();
        System.out.println("\nHashmap P1: "+Hashcode_P1);
        System.out.println("Hashmap P2: "+Hashcode_P2+"\n");
        
        if(Hashcode_P1==Hashcode_P2){
            System.out.println("[ LAS PALABRAS SON IGUALES MEDIANTE HASHCODE ]");
        } else {
            System.out.println("[ LAS PALABRAS NO SON IGUALES MEDIANTE HASHCODE ]");
        }
        
        if(p1.equals(p1)){
            System.out.println("[ LAS PALABRAS SON IGUALES MEDIANTE EQUALS ]");
        } else {
            System.out.println("[ LAS PALABRAS NO SON IGUALES MEDIANTE EQUALS ]");
        }
        
    }
}
