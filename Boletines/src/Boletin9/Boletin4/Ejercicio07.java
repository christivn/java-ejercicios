/////////////////////////////////////
//  Ejercicio07 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;
import Boletin9.Boletin4.Clases.PrimitivoCheck;

public class Ejercicio07 {
    public static void main(String[] args) {
    
    byte by=0;
    short sh=0;
    char ch='a';
    int in=0;
    long lo=0;
    float fl=0;
    double dou=0;
    
    PrimitivoCheck check=new PrimitivoCheck(fl);
    System.out.println("Has introducido un valor de tipo "+check.getTipo());
    
    }
}
