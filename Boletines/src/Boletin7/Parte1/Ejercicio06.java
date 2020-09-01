/////////////////////////////////////
//  Ejercicio06 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int contador=0;
    int[] array = new int[15];
    int[] array_reves = new int[15];
    
    for(int i=0;i<15;i++){
        System.out.print("Introduce un número entero ("+(contador+1)+"/15): ");
        int num=s.nextInt();
        array[contador]=num;
        contador++;
    }
    
    System.out.println("-----------------------------------");
    
    for(int i=0;i<14;i++){
        array_reves[i]=array[i+1];
    }
    
    array_reves[14]=array[0];
    
    for(int i=0;i<=14;i++){
        System.out.print(array_reves[i]+", ");
    }
    
    }
}
