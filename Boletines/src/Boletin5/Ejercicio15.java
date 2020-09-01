//////////////////////////////////////
//  Ejercicio 15 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio15 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número (base): ");
    int base=s.nextInt();
    
    System.out.print("Introduce un número (exponente): ");
    int exp=s.nextInt();
    
    System.out.println("----------------------------------");
    
    while(exp>0){
    int potencia=1;
    for(int i=0;i<exp;++i){
        potencia=base*potencia;
        
        if(i==(exp-1)){
        System.out.println(base+"^"+exp+"= "+potencia);
        }
    }
    
    exp--;
  }
}
}
