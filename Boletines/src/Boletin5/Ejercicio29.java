/////////////////////////////////////
//  Ejercicio29 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num=s.nextInt();
    
    System.out.print("Introduce un divisor: ");
    int div=s.nextInt();
    
    System.out.println("-------------------------------------");
        
    int mul=0;
    int contador=0;
    int suma=0;
    for(int i=1;i<=num;i++){
        mul=i%div;
        if(mul==0){
            contador++;
            suma+=i;
            System.out.print(i+", ");
        }
    }
    System.out.print("\n");
    
    }
}
