/////////////////////////////////////
//  Ejercicio14 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String[] array = new String[8];
    String[] array_mod = new String[8];
    
    for(int i=0;i<8;i++){
        System.out.print("Introduce una palabra ("+(i+1)+"/8): ");
        String palabra=s.next();
        palabra=palabra.toLowerCase();
        array[i]=palabra;
    }
    
    System.out.print("\n\n\u001B[42m Array Original \u001B[40m\n");
    for(int i=0;i<8;i++){
        System.out.printf("%-4s |", " "+array[i]);
    }
    
    int cont=0;
    for(int i=0;i<8;i++){
        if(array[i].equals("verde") || array[i].equals("rojo") || array[i].equals("azul") || array[i].equals("amarillo") || array[i].equals("naranja") || array[i].equals("rosa") || array[i].equals("negro") || array[i].equals("blanco") || array[i].equals("morado")){
            array_mod[cont]=array[i];
            cont++;
        }
    }
    
    
    for(int i=0;i<8;i++){
        if(!array[i].equals("verde") && !array[i].equals("rojo") && !array[i].equals("azul") && !array[i].equals("amarillo") && !array[i].equals("naranja") && !array[i].equals("rosa") && !array[i].equals("negro") && !array[i].equals("blanco") && !array[i].equals("morado")){
            array_mod[cont]=array[i];
            cont++;
        }
    }
    
    
    System.out.print("\n\n\u001B[41m Array Ordenado \u001B[40m\n");
    for(int i=0;i<8;i++){
        System.out.printf("%-4s |", " "+array_mod[i]);
    }
    
    System.out.print("\n");
    }
}
