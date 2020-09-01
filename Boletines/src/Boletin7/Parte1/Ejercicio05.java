/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    int contador=0;
    int[] array = new int[10];
    
    for(int i=0;i<10;i++){
        System.out.print("Introduce un número entero ("+(contador+1)+"/10): ");
        int num=s.nextInt();
        array[contador]=num;
        contador++;
    }
    
    System.out.println("--------------------------------------");
    
    int max=0; // FORMA FACIL: int max= Integer.MIN_VALUE;
    int min=999999999; // FORMA FACIL: int min= Integer.MAX_VALUE;
    
    for(int i=0;i<10;i++){
        if(array[i]>=max){
            max=array[i];
        }
        if(array[i]<=min){
            min=array[i];
        }
    }
    
    for(int i=0;i<10;i++){
        System.out.print(array[i]);
        if(array[i]==max){
            System.out.print(" <- MAXIMO");
        }
        if(array[i]==min){
            System.out.print(" <- MINIMO");
        }
        System.out.print("\n");
    }
    
    System.out.println("--------------------------------------");
    System.out.println("MAX: "+max);
    System.out.println("MIN: "+min);
    
    
    }
}
