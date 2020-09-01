/////////////////////////////////////
//  Extra02 - Christian Ramos      //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Extra02 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    int equilatero=0;
    int isosceles=0;
    int escaleno=0;
    
    int lado1=0;
    int lado2=0;
    int lado3=0;
    
    boolean op=false;
    int cont=1;
    
    while(op==false){
    System.out.println("[ TRIANGULO ("+cont+") ]");
    
    for(int i=0;i<3;i++){
    System.out.print("Introduce el lado "+(i+1)+": ");
    int num=s.nextInt();
    if(i==0){
        lado1=num;
    }
    if(i==1){
        lado2=num;
    }
    if(i==2){
        lado3=num;
    }
    }
    
    if(lado1==lado2 && lado2==lado3){
        equilatero+=1;
        isosceles--;
    }
    if(lado1==lado2 || lado1==lado3){
        isosceles+=1;
    }
    if(lado1!=lado2 && lado2!=lado3){
        escaleno+=1;
    }

    System.out.print("¿Quieres introducir otro triangulo? (S/N) ");
    String sn=s.next();
    sn=sn.toLowerCase();
    
        switch (sn) {
            case "n":
                op=true;
                break;
            case "s":
                op=false;
                break;
            default:
                System.out.print("Debes de introducir una opción valida (S o N) ");
                sn=s.next();
                break;
        }
    
    cont++;
    System.out.println("\n");
    }
    
    System.out.println("--------------------------------------");
    System.out.println("Triangulos equiláteros: "+equilatero);
    System.out.println("Triangulos isósceles: "+isosceles);
    System.out.println("Triangulos escalenos: "+escaleno);
    System.out.println("--------------------------------------");
    System.out.print("Triangulo con menor cantidad:");
    
    if(equilatero<=isosceles && equilatero<=escaleno){
        System.out.print(" Equilatero");
                
    }
    
    if(isosceles<=equilatero && isosceles<=escaleno){
        System.out.print(" Isosceles");
    }
    
    if(escaleno<=equilatero && escaleno<=isosceles){
        System.out.print(" Escaleno");
    }
    System.out.println("\n--------------------------------------");
        
    }
}
