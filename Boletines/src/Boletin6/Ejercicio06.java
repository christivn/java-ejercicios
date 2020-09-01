/////////////////////////////////////
//  Ejercicio06 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int clave=(int)(Math.random()*(100+1));
    boolean check=false;
    
    for(int i=0;i<5;i++){
    System.out.println("[ Tienes "+(5-i )+" intentos ]");
    System.out.print("Introduce la clave: ");
    int pass=s.nextInt();
    
    if(pass>clave && pass!=clave){
        System.out.println("El número introducido es mayor a la clave");
        System.out.println("-------------------------------------------");
    } else {
        System.out.println("El número introducido es menor a la clave");
        System.out.println("-------------------------------------------");
    }
    
    if(pass==clave){
        i=5;
        check=true;
    }
    }
    
    if(check){
        System.out.println("[ HAS ACERTADO LA CLAVE!!! ]");
    } else {
        System.out.println("[ NO HAS PODIDO ACERTAR LA CLAVE :C ]");
        System.out.println("[ LA CLAVE ERA "+clave+" ]");
    }
        
    }
}
