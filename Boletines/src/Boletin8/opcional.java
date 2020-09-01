/////////////////////////////////////
//  opcional - Christian Ramos     //
/////////////////////////////////////

package Boletin8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class opcional {
    public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    Scanner a = new Scanner(System.in);
    
    String[] participantes = new String[0];
    ArrayList<String> lista_participantes = new ArrayList<>(Arrays.asList(participantes));
    
    for(;;){
    System.out.println("+--------------------------+");
    System.out.println("|       <[ SORTEO ]>       |");
    System.out.println("+--------------------------+");
    System.out.println(" 1. Añadir participantes");
    System.out.println(" 2. Lista de participantes");
    System.out.println(" 3. Realizar sorteo");
    System.out.println(" 4. Salir");
    System.out.println("+--------------------------+");
    System.out.print("Selecciona una opción: ");
    int menu=s.nextInt();
    System.out.println("+--------------------------+");
    
    switch(menu){
    case 1:
    boolean check=true;
    String persona="";
    for(int i=0;check;i++){
        if(i==0){ s.nextLine(); }
        System.out.print("Introduce los participantes (separados por punto y coma) : ");
        persona=s.nextLine();
        
        int punto_comas=0;
        int ocurrencias=0;
        String substr="";
        
        do{
            ocurrencias=persona.indexOf(";", ocurrencias+punto_comas);
            if(ocurrencias>0){
                substr=persona.substring(punto_comas,ocurrencias);
                lista_participantes.add(substr);
                punto_comas=0;
                punto_comas+=ocurrencias+1; 
            }
            
            if(ocurrencias==-1){
                substr=persona.substring(punto_comas,persona.length());
                lista_participantes.add(substr);
                break;
            }
        } while(ocurrencias>0);
        
        while(check){
            System.out.print("¿Quieres seguir introduciendo participantes? (S/N): ");
            String op=a.next();
            op=op.toUpperCase();
                if(op.equals("S")){
                    System.out.print("+-------------------------------------------------+\n");
                    break;
                } else 
                    if(op.equals("N")){
                        System.out.print("\n");
                        check=false;
                    } else {
                        System.out.print("[ DEBES DE INTRODUCIR UNA OPCIÓN VÁLIDA ]\n");
                }
        }
    }
    break;
       
    
    case 2:
        System.out.println("   LISTA DE PARTICIPANTES");
        System.out.println("+--------------------------+");
        
        if(lista_participantes.isEmpty()){
            System.out.println("No hay participantes");
        }
        
        for(int i=0;i<lista_participantes.size();i++){
            System.out.println((i+1)+". "+lista_participantes.get(i));
        }
        System.out.print("\n");
        
        System.out.print("[ Pulsa cualquier tecla para volver al menu ]");
        System.in.read();
        System.out.print("\n");
    break;
        
    
    case 3:
        System.out.println("           SORTEO");
        System.out.println("+--------------------------+");

        if(lista_participantes.isEmpty()){
            System.out.println("No hay participantes");
        }

        if(lista_participantes.size()>=3){
            String ganador_1=participantes(lista_participantes);
            
            String ganador_2=ganador_1;
            while(ganador_2.equals(ganador_1)){
                ganador_2=participantes(lista_participantes);
            }
            
            String ganador_3=ganador_1;
            while(ganador_3.equals(ganador_1) || ganador_3.equals(ganador_2)){
                ganador_3=participantes(lista_participantes);
            }
        
            System.out.println(sorteo()+" - "+ganador_1);
            System.out.println(sorteo()+" - "+ganador_2);
            System.out.println(sorteo()+" - "+ganador_3);
        } else {
         if(lista_participantes.size()==2){
            String ganador_1=participantes(lista_participantes);
            
            String ganador_2=ganador_1;
            while(ganador_2.equals(ganador_1)){
                ganador_2=participantes(lista_participantes);
            }
        
            System.out.println(sorteo()+" - "+ganador_1);
            System.out.println(sorteo()+" - "+ganador_2);
        } else {
          if(lista_participantes.size()==1){
            String ganador_1=participantes(lista_participantes);
        
            System.out.println(sorteo()+" - "+ganador_1);
        }
         }
        }
        
        System.out.print("\n");
    break;
    
    
    case 4:
        System.exit(0);
    break;
    
    
    default:
        System.out.print("[ DEBES DE INTRODUCIR UNA OPCIÓN VÁLIDA ]\n");
    break;
     }
    }
}
    
    public static String sorteo() {
        int rand=(int)(Math.random()*101);

        int num_premio=0;
        if(rand==0){
            num_premio=0;
        } else {
            if(rand>0 && rand<=29){
                num_premio=1;
            } else {
                if(rand>29 && rand<=100){
                    num_premio=2;
                }
            }
        }
        
        String str_premio="";
            switch(num_premio){
            case 0: str_premio="PC de alta gama"; break;
            case 1: str_premio="Portátil Low Cost"; break;
            case 2: str_premio="Teclado inalámbrico a elegir"; break;
        }
        return str_premio;
    }
    
    public static String participantes(ArrayList lista_participantes) {
        int rand=(int)(Math.random()*lista_participantes.size());
        String participante=(String)lista_participantes.get(rand);
        return participante;
    }
    
}