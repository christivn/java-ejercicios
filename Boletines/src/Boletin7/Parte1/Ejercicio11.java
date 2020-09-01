/////////////////////////////////////
//  Ejercicio11 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
      
    int[] array = new int[10];
    int[] array_aux = new int[10];
    
    for(int i=0;i<10;i++){
        System.out.print("Introduce un número entero ("+(i+1)+"/10): ");
        int num=s.nextInt();
        array[i]=num;
    }
    
    System.out.print("\n\n\u001B[42m Array Generado \u001B[40m\n");
    System.out.println("+------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    System.out.print("| Indice     |");
    for(int i=0;i<10;i++){
    System.out.printf("%-4s |", " "+i);
    }
    System.out.println("\n+------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    System.out.print("| Valor      |");
    for(int i=0;i<10;i++){
    System.out.printf("%-4s |", " "+array[i]);
    }
    System.out.println("\n+------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+\n\n");
    
    
    System.out.print("\u001B[41m Array Ordenado \u001B[40m\n");
    int cont=0;
    int cont_primo=0;
    for(int i=0;i<10;++i){
      for(int x=1;x<100;x++){
      if(array[i]!=0 && array[i]%array[i]==0 && array[i]%1==0 && array[i]%x==0){
        cont_primo++;
      }
     }
      
      if(cont_primo<=2 && array[i]!=1){
        array_aux[cont]=array[i];
        array[i]=-1;
        cont++;
      }
      cont_primo=0;
    }
    
    for(int i=0;i<10;++i){
        if(array[i]>=0){
            array_aux[cont]=array[i];
            cont++;
        }
    }
    
    
    System.arraycopy(array_aux, 0, array, 0, 10);
    System.out.println("+------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    System.out.print("| Indice     |");
    for(int i=0;i<10;i++){
    System.out.printf("%-4s |", " "+i);
    }
    System.out.println("\n+------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    System.out.print("| Valor      |");
    for(int i=0;i<10;i++){
    System.out.printf("%-4s |", " "+array_aux[i]);
    }
    System.out.println("\n+------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    
    }
}
