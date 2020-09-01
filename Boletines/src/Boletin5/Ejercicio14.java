//////////////////////////////////////
//  Ejercicio 14 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio14 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número (base): ");
    int base=s.nextInt();
    
    System.out.print("Introduce un número (exponente): ");
    int exp=s.nextInt();
    
    System.out.println("----------------------------------");
    
    int potencia=1;
    for(int i=0;i<exp;++i){  
        potencia=base*potencia;
    }  
    System.out.println("La potencia de "+base+" elevado a "+exp+" es igual a "+potencia);
}
}
