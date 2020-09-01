/////////////////////////////////////
//  Extra06 - Christian Ramos      //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;
public class Extra06 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("> Introduce la altura: ");
    int altura=s.nextInt();
    
    System.out.println("------------------------------\n");
    
    for(int i=0;i<altura;i++){
        
        if(i==0 || i==(altura-1)){
        for(int x=0;x<altura;x++){
            System.out.print("#");
        }

        } else {
        for(int x=0;x<altura;x++){
            if(x==0 || x==(altura-1)){
                System.out.print("#");
            } else if(x==i){
                System.out.print("#");
            } else if(x==(altura-(i+1))){
                System.out.print("#");
            } else {
                System.out.print(" ");
            }
        }
        }
    
    System.out.print("\n");
    }
    
    }
}
