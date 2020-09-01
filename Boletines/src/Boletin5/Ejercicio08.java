/////////////////////////////////////
//  Ejercicio 8 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio08 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
  
    System.out.print("Mostrar tabla de multiplicar del número: ");
    int num=s.nextInt();
    
    System.out.print("Hasta: ");
    int hasta=s.nextInt();
    
    System.out.println("----------------------------------");
    
    for(int i=0;i<=hasta;i++){
      System.out.print(i+"x"+num+"= "+(num*i)+"\n");
    }
  
}
}
