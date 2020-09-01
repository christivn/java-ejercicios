/////////////////////////////////////
//  Ejercicio24 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el número de filas: ");
    int filas=s.nextInt();
    
    System.out.println("--------------------------------");
    
    int i=0;
     while(filas>i){
        for(int x=filas;x>i;x--){
            System.out.print(" ");
        }
        for(int x=0;x<(i+1);x++){
            System.out.print(x+1);
        }
        for(int x=0;x<i;x++){
            if(i==1){
                System.out.print(x+1);
            } else {
                System.out.print(i-x);
            }
        }
        System.out.print("\n");
        i++;
    }
        
    }
}
