//////////////////////////////////////
//  Ejercicio 10 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio10 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int contador=-1;
    int num=1;
    int total=0;
          
    for(int i=0;num>0;contador++){
      System.out.print("Introduce un número (Para acabar introduce un negativo): ");
      num=s.nextInt();
      
      if(num>0){
        total+=num;
      }
    }
    
    System.out.println("----------------------------------");
    System.out.println("La media es igual a : "+(total/contador));
    
}
}
