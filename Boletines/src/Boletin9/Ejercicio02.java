/////////////////////////////////////
//  Ejercicio02 - Christian Ramos  //
/////////////////////////////////////

package Boletin9;
import Boletin9.Clases.Bicicleta;
import Boletin9.Clases.Coche;
import Boletin9.Clases.Vehiculo;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner a = new Scanner(System.in);
    
    for(;;){
    System.out.println("VEHÍCULOS\n" +
                    "=========\n" +
                    "1. Anda con la bicicleta\n" +
                    "2. Haz el caballito con la bicicleta\n" +
                    "3. Anda con el coche\n" +
                    "4. Quema rueda con el coche\n" +
                    "5. Ver kilometraje de la bicicleta\n" +
                    "6. Ver kilometraje del coche\n" +
                    "7. Ver kilometraje total\n" +
                    "8. Salir");
    System.out.print("Elige una opción (1-8): ");
    String menu=s.next();
    System.out.print("\n");
    
    Coche coche=new Coche("Ford", "Mustang", 120000);
    Bicicleta bici=new Bicicleta("Scott", "scale 930");
    
    int km;
    switch(menu){
        case "1":
            System.out.print("¿Cuantos km va ha hacer con la bicicleta?: ");
            km=a.nextInt();
            bici.addKilometros(km);
            System.out.println("\n");
        break;
        
        case "2":
            bici.caballito();
            System.out.println("\n");
        break;
        
        case "3":
            System.out.print("¿Cuantos km va ha hacer con el coche?: ");
            km=a.nextInt();
            coche.addKilometros(km);
            System.out.println("\n");
        break;
        
        case "4":
            coche.quemarRueda();
            System.out.println("\n");
        break;
        
        case "5":
            System.out.println("El kilometraje de la "+bici.getMarca()+" es: "+bici.getKilometrosRecorridos()+"\n");
        break;
        
        case "6":
            System.out.println("El kilometraje del "+coche.getMarca()+" es: "+coche.getKilometrosRecorridos()+"\n");
        break;
                
        case "7":
            System.out.println("El kilometraje total es: "+Vehiculo.getKilometrosTotales()+"\n");
        break;
       
        case "8":
            System.exit(0);
        break;
        
        default:
            System.out.println("[ DEBES DE INTRODUCIR UNA OPCIÓN VÁLIDA ]");
        break;
    }
    }
    
    }
}
