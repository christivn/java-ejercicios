/////////////////////////////////////
//  Ejercicio 7 - Christian Ramos  //
/////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce la base imponible: ");
  double base = s.nextInt();
  
  System.out.print("Introduce la cuota tributaria (% IVA): ");
  int cuota = s.nextInt();
  
  double cuota_total = (base*cuota)/100;
  double total = base+cuota;
  
  System.out.println("\nEl total de la factura es: "+total);
}
}
