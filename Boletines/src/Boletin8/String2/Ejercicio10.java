/////////////////////////////////////
//  Ejercicio10 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    Scanner b=new Scanner(System.in);
    
    System.out.print("Introduce tu nombre: ");
    String nombre=a.next();
    nombre=nombre.toUpperCase().trim().replaceAll(" +", " ");
    
    System.out.print("Introduce tus apellidos: ");
    String str_apellidos=b.nextLine();
    str_apellidos=str_apellidos.toUpperCase().trim().replaceAll(" +", " ");
    String[] apellidos=str_apellidos.split(" ");
    
    System.out.print("\nLas iniciales de tu nombre son: "+nombre.substring(0,1)+"."+apellidos[0].substring(0,1)+"."+apellidos[1].substring(0,1)+"\n");
    }
}
