/////////////////////////////////////
//  Ejercicio29 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    boolean check=false;
    while(check==false){
    System.out.println("\nPor favor, introduzca la primera hora");
    System.out.print("Dia: ");
    String dia1=s.next();
    System.out.print("Hora: ");
    int hora1=s.nextInt();
    
    System.out.println("\nPor favor, introduzca la segunda hora");
    System.out.print("Dia: ");
    String dia2=s.next();
    System.out.print("Hora: ");
    int hora2=s.nextInt();
    
    System.out.println("-------------------------------------");
    
    int n_dia1=0;
    switch(dia1.toLowerCase()) {
        case "lunes":
        case "1":
            dia1="lunes";
            n_dia1=1;
        break;
         
        case "martes":
        case "2":
            dia1="martes";
            n_dia1=2;
        break;
        
        case "miercoles":
        case "3":
            dia1="miercoles";
            n_dia1=3;
        break;
        
        case "jueves":
        case "4":
            dia1="jueves";
            n_dia1=4;
        break;
        
        case "viernes":
        case "5":
            dia1="viernes";
            n_dia1=5;
        break;
        
        case "sabado":
        case "6":
            dia1="sabado";
            n_dia1=6;
        break;
        
        case "domingo":
        case "7":
            dia1="domingo";
            n_dia1=7;
        break;
        
        default:
            System.out.println("[ EL DÍA INTRODUCIDO NO ES VALIDO ]");
}
    
    int n_dia2=0;
    switch(dia2.toLowerCase()) {
        case "lunes":
        case "1":
            dia2="lunes";
            n_dia2=1;
        break;
         
        case "martes":
        case "2":
            dia2="martes";
            n_dia2=2;
        break;
        
        case "miercoles":
        case "3":
            dia2="miercoles";
            n_dia2=3;
        break;
        
        case "jueves":
        case "4":
            dia2="jueves";
            n_dia2=4;
        break;
        
        case "viernes":
        case "5":
            dia1="viernes";
            n_dia1=5;
        break;
        
        case "sabado":
        case "6":
            dia2="sabado";
            n_dia2=6;
        break;
        
        case "domingo":
        case "7":
            dia2="domingo";
            n_dia2=7;
        break;
        
        default:
            System.out.println("[ EL DÍA INTRODUCIDO NO ES VALIDO ]");
}
    
    if(hora1<24 && hora1>0 && hora2<24 && hora2>0 && hora1<=hora2 && hora1!=hora2){
    if(n_dia2>=n_dia1){
    int d_horas=(n_dia2-n_dia1)*24;
    int h_horas=(hora1-hora2)*-1;
    
    System.out.println("Entre las "+hora1+":00h del "+dia1+" y las "+hora2+":00h del "+dia2+" hay "+(d_horas+h_horas)+" hora/s");
    check=true;
    } else {
        System.out.println("[ EL PRIMER DÍA DEBE DE SER MAYOR AL SEGUNDO ]");
    }
    
    } else {
        System.out.println("[ DEBES DE INTRODUCIR UNA HORA VALIDA ]");
    }
    
    }
    }
}

