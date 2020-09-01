/////////////////////////////////////
//  Ejercicio19 - Christian Ramos  //
/////////////////////////////////////

package Boletin8;
import static Funciones.CambioBase.decimal_binario;
import static Funciones.CambioBase.decimal_hexadecimal;
import static Funciones.CambioBase.decimal_octal;

import static Funciones.CambioBase.binario_decimal;
import static Funciones.CambioBase.octal_decimal;
import static Funciones.CambioBase.hexadecimal_decimal;

public class Ejercicio19 {
    public static void main(String[] args) {
    
        int decimal=26;
        System.out.println("Decimal: "+decimal);
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Decimal > Binario: "+decimal_binario(decimal));
        System.out.println("Decimal > Octal: "+decimal_octal(decimal));
        System.out.println("Decimal > Hexadecimal: "+decimal_hexadecimal(decimal));
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Binario("+decimal_binario(decimal)+") > Decimal: "+binario_decimal(decimal_binario(decimal)));
        System.out.println("Octal("+decimal_octal(decimal)+") > Decimal: "+octal_decimal(decimal_octal(decimal)));
        System.out.println("Hexadecimal("+decimal_hexadecimal(decimal)+") > Decimal: "+hexadecimal_decimal(decimal_hexadecimal(decimal)));
        
        System.out.println("\n");
    
    }


}
