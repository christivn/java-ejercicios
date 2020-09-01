/////////////////////////////////////
//  Ejercicio04 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
public class Ejercicio04 {
    public static void main(String[] args) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for(int i=0;i<20;i++){
        int rand=(int)(Math.random()*100);
        numero[i]=rand;
    }
    
    for(int i=0;i<20;i++){
        cuadrado[i]=numero[i]*numero[i];
    }
    
    for(int i=0;i<20;i++){
        cubo[i]=numero[i]*numero[i]*numero[i];
    }
    
    System.out.println("NUMERO \t CUADRADO \t CUBO");
    System.out.println("--------------------------------");
    for(int i=0;i<20;i++){
        System.out.printf("%-8s %-15s %-10s\n", numero[i], cuadrado[i], cubo[i]);
    }
    
    }
}
