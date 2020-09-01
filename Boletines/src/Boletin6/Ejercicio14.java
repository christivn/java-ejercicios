/////////////////////////////////////
//  Ejercicio14 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
     
    Scanner s = new Scanner(System.in);
        
    int oportunidades=0;

    int izq=0;
    int der=100;
    int med=(int)(Math.random()*98)+1;
    
    int b=0;

    System.out.println("[ PIENSA EN UN NÚMERO DEL 0 AL 100 ]");
    
    while(oportunidades!=7){
        System.out.println("-----------------------------------------");
        
        if(oportunidades!=6){
            System.out.println("[ Quedan "+(6-oportunidades)+" oportunidades ]");
        } else {
            System.out.println("[ Es tu ultima oportunidad ]");
        }
        
        System.out.print("¿El número que estas pensando es el "+med+"? (S/N): ");
        String sn=s.next();
        sn=sn.toLowerCase();
        
        if(sn.equals("n")){
        System.out.print("El número que estas pensando es mayor o menor ("+med+"): ");
        String max_min=s.next();
        max_min=max_min.toLowerCase();
        
        if(max_min.equals("mayor")){
            izq=med;
            med=med+((der-med)/2);
            
            if(oportunidades==6){
                b=med;
            }
        }
        
        if(max_min.equals("menor")){
            der=med;
            
            if(oportunidades==6){
                med=med-((der-med)/2)-1;
                b=med;
            } else {
                med=med-((der-med)/2);
            }
        }
        
        med=(der+izq)/2;
        oportunidades++;
        }
        
        
        if(sn.equals("s")){
            b=med;
            oportunidades=7;
        }
    }
    System.out.println("-----------------------------------------");
    System.out.println("[ EL NÚMERO EN EL QUE PENSABAS ES EL "+b+" ]");
    
    }
}
