/////////////////////////////////////
//  Ejercicio 4 - Christian Ramos  //
/////////////////////////////////////

package Boletin4;
import java.util.Scanner;

public class Ejercicio04 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce las horas trabajadas: ");
  int horas = s.nextInt();
  
  int ordinarias=0;
  int extras=0;
  
  if(horas<=40){
    ordinarias=horas*12;
  } else if(horas>40){
    ordinarias=40*12;
    extras=(horas-40)*16;
  }
  
  int salario=ordinarias+extras;
  
  System.out.println("----------------------------------------------");
  System.out.println("El salario semanal es de: "+salario+" euros");
  System.out.println("Horas ordinarias: "+(ordinarias/12));
  System.out.println("Horas extra: "+(extras/16));
}
}
