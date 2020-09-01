//////////////////////////////////////
//  Ejercicio 16 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio16 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num=s.nextInt();
    
    System.out.println("----------------------------------");
    
    int contador=0;
    for(int i=2;i<(100+num);++i){
      if(num%i==0 && num%num==0 && num%1==0){
        contador++;
      }
    }
    
    if(contador>=2){
      System.out.println("El número "+num+" no es primo");
    } else {
      System.out.println("El número "+num+" es primo");
    }
    
}
}
