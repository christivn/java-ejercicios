/////////////////////////////////////
//  Examen03 - Christian Ramos     //
/////////////////////////////////////

package Boletin8.String2;

import java.util.Scanner;
import static Boletin8.String2.Examen03_Funciones.vocal;
import static Boletin8.String2.Examen03_Funciones.minusculaChar;

public class Examen03 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
        
    String caracter="a";
    while(vocal(caracter) || caracter.length()>1){
       System.out.print("\nEscriba un caracter: ");
        caracter=s.next();
        
        if(caracter.length()==1){
        char[] char_caracter=caracter.toCharArray();
        if(minusculaChar(char_caracter[0])==false){
            caracter=caracter.toLowerCase();
        }
        
        if(vocal(caracter)){
            System.out.println("La "+caracter+" es una vocal.");
        } else {
            System.out.println("La "+caracter+" no es una vocal. Hasta pronto.");
        }
        
        } else {
            System.out.println("[ El valor que has introducido es más de un caracter ]");
        }
    }
    
    }
}
