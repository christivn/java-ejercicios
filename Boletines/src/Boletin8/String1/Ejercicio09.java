/////////////////////////////////////
//  Ejercicio09 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String1;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    for(;;){
    System.out.println("+----------------------------------+");
    System.out.println("| 1. Cifrar cadena de texto        |");
    System.out.println("| 2. Descifrar cadena de texto     |");
    System.out.println("| 3. Salir                         |");
    System.out.println("+----------------------------------+");
    System.out.print("Selecciona una opción: ");
    String menu=s.next();
    System.out.print("\n");
    
    switch(menu){
    case "1":
    System.out.print("Introduce una cadena de texto: ");
    Scanner cadena_texto = new Scanner(System.in);
    String str=cadena_texto.nextLine();
    
    System.out.print("Introduce un número entre el 1 y el 25: ");
    String str_num=s.next();
    int num=Integer.parseInt(str_num);
    
    String str_ascii="";
    for(int i=0;i<str.length();i++){
        char caracter=str.charAt(i);
        int ascii=(int)caracter+num;
        char c = (char)ascii;
        str_ascii+=c;
    }
    
    System.out.println("\nEl texto cifrado es: ");
    System.out.println(str_ascii);
    
    System.out.println("Presiona (ENTER) para continuar...");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    break;
    
    case "2":
    System.out.print("Introduce una cadena de texto: ");
    Scanner cadena_texto2 = new Scanner(System.in);
    String str2=cadena_texto2.nextLine();
    
    System.out.print("Introduce un número entre el 1 y el 25: ");
    String str_num2=s.next();
    int num2=Integer.parseInt(str_num2);
    
    String str_ascii2="";
    for(int i=0;i<str2.length();i++){
        char caracter2=str2.charAt(i);
        int ascii2=(int)caracter2-num2;
        char c2 = (char)ascii2;
        str_ascii2+=c2;
    }
    
    System.out.println("\nEl texto descifrado es: ");
    System.out.println(str_ascii2);
    
    System.out.println("Presiona (ENTER) para continuar...");
    Scanner scanner2 = new Scanner(System.in);
    scanner2.nextLine();
    break;
    
    case "3":
        System.exit(0);
    break;
    
    default:
        System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]");
    break;
    }
    
    }
    }
}
