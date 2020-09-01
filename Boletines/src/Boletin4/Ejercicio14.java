//////////////////////////////////////
//  Ejercicio 14 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio14 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    int num;
    
    System.out.print("Introduce un n�mero: ");
    num=s.nextInt();
    
    System.out.println("----------------------------------");
    
    if((num%2)==0){
      System.out.println("El n�mero "+num+" es par");
    } else {
      System.out.println("El n�mero "+num+" es impar");
    }
    
    if((num%5)==0){
      System.out.println("El n�mero "+num+" es divisible entre 5");
    } else {
      System.out.println("El n�mero "+num+" no es divisible entre 5");
    }
    
}
}
