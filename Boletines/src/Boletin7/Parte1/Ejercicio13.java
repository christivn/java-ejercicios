/////////////////////////////////////
//  Ejercicio13 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    boolean check=true;
    
    int[] array = new int[100];
    int max=0;
    int min=500;
    
    for(int i=0;i<100;i++){
        array[i]=(int)(Math.random()*(500+1));
        System.out.print(array[i]+" ");
        if(i!=0 && (i%10)==0){
            System.out.print("\n");
        }
    }
    
    while(check){
        System.out.print("\n\n¿Quieres destacar? (S/N) ");
        String sn=s.next();
        sn=sn.toLowerCase();
        
        if(!sn.equals("s") && !sn.equals("n")){
            System.out.println("\n[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA 'S' o 'N' ]");
        } else {
            if(sn.equals("n")){
                System.exit(0); 
            } else {
                check=false;
            }
        }
    }
    System.out.print("\n");
            
    for(int i=0;i<100;i++){
        if(array[i]>max){
            max=array[i];
        }
        if(array[i]<min){
            min=array[i];
        }
    }
    
    for(int i=0;i<100;i++){
        if(array[i]==max || array[i]==min){
            System.out.print("**"+array[i]+"** ");
        } else {
            System.out.print(array[i]+" ");
        }
        
        if(i!=0 && (i%10)==0){
            System.out.print("\n");
        }
    }
    System.out.print("\n");
    }
}
