/////////////////////////////////////
//  Ejercicio33 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la altura de la U: ");
    int altura=s.nextInt();

    System.out.println("-------------------------------------");
    
    for(int i=0;i<altura;i++){

        if(i!=(altura-1)){
        System.out.print("*");
        
        for(int x=0;x<altura;x++){
            if(x==(altura-1)){
                System.out.print(" *");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        }
        
        if(i==(altura-1)){
            for(int x=0;x<(altura/2)+1;x++){
                if((altura%2)!=0 && x==0){
                    System.out.print(" *");
                }
                if(x==0 || x==(altura/2)+1){
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
    System.out.print("\n");
    
    }
}
