/////////////////////////////////////
//  Ejercicio02 - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4;
import Boletin9.Boletin4.Clases.Planeta;

public class Ejercicio02 {
    public static void main(String[] args) {
    
    Planeta tierra=new Planeta("Tierra", 20321, 123234, 1, 365, 102342);
    Planeta marte=new Planeta("Marte");
    Planeta jupiter=new Planeta("Jupiter", 60321, 253234, 16, 665, 202323);
    
    System.out.println(tierra+"\n\n"+marte+"\n\n"+jupiter);
    
    }
}
