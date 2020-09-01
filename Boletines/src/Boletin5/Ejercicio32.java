/////////////////////////////////////
//  Ejercicio32 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número entero positivo: ");
    int num=s.nextInt();
    
    String snum=String.valueOf(num);
    int tamano=snum.length();
    
    int mul=1;
    int mul1=10;
    
    int dig=0;
    int suma=0;
    
    System.out.print("Dígitos pares: ");
    for(int i=0;i<tamano;i++){
        if(i==0){
        dig=((num/1)-(num%1))-((num/1)-(num%10));
        } else {
        dig=(((num/1)-(num%mul))-((num/1)-(num%mul1)))/mul;
        }
        
        if((dig%2)==0){
            System.out.print(dig+" ");
            suma+=dig;
        }
        
        mul=mul*10;
        mul1=mul1*10;
    }
    
    System.out.print("\nSuma de los dígitos pares: "+suma+"\n");
    }
}
