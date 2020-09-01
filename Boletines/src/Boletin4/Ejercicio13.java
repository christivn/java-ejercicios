//////////////////////////////////////
//  Ejercicio 13 - Christian Ramos  //
//////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio13 { 
public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    int n1,n2,n3;
    
    System.out.print("Introduce el primer n�mero: ");
    n1=s.nextInt();
    
    System.out.print("Introduce el primer n�mero: ");
    n2=s.nextInt();
    
    System.out.print("Introduce el primer n�mero: ");
    n3=s.nextInt();
    
    System.out.println("----------------------------------");
    
    if(n1>9 || n1<-9 || n2>9 || n2<-9 || n3>9 || n3<-9){
      System.out.print("[ DEBES INTRODUCIR N�MEROS DE UNA CIFRA ]");
    } else {
    System.out.println("El orden original de los n�meros: "+n1+n2+n3);
    
    int o1,o2,o3;
    if(n1>n2 && n1>n3){
      o1=n1;
      if(n2>n3){
        o2=n2;
        o3=n3;
      } else {
        o2=n3;
        o3=n2;
      }
    } else if(n2>n1 && n2>n3){
      o1=n2;
      if(n1>n3){
        o2=n1;
        o3=n3;
      } else {
        o2=n3;
        o3=n1;
      }
    } else {
      o1=n3;
      if(n1>n2){
        o2=n1;
        o3=n2;
      } else {
        o2=n2;
        o3=n1;
      }
    }
    
    System.out.println("El orden ordenado de los n�meros: "+o1+o2+o3);
  }
}
}
