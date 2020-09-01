/////////////////////////////////////
//  Ejercicio26 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num=s.nextInt();
    
    System.out.print("Introduce el dígito a buscar: ");
    int dig=s.nextInt();
    
    System.out.println("--------------------------------");
    
    int po=0;
    
    int y=num%10;
    int x=0;
    int a=100;
    int b=10;
    
    String str=String.valueOf(num);
    int snum=str.length();
    
    for(int i=0;i<snum;i++){
        if(i==0){
            x=num%10;
            po++;
        } else {
            x=((num%a)-y)/b;
            a=a*10;
            b=b*10;
            po++;
        }
        if(x==dig){
            System.out.println("La posición del dígito "+dig+" en el número "+num+" es la: "+(snum-po+1));
        }
    }
    
    
        
    }
}
