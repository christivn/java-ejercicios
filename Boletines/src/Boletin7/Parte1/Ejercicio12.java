/////////////////////////////////////
//  Ejercicio12 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
      
    int[] array = new int[10];
    int[] array_mod = new int[10];
    
    boolean check=true;
    
    for(int i=0;i<10;i++){
        check=true;
        while(check){
            System.out.print("Introduce un número entero ("+(i+1)+"/10): ");
            int num=s.nextInt();
            array[i]=num;
            
            if(num>=0 && num<=9){
                check=false;
            } else {
                System.out.println("\n[ DEBES INTRODUCIR UN NÚMERO ENTRE 0 Y 9 ]");
            }
        }
    }
    
    System.out.println("-----------------------------------------------------");
    
    check=true;
    int inicio=0;
    while(check){
        System.out.print("Introduce el valor inicial (0 - 9): ");
        inicio=s.nextInt();
        
        if(inicio>=0 && inicio<=9){
            check=false;
        } else {
            System.out.println("\n[ DEBES INTRODUCIR UN NÚMERO ENTRE 0 Y 9 ]");
        }
    }
    
    check=true;
    int fin=0;
    while(check){
        System.out.print("Introduce el valor final (0 - 9): ");
        fin=s.nextInt();
    
        if(fin>=0 && fin<=9){
            check=false;
        } else {
            System.out.println("\n[ DEBES INTRODUCIR UN NÚMERO ENTRE 0 Y 9 ]");
        }
    }
    
    System.out.println("-----------------------------------------------------");
    
    
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
    
    
    
    
    for(int i=fin;i<9;i++){
        array_mod[i+1]=array[i];
    }
    for(int i=1;i<(fin-1);i++){
        if(i<inicio){
            array_mod[i+1]=array[i];
        }
        
        if(i>=inicio){
            array_mod[i+1]=array[i+1];
        }
    }
    array_mod[fin]=array[inicio];
    array_mod[0]=array[9];
    
    
    
    
    
    System.out.print("\u001B[41m Array Ordenado \u001B[40m\n");
    System.out.println("+------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    System.out.print("| Indice     |");
    for(int i=0;i<10;i++){
        System.out.printf("%-4s |", " "+i);
    }
    System.out.println("\n+------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    System.out.print("| Valor      |");
    for(int i=0;i<10;i++){
        System.out.printf("%-4s |", " "+array_mod[i]);
    }
    System.out.println("\n+------------+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
    
    }
}
