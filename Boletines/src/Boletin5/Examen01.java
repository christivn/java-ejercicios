//////////////////////////////////////
//  EXAMEN 01 - Christian Ramos     //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Examen01 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    int altura=0;
    while(altura<5){
        
    if(altura<5){
        System.out.println("\n[ LA ALTURA NO PUEDE SER MENOR A 5 ]");
    }
    
    System.out.print("Introduce la altura: ");
    altura=s.nextInt();
    

    if(altura>=5){
    for(int i=0;i<altura;i++){
        
        for(int x=0;x<(altura/2)+9;x++){
            if(i==0 || i==(altura-1)){
                System.out.print("*");
            } else {
            
            if(x==(((altura/2)+9)/2)-1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
           }
        }
        
        if(i==altura-1 || i==altura-2 || i==altura-3){
            System.out.print(",");
        }
        
      System.out.print("\n");
    }
    }
    
    
    
    }

        
    }
}
