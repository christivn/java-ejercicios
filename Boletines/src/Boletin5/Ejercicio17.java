//////////////////////////////////////
//  Ejercicio 17 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio17 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num=s.nextInt();
    
    System.out.println("----------------------------------");
    
    for(int i=num-1;i<=100+num;i++){
      System.out.println(i+=1);
    }
    
}
}
