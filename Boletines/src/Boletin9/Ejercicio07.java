/////////////////////////////////////
//  Ejercicio07 - Christian Ramos  //
/////////////////////////////////////

package Boletin9;

import Boletin9.Clases.Zona;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
    Scanner a=new Scanner(System.in);
    Scanner b=new Scanner(System.in);
    
    Zona zona1=new Zona(1000);
    Zona zona2=new Zona(200);
    Zona zona3=new Zona(25);
    
    for(;;){
    System.out.println("1. Mostrar número de entradas libres\n" +
                        "2. Vender entradas\n" +
                        "3. Salir");
    System.out.print("Elige una opción (1-3): ");
    String menu=a.next();
    
    switch(menu){
        case "1":
            System.out.println("\nEntradas libres Zona 1 (Principal): "+zona1.getEntradasPorVender());
            System.out.println("Entradas libres Zona 2 (Compra-Venta): "+zona2.getEntradasPorVender());
            System.out.println("Entradas libres Zona 3 (VIP): "+zona3.getEntradasPorVender()+"\n");
        break;
        
        case "2":
            String zona;
            String str_vender;
            System.out.println("\n1. Zona 1 (Principal)");
            System.out.println("2. Zona 2 (Compra-Venta)");
            System.out.println("3. Zona 3 (VIP)");
            System.out.print("Introduce una zona (1-3): ");
            zona=b.next();
            
            System.out.print("¿Cuantas entradas vas a vender?: ");
            str_vender=b.next();
            int vender=Integer.parseInt(str_vender);
            
            switch(zona){
                case "1":
                    System.out.println("\nSe han vendido "+vender+" entradas de la Zona 1 (Principal)");
                    zona1.vender(vender);
                break;
                
                case "2":
                    System.out.println("\nSe han vendido "+vender+" entradas de la Zona 2 (Compra-Venta)");
                    zona2.vender(vender);
                break;
                
                case "3":
                    System.out.println("\nSe han vendido "+vender+" entradas de la Zona 3 (VIP)");
                    zona3.vender(vender);
                break;
                
                default:
                    System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]");
                break;
            }
            System.out.print("\n");
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
