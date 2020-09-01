/////////////////////////////////////
//  Simulacro03 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;
public class Simulacro03 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    boolean check=false;
    int max=0;
    int etiqueta_max=0;
    int altura=0;
    
    for(int i=0;check!=true;i++){
    
    while(altura<=0){
        System.out.print("Altura del árbol ("+i+"): ");
        altura=s.nextInt();
        
        if(altura<0){
            System.out.print("La altura debe ser un número positivo.");
            System.out.println("\n");
        }
        if(altura==0){
            System.out.print("La altura no puede ser cero.");
            System.out.println("\n");
        }
    }
    
    if(altura>max){
        max=altura;
        etiqueta_max=1;
    }
    
    altura=0;
    System.out.print("¿Quiere salir? (Escriba: FIN PROGRAMA o SEGUIR): ");
    String seguir=s.next();
    seguir=seguir.toLowerCase();
    System.out.println("");

    if(seguir.equals("fin")){
        check=true;
    } else if(seguir.equals("seguir")){
        check=false;
    } else {
        System.out.print("[ INTRODUCE UNA OPCIÓN VÁLIDA ]\n");
        System.out.print("¿Quiere salir? (Escriba: FIN PROGRAMA o SEGUIR): ");
        seguir=s.next();
        System.out.println("");
    }

    }
    
    System.out.println("------------------------------");
    System.out.println("El árbol más alto mide: "+max);
    System.out.println("Corresponde al árbol con etiqueta: "+etiqueta_max);
    }
}
