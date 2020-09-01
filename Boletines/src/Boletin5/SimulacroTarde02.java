/////////////////////////////////////
//  SimulacroTarde02 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class SimulacroTarde02 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int num=0;
    
    while(num<=0){
        System.out.print("Introduce un número: ");
        num=s.nextInt();
        
        if(num<=0){
            System.out.println("[ DEBES INTRODUCIR UN NÚMERO VÁLIDO ]\n");
        }
    }
    
    System.out.print("Los factores primos son: ");
    
    int dividendo=num;
    int cont=0;


    int contador=0;
    for(int i=2;i<(100+dividendo);i++){
      if(dividendo%i==0 && dividendo%dividendo==0 && dividendo%1==0){
        System.out.print(i+" ");
        dividendo=dividendo/i;
        contador++;
        cont++;
      }
    }
    
    for(int i=2;i<(100+dividendo);++i){
      if(dividendo%i==0 && dividendo%1==0){
        System.out.println(i);
        cont++;
      }
    }
    

    String scont="";
    switch(cont){
        case 0:
            scont="Ningún valor";
        break;
        
        case 1:
            scont="Uno";
        break;
        
        case 2:
            scont="Dos";
        break;
        
        case 3:
            scont="Tres";
        break;
        
        default:
            scont="Demasiados Valores";
        break;
    }
    
    System.out.println("\nEl número de factores es: "+scont);
    
    }
}
