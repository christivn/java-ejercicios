/////////////////////////////////////
//  Ejercicio08 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce una cadena de caracteres: ");
    String str=s.next();
    
    int[] caracteres_ascii=new int[str.length()];
    
    System.out.print("\nLa cadena es ASCII es: ");
    for(int i=0;i<str.length();i++){
        char caracter=str.charAt(i);
        int ascii=(int)caracter;
        caracteres_ascii[i]=ascii;
        System.out.print(ascii+" ");
    }
    System.out.print("\n");
    
    System.out.print("La frase original es: ");
    for(int i=0;i<caracteres_ascii.length;i++){
        char texto=(char)caracteres_ascii[i];
        System.out.print(texto);
    }
    System.out.print("\n");
    
    }
}
