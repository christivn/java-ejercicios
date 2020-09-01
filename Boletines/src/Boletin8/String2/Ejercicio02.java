/////////////////////////////////////
//  Ejercicio02 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String str="Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar";
    str=str.replaceAll(" +", " ");
    System.out.println("String Original: "+str);
    
    for(;;){
    System.out.print("\nIntroduce una vocal por teclado: ");
    String vocal=s.next();
    vocal=vocal.substring(0,1).toLowerCase();
    System.out.print("\n");
    if("a".equals(vocal) || "e".equals(vocal) || "i".equals(vocal) || "o".equals(vocal) || "u".equals(vocal)){
        String str_aux;
        str_aux=str.replaceAll("a", vocal);
        str_aux=str_aux.replaceAll("e", vocal);
        str_aux=str_aux.replaceAll("i", vocal);
        str_aux=str_aux.replaceAll("o", vocal);
        str_aux=str_aux.replaceAll("u", vocal);
    
        System.out.println("String Cambiado: "+str_aux);
        break;
    } else {
        System.out.println("[ DEBES DE INTRODUCIR UNA VOCAL ]");
    }
    }
    
    }
}
