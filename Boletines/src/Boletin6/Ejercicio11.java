/////////////////////////////////////
//  Ejercicio11 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio11 {
    public static void main(String[] args) {
        
    int suspenso=0;
    int suficiente=0;
    int bien=0;
    int notable=0;
    int sobresaliente=0;
        
    for(int i=0;i<20;i++){
        int rand=(int)(Math.random()*(11));
        if(rand<5){
            System.out.println(rand+" - Suspenso");
            suspenso++;
        }
        
        if(rand==5){
            System.out.println(rand+" - Suficiente");
            suficiente++;
        }
        
        if(rand==6){
            System.out.println(rand+" - Bién");
            bien++;
        }
        
        if(rand>=7 && rand<=8){
            System.out.println(rand+" - Notable");
            notable++;
        }
        
        if(rand>=9 && rand<=10){
            System.out.println(rand+" - Sobresaliente");
            sobresaliente++;
        }
    }
    
    System.out.println("-----------------------------------");
    System.out.println("Suspensos: "+suspenso);
    System.out.println("Suficientes: "+suficiente);
    System.out.println("Bienes: "+bien);
    System.out.println("Notables: "+notable);
    System.out.println("Sobresalientes: "+sobresaliente);
    
        
    }
}
