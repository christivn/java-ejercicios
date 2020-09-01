/////////////////////////////////////
//  Sorteo_opcional - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorteo_opcional {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    Scanner a = new Scanner(System.in);
    
    System.out.println("+------------------------------+");
    System.out.println("|     SORTEO PARTICIPANTES     |");
    System.out.println("+------------------------------+");
    
    String str_personas="";
    
        System.out.print("\nIntroduce los Participantes separados por comas: ");
        str_personas=s.nextLine();
        
        String[] personas = new String[0];
        ArrayList<String> participantes = new ArrayList<>(Arrays.asList(personas));
        
        String[] todos = str_personas.split(",");
        for(int i=0;i<todos.length;i++){
            participantes.add(todos[i]);
        }

        for(;;){
        int index_ganador=(int)(Math.random()*participantes.size());
        String ganador=participantes.get(index_ganador);
        participantes.remove(index_ganador);
        
        System.out.println("\nEl ganador del sorteo a sido: "+ganador);
        System.out.println(ganador+" ha sido eliminado de la lista");
        
        System.out.print("\nSi quieres salir escribe [sino sigues con la misma lista] (salir): ");
        String salir=a.next();
        salir=salir.toLowerCase();
            if(salir.equals("salir")){
                System.exit(0);
            }
    }
    
    }
}
