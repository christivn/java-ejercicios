/////////////////////////////////////
//  Ejercicio31 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la altura:");
    int altura=s.nextInt();
    
    System.out.println("-------------------------------------");
    
    for(int i=0;i<altura;i++){
        if(i<(altura-1)){
        System.out.println("*");
        } else {
            for(int x=0;x<(altura/2);x++){
                System.out.print("* ");
            }
        }
        
    }
    System.out.print("\n");
        
    }
}
