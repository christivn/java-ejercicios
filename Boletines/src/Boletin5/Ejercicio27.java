/////////////////////////////////////
//  Ejercicio27 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num=s.nextInt();
    
    System.out.println("-------------------------------------");
    
    System.out.print("Los multiplos de 3 hasta "+num+" son: ");
    
    int mul=0;
    int contador=0;
    int suma=0;
    for(int i=1;i<=num;i++){
        mul=i%3;
        if(mul==0){
            contador++;
            suma+=i;
            System.out.print(i+", ");
        }
    }
    System.out.print("\n");
    System.out.println("Número total de multiplos: "+contador);
    System.out.println("Resultado de la suma de los múltiplos: "+suma);
        
    }
}
