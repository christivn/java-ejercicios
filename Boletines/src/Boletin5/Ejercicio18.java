//////////////////////////////////////
//  Ejercicio 18 - Christian Ramos  //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio18 { 
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el primer n�mero: ");
    int n1=s.nextInt();
    
    System.out.print("Introduce el segundo n�mero: ");
    int n2=s.nextInt();
    
    System.out.println("----------------------------------");
    
    if(n1!=n2){
    
    int menor;
    int mayor;
    
    if(n1>n2){
      mayor=n1;
      menor=n2;
    } else {
      mayor=n2;
      menor=n1;
    }
    
    if((mayor-menor)<7){
      System.out.println("No se puede incrementar de 7 en 7, entre los n�meros "+n1+" y "+n2);
    } else {
      for(int i=menor;i<=mayor;i=i+7){
        System.out.println(i);
      }
      System.out.println(mayor);
    }
  
    
    } else {
      System.out.println("Ambos n�meros no pueden ser iguales");
    }
    
}
}
