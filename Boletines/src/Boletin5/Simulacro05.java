/////////////////////////////////////
//  Simulacro05 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;
public class Simulacro05 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    boolean check=false;
    int op=0;
    
    while(check==false){
    System.out.println("----------------------------------------------------------");
    System.out.println("1) Números divisibles entre 3");
    System.out.println("2) Números múltiplos de 5");
    System.out.println("Escriba \"cerrar programa\" para finalizar el programa");
    System.out.println("----------------------------------------------------------");
    System.out.print("Elija una de las siguientes opciones: ");
    String menu=s.next();
    
    int mult=0;
    
    switch(menu.toLowerCase()){
        case "1":
            mult=3;
            op++;
        break;
        
        case "2":
            mult=5;
            op++;
        break;
        
        case "cerrar programa":
            check=true;
        break;
        
        default:
            System.out.println("\n[ DEBES INTRODUCIR UNA OPCIÓN VALIDA ]");
        break;
    }
    
    System.out.println("----------------------------------------------------------");
    
    for(int i=0;i<100;i++){
        if((i%mult)==0){
            System.out.print(i+", ");
        }
    }
    
    System.out.println("\n----------------------------------------------------------");
    System.out.print("Escriba \"cerrar programa\" para finalizar el programa o seguir para continuar: ");
    menu=s.next();
    
    if(menu.toLowerCase().equals("cerrar")){
        check=true;
    }
    System.out.println("");
    }
    
    System.out.println("Se han elegido "+op+" opciones");
    }
}
