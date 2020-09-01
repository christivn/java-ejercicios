/////////////////////////////////////
//  Ejercicio16 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
     
    int[]array=new int[20];
    boolean check=true;
    
    for(int i=0;i<20;i++){
        array[i]=(int)(Math.random()*(400));
        System.out.print(" "+array[i]+" |"); 
    }
    
    int mul=0;
    while(mul!=5 && mul!=7){
        System.out.print("\n\n ¿Quieres resaltar los multiplos de 5 o 7?: "); 
        mul=s.nextInt();
        
       if(mul!=5 && mul!=7){
            System.out.println("[ DEBES INTRODUCIR UN VALOR VÁLIDO (5) O (7) ]"); 
       }
    }
    
    System.out.print("\n");
    for(int i=0;i<20;i++){
        if((array[i]%mul)==0){
            System.out.print(" \u001B[32m["+array[i]+"]\u001B[0m |");
                    
        } else {
            System.out.print(" "+array[i]+" |"); 
        }
    }
    System.out.print("\n");
            
    }
}
