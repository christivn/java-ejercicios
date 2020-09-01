/////////////////////////////////////
//  Ejercicio07 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int[] lista = new int[20];
    int[] lista_modificada = new int[20];
    
    System.out.print("Lista Generada: ");
    for(int i=0;i<20;i++){
        int rand=(int)(Math.random()*20);
        System.out.print(rand+", ");
        lista[i]=rand;
    }
    System.out.println("\n--------------------------------------------------------------------------------------");
        System.out.print("Introduce el número a cambiar de la lista: ");
        int num1=s.nextInt();
        
        System.out.print("Introduce el número por el que sustituir el primero: ");
        int num2=s.nextInt();
    System.out.println("--------------------------------------------------------------------------------------");
    
    System.out.print("Lista Modificada: ");
    for(int i=0;i<20;i++){
        lista_modificada[i]=lista[i];
        
        if(lista[i]==num1){
            lista_modificada[i]=num2;
            System.out.print("\""+lista_modificada[i]+"\" , ");
        } else {
            System.out.print(lista_modificada[i]+", ");
        }
    }
    
    }
}
