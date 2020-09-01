/////////////////////////////////////
//  Extra01 - Christian Ramos      //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Extra01 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.println("[ LISTA 1 ]");
    int suma1=0;
    for(int i=0;i<15;i++){
    System.out.print("Introduce un número ("+(i+1)+"/15): ");
    int num1=s.nextInt();
    suma1+=num1;
    }
    
    System.out.println("\n\n[ LISTA 2 ]");
    int suma2=0;
    for(int i=0;i<15;i++){
    System.out.print("Introduce un número ("+(i+1)+"/15): ");
    int num2=s.nextInt();
    suma2+=num2;
    }
    
    System.out.println("----------------------------------");
    System.out.println("Valor acumulado lista 1: "+suma1);
    System.out.println("Valor acumulado lista 2: "+suma2);
    System.out.println("----------------------------------");
    
    if(suma1>suma2){
        System.out.println("[ LA LISTA 1 ES LA MAYOR ]");
    } else if(suma2>suma1){
        System.out.println("[ LA LISTA 2 ES LA MAYOR ]");
    } else if(suma1==suma2){
        System.out.println("[ LAS LISTAS TIENEN EL MISMO VALOR ]");
    }
        
    }
}
