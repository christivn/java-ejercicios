/////////////////////////////////////
//  Simulacro01 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String2;
import java.util.Scanner;

public class Simulacro01 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Bienvenido al gestor de anuncios de MotoGP");
    
    int num_a;
    for(;;){
    System.out.print("\n¿Cuantos anunciantes quieres gestionar?: ");
    String num_anunciantes=s.next();
    try{
        num_a=Integer.parseInt(num_anunciantes);
        break;
    } catch(NumberFormatException e){
        System.out.print("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]");
    }
    }
    
    String[][]anunciantes=new String[num_a][3];
    // 0: Nombre de la marca
    // 1: Tiempo de anuncio (en segundos)
    // 2: Número de anuncios
    anunciantes=ingresar_anunciante(anunciantes);
    int[]cuentas=new int[3];
    // 1: descuento
    // 2: total €
    
    for(;;){
        System.out.println("\nBienvenido al gestor de anuncios de televisión\n");
        System.out.println("1. Registro de anuncios");
        System.out.println("2. Importe gastado");
        System.out.println("3. Porcentaje de descuento");
        System.out.println("4. Total a pagar");
        System.out.println("5. Salir");
        System.out.print("Elija una de las siguientes opciones: ");
        String menu=s.next();
        
        switch(menu){
            case "1":
                anunciantes=registro_anuncio(anunciantes);
            break;
            
            case "2":
                cuentas=importe_gastado(anunciantes,cuentas);
            break;
            
            case "3":
                cuentas=descuento(anunciantes,cuentas);
            break;
            
            case "4":
                cuentas=total_pagar(anunciantes,cuentas);
            break;
            
            case "5":
                salir(cuentas);
                resumen(anunciantes,cuentas);
                System.exit(0);
            break;
            
            default:
                System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]");
            break;
        }
    }
    
    }
    
    
    
    public static String[][] ingresar_anunciante(String[][] anunciantes) {
        Scanner a = new Scanner(System.in);
        System.out.print("\n");
        
        for(int i=0;i<anunciantes.length;i++){
            
            String nombre_anunciante;
            for(;;){
                System.out.print("Ingrese el nombre del anunciantes ("+(i+1)+"): ");
                nombre_anunciante=a.nextLine();
                nombre_anunciante=nombre_anunciante.toUpperCase();
                
                if(!nombre_anunciante.equals("")){
                    break;
                }
            }
            
            if(nombre_anunciante.length()<5){
                int giones=5-nombre_anunciante.length();
                for(int x=0;x<giones;x++){
                    nombre_anunciante+="-";
                }
            }
            
            anunciantes[i][0]=nombre_anunciante;
        }
        
        System.out.println("El listado de marcas es:");
        for (String[] anunciante : anunciantes) {
            System.out.print("\t" + anunciante[0]);
        }
        
        System.out.print("\n");
        return anunciantes;
    }
    
    
    
    public static void pintar_anunciantes (String[][] anunciantes) {
        for(int i=0;i<anunciantes.length;i++){
            System.out.println((i+1)+" "+anunciantes[i][0]);
        }
    }
    
    
    
    public static String[][] registro_anuncio(String[][] anunciantes) {
        Scanner b = new Scanner(System.in);
        
        System.out.print("\n");
        pintar_anunciantes(anunciantes);
        
        String num_anunciante;
        int num_a;
        for(;;){
            System.out.print("¿Que anunciante quiere elegir?: ");
            num_anunciante=b.next();
            try{
                num_a=Integer.parseInt(num_anunciante);
                if(num_a>anunciantes.length || num_a<0){
                    System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]\n");
                } else {
                    break;
                }
            } catch(NumberFormatException e){
                System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]\n");
            }
        }
        
        
        System.out.println("Usted ha elegido el anunciante "+anunciantes[(num_a-1)][0]);
        
        
        String hora;
        int num_hora;
        int cont=0;
        for(;;){
            if(cont==0){
                System.out.print("¿En que hora da comienzo el anuncio?(escriba solo la hora): ");
            } else {
                System.out.print("Escriba una hora válida (0-23): ");
            }
            hora=b.next();
            
            try{
                num_hora=Integer.parseInt(hora);
                if(num_hora>23 || num_hora<0){
                    System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]");
                    cont++;
                } else {
                    break;
                }
            } catch(NumberFormatException e){
                System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]");
                cont++;
            }
        }
        
        
        System.out.println("El anunciante "+anunciantes[(num_a-1)][0].substring(0,1)+anunciantes[(num_a-1)][0].substring(anunciantes[(num_a-1)][0].length()-1,anunciantes[(num_a-1)][0].length())+" ha registrado un anuncio a las "+num_hora+" horas");
        
        
        String tiempo;
        int num_tiempo;
        cont=0;
        for(;;){
            if(cont==0){
                System.out.print("Duración del anuncio (en segundos): ");
            } else {
                System.out.print("Escriba una duración válida válida (maximo 180 segundos): ");
            }
            tiempo=b.next();
            
            try{
                num_tiempo=Integer.parseInt(tiempo);
                if(num_tiempo>180 || num_tiempo<0){
                    System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]");
                    cont++;
                } else {
                    break;
                }
            } catch(NumberFormatException e){
                System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]");
                cont++;
            }
        }
        
        anunciantes[num_a-1][1]=tiempo;
        
        String num_anuncios=anunciantes[num_a-1][2];
        int anuncios;
        try{
            anuncios=Integer.parseInt(num_anuncios)+1;
        } catch(NumberFormatException e){
            anuncios=1;
        }
        String str_num=Integer.toString(anuncios);
        if(anunciantes[num_a-1][2]==null){
            anunciantes[num_a-1][2]=str_num;
        } else {
            anunciantes[num_a-1][2]=str_num;
        }
        
        return anunciantes;
    }
    
    
    
    public static int[] importe_gastado(String[][] anunciantes, int[] cuentas) {
        int anuncios=0;
        int tiempo_total=0;
        int importe=0;
        
        for (String[] anunciante : anunciantes) {
            try {
                tiempo_total += Integer.parseInt(anunciante[1]);
            }catch(NumberFormatException e){
                tiempo_total+=0;
            }
            try {
                anuncios += Integer.parseInt(anunciante[2]);
            }catch(NumberFormatException e){
                anuncios+=0;
            }
        }
        
        importe+=anuncios*1500;
        importe+=tiempo_total*100;
        
        System.out.println("Su compañia lleva "+anuncios+" anuncios, con un tiempo total de "+tiempo_total+" segundos. El importe total de momento es: "+importe+"€");
        cuentas[0]=importe;
        return cuentas;
    }
    
    
    
    public static int[] descuento(String[][] anunciantes, int[] cuentas) {
        double descuento;
        int anuncios=0;
        
        for (String[] anunciante : anunciantes) {
            try {
                anuncios += Integer.parseInt(anunciante[2]);
            }catch(NumberFormatException e){
                anuncios+=0;
            }
        }
        
        if(anuncios==1){
            descuento=1;
        } else {
            descuento=Math.pow(anuncios,2);
        }
        
        if(descuento>90){
            descuento=90;
        }
        
        
        System.out.println("Usted tiene un descuento del: "+descuento+"%");
        cuentas[1]=(int)descuento;
        return cuentas;
    }
    
    
    public static int[] total_pagar(String[][] anunciantes, int[] cuentas) {
        double total_gastado;
        int anuncios=0;
        int tiempo_total=0;
        int importe=0;
        double descuento;
        
        for (String[] anunciante : anunciantes) {
            try {
                tiempo_total += Integer.parseInt(anunciante[1]);
            }catch(NumberFormatException e){
                tiempo_total+=0;
            }
            try {
                anuncios += Integer.parseInt(anunciante[2]);
            }catch(NumberFormatException e){
                anuncios+=0;
            }
        }
        
        importe+=anuncios*1500;
        importe+=tiempo_total*100;
        
        for (String[] anunciante : anunciantes) {
            try {
                anuncios += Integer.parseInt(anunciante[2]);
            }catch(NumberFormatException e){
                anuncios+=0;
            }
        }
        
        if(anuncios==1){
            descuento=1;
        } else {
            descuento=Math.pow(anuncios,2);
        }
        
        if(descuento>90){
            descuento=90;
        }
        
        total_gastado=importe-((importe*descuento)/100);
        
        System.out.println("Lleva gastado: "+total_gastado+"€");
        cuentas[3]=(int)total_gastado;
        return cuentas;
    }
    
    public static void salir(int[] cuentas) {
        if(cuentas[3]>=15000){
            System.out.println("Hasta pronto");
        } else {
            System.out.println("Le sugerimos contratar más anuncios la próxima vez para un descuento mayor.");
        }
    }
    
    
    public static void resumen(String[][] anunciantes, int[] cuentas) {
        double total_gastado;
        int anuncios=0;
        int tiempo_total=0;
        int importe=0;
        double descuento;
        
        for (String[] anunciante : anunciantes) {
            try {
                tiempo_total += Integer.parseInt(anunciante[1]);
            }catch(NumberFormatException e){
                tiempo_total+=0;
            }
            try {
                anuncios += Integer.parseInt(anunciante[2]);
            }catch(NumberFormatException e){
                anuncios+=0;
            }
        }
        
        importe+=anuncios*1500;
        importe+=tiempo_total*100;
        
        for (String[] anunciante : anunciantes) {
            try {
                anuncios += Integer.parseInt(anunciante[2]);
            }catch(NumberFormatException e){
                anuncios+=0;
            }
        }
        
        if(anuncios==1){
            descuento=1;
        } else {
            descuento=Math.pow(anuncios,2);
        }
        
        if(descuento>90){
            descuento=90;
        }
        
        total_gastado=importe-((importe*descuento)/100);
        
        System.out.print("\n\nEl número de anuncios registrados es: "+anuncios+" perteneciendo a los anunciantes(tal como fueron registrados): ");
        for (String[] anunciante : anunciantes) {
            System.out.print(anunciante[0].substring(0, 1) + anunciante[0].substring(anunciante[0].length() - 1, anunciante[0].length()) + " ");
        }
        System.out.print("\nEl precio final de los anuncios es: "+total_gastado+"€ Se la ha aplicado un descuento de: "+descuento+"%\n");
    }
}
