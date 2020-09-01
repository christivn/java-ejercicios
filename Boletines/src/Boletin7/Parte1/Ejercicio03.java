/////////////////////////////////////
//  Ejercicio03 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    int[] n = new int[10];
    
    for(int i=1;i<=10;i++){
        System.out.print("Introduce un número ("+i+"/10): ");
        int num=s.nextInt();
        n[i-1]=num;
    }
    System.out.println("-----------------------------------------");
    System.out.println("Los números introducidos a la inversa son:");
    for(int i=9;i>=0;i--){
        System.out.print(n[i]+", ");
    }
    System.out.print("\n");
    
    }
}
