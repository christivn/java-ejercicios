/////////////////////////////////////
//  Extra03 - Christian Ramos      //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Extra03 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    System.out.print("Cantidad de puntos a procesar: ");
    int puntos=s.nextInt();
    
    System.out.println("--------------------------------------");
    
    for(int i=0;i<puntos;i++){
    System.out.println("\n[ PUNTO DE COORDENADAS "+(i+1)+" ]");
    System.out.print("Introduce el valor x: ");
    int x=s.nextInt();
    
    System.out.print("Introduce el valor y: ");
    int y=s.nextInt();
    
    System.out.println("--------------------------------------");
    
    if(x!=0 && y!=0){
    if(x>=1 && y>=1){
        System.out.println("El punto de coordenadas está en el primer cuadrante");
    }
    
    if(x<=-1 && y>=1){
        System.out.println("El punto de coordenadas está en el segundo cuadrante");
    }
    
    if(x<=-1 && y<=-1){
        System.out.println("El punto de coordenadas está en el tercer cuadrante");
    }
    
    if(x>=1 && y<=-1){
        System.out.println("El punto de coordenadas está en el cuarto cuadrante");
    }
    }
    
    if(x==0){
        System.out.println("El punto está en el eje de las x");
    }
    
    if(y==0){
        System.out.println("El punto está en el eje de las y");
    }
    
    System.out.println("--------------------------------------\n");
    
    }
        
    }
}
