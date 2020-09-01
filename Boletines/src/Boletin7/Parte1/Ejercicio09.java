/////////////////////////////////////
//  Ejercicio09 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    int[] array = new int[8];
    
    for(int i=0;i<8;i++){
        System.out.print("Introduce un número entero ("+(i+1)+"/8): ");
        int num=s.nextInt();
        array[i]=num;
    }
    System.out.print("\n");
    
    System.out.println("+------------------+---------+---------+");
    System.out.println("|  Posición Array  | Valor   | Tipo    |");
    System.out.println("+------------------+---------+---------+");
    
    String par_impar="";
    for (int i=0;i<8;i++) {
        if((array[i]%2)==0){
            par_impar="Par";
        } else {
            par_impar="Impar";
        }
        
        System.out.printf("%-2s %-15s | %-7s | %-7s |\n","| ", "Posición "+i, array[i],par_impar);
    }
    System.out.println("+------------------+---------+---------+");
    
    }
}
