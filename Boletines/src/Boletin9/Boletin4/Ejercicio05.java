/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;
import Boletin9.Boletin4.Clases.CuentaCorriente;

public class Ejercicio05 {
    public static void main(String[] args) {
    
    CuentaCorriente cuenta01=new CuentaCorriente("Manolo");
    CuentaCorriente cuenta02=new CuentaCorriente("Laura",100);
    
    System.out.println(cuenta01);
    System.out.println(cuenta02);
    
    System.out.println("\n");
    
    cuenta01.imposicion(50);
    cuenta02.reintegro(25);
    System.out.println(cuenta01);
    System.out.println(cuenta02);
    
    System.out.println("\n");
    
    cuenta02.traspaso(cuenta01,50);
    System.out.println(cuenta01);
    System.out.println(cuenta02);
    
    }
}
