/////////////////////////////////////
//  Simulacro06 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;
public class Simulacro06 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    boolean check=true;
    while(check){
    
    System.out.print("Escriba un número entero: ");
    int num=s.nextInt();
    int sumar=0;
    
    for(int i=0;((num+i)%7)!=0;i++){
        sumar=sumar+1;
    }
    System.out.println("Hay que sumarle "+sumar+" para que sea múltiplo de 7");
    
    System.out.print("¿Quiere salir del programa? (escriba FIN PROGRAMA en tal caso): ");
    String seguir=s.next();
    seguir=seguir.toLowerCase();
    if(seguir.equals("fin")){
        check=false;
    }
    System.out.println("");   
    }
    }
}
