/////////////////////////////////////
//  Ejercicio34 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un número: ");
    long num1=s.nextLong();
    long n1=num1;
    int tamano1=0;
    while(n1!=0){
        n1=n1/10;
        tamano1++;
    }

    System.out.print("Introduzca otro número: ");
    long num2=s.nextLong();
    long n2=num2;
    int tamano2=0;
    while(n2!=0){
        n2=n2/10;
        tamano2++;
    }
    
    int mayor=0;
    if(tamano1>tamano2){
        mayor=tamano1;
    } else {
        mayor=tamano2;
    }
    
    System.out.println("------------------------------------------------");
    System.out.print("El número formado por los dígitos pares es: ");
    
    long ultimo1=0;
    long dig1=0;
    long ultimo2=0;
    long dig2=0;
    
    int mul=1;
    
    
    for(int i=0;i<(mayor-1);i++){
        mul=mul*10;
    }
    
    for(int i=0;i<mayor;i++){
        if(i==0){
            ultimo1=num1/mul;
        } else {
            dig1=(num1/mul)-(ultimo1*10);
            ultimo1=(num1/mul);
        }
        
        if(i==0){
            ultimo2=num2/mul;
        } else {
            dig2=(num2/mul)-(ultimo2*10);
            ultimo2=(num2/mul);
        }
        
        
        
        if(i==0 && (ultimo1%2)==0){
            System.out.print(ultimo1);
        }
        if(i==0 && (ultimo2%2)==0){
            System.out.print(ultimo2);
        }

        if((dig1%2)==0 && i!=0){
            System.out.print(dig1);
        }
        
        if((dig2%2)==0 && i!=0){
            System.out.print(dig2);
        }
        
         mul=mul/10;
    }
    
    
    
    
    
    System.out.print("\nEl número formado por los dígitos impares es: ");
    
    ultimo1=0;
    dig1=0;
    ultimo2=0;
    dig2=0;
    
    mul=1;
    
    for(int i=0;i<(mayor-1);i++){
        mul=mul*10;
    }
    
    for(int i=0;i<mayor;i++){
        if(i==0){
            ultimo1=num1/mul;
        } else {
            dig1=(num1/mul)-(ultimo1*10);
            ultimo1=(num1/mul);
        }
        
        if(i==0){
            ultimo2=num2/mul;
        } else {
            dig2=(num2/mul)-(ultimo2*10);
            ultimo2=(num2/mul);
        }
        
        
        
        if(i==0 && (ultimo1%2)!=0){
            System.out.print(ultimo1);
        }
        if(i==0 && (ultimo2%2)!=0){
            System.out.print(ultimo2);
        }

        if((dig1%2)!=0 && i!=0){
            System.out.print(dig1);
        }
        
        if((dig2%2)!=0 && i!=0){
            System.out.print(dig2);
        }
        
         mul=mul/10;
    }
    
    System.out.print("\n");
    }
}
