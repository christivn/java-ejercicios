//////////////////////////////////////
//  Ejercicio 12 - Christian Ramos  //
//////////////////////////////////////

package Boletin2;
import java.util.Scanner;

public class Ejercicio12 {
public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Introduce la base imponible: ");
  double base = s.nextInt();
  
  System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido):");
  String iva = s.next();
  int total_iva;
  
  if(iva.equals("general")){
    total_iva=21;
    } else if(iva.equals("reducido")){
    total_iva=10;
    } else{
    total_iva=4;
    }
  
  System.out.print("Introduzca el c�digo promocional (nopro, mitad, meno5 o 5porc):");
  String promo = s.next();
  
  double precio_iva=base+((total_iva*base)/100);
  double total=precio_iva;
  
  if(promo.equals("mitad")){
    total=precio_iva/2;
  } else if(promo.equals("meno5")){
    total=precio_iva-5;
  } else if(promo.equals("5porc")){
    total=precio_iva-((precio_iva*5)/100);
  } else {
    total=precio_iva;
    promo="nopro";
  }
  
  System.out.println("\n\nBase imponible: \t"+base);
  System.out.println("IVA: \t\t\t"+total_iva+"%");
  System.out.println("Precio con IVA: \t"+precio_iva);
  System.out.println("Cod. Promo: \t\t"+promo);
  System.out.println("-------------------------------");
  System.out.println("Total: \t\t\t"+total);
}
}
