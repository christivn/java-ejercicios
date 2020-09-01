/////////////////////////////////////
//  Ejercicio 9 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio09 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduce un número: ");
    int num=s.nextInt();
    int n=num;
    
    System.out.println("----------------------------------");
    
    int digitos=0;
    for(int i=0;num>0;i++){
        num=num/10;
        digitos++;
    }
  
    System.out.println("El número "+n+" tiene "+digitos+" digitos");
  
}
}
