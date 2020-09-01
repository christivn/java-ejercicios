/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio05 {
    public static void main(String[] args) {
    
    int max=0;
    int min=0;
    
    int media=0;
    int cont=0;
    
    for(int i=1;i<=50;i++){
        int rand=100+((int)(Math.random()*99));
        System.out.print(rand+" ");
        
        if(i==1){
            min=rand;
        }
        
        if(rand>max){
            max=rand;
        } else if (rand<min){
            min=rand;
        }
        
        cont++;
        media+=rand;
        
        if((i%10)==0){
            System.out.println("\n");
        }
    }
    
    System.out.println("-----------------------------------------");
    System.out.println("Número máximo: "+max);
    System.out.println("Número mínimo: "+min);
    System.out.println("Media: "+(media/cont)+"\n");
    
    }
}
