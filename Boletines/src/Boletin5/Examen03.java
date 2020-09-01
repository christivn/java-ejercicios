//////////////////////////////////////
//  EXAMEN 02 - Christian Ramos     //
//////////////////////////////////////

package Boletin5;
import java.util.Scanner;

public class Examen03 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("<--------------[ CALCULADORA ]-------------->");
        System.out.println("1.) Sumar");
        System.out.println("2.) Restar");
        System.out.println("3.) Multiplicar");
        System.out.println("4.) Dividir");
        System.out.println("<------------------------------------------->");
        
        System.out.print("Introduce una opcion del menu: ");
        int menu=s.nextInt();
        
        if(menu==1 || menu==2 || menu==3 || menu==4){

        System.out.println("<------------------------------------------->");
        System.out.print("Introduce el primer número entero: ");
        int num1=s.nextInt();
        
        System.out.print("Introduce el segundo número entero: ");
        int num2=s.nextInt();
        System.out.println("<------------------------------------------->");
        
        switch(menu){
        
            case 1:
                if(num1>0 && num2>0){
                    System.out.print("Resultado válido para suma: "+num1+"+"+num2+"= "+(num1+num2));
                } else {
                    System.out.print("Resultado NO válido para suma: "+Math.abs(num1)+"+"+Math.abs(num2)+"= "+(Math.abs(num1)+Math.abs(num2)));
                }
            break;
            
            
            case 2:
                if(num1>0 && num2>0){
                    System.out.print("Resultado válido para resta: "+num1+"-"+num2+"= "+(num1-num2));
                } else {
                    System.out.print("Resultado NO válido para resta: "+num1+"-"+num2+"= "+(num1-num2));
                }
            break;
            
            
            case 3:
                int mul=0;
                int n1=num1;
                int n2=num2;
                
                if(num1<0 && num2<0){ //Por si los dos valores introducidos son negativos
                    n1=Math.abs(n1);
                    n2=Math.abs(n2);
                }
                
                for(int i=1;i<=n2;i++){
                    mul+=n1;
                }
                
                if(num1>0 && num2>0){
                    System.out.print("Resultado válido para multiplicacion: "+num1+"*"+num2+"= "+mul);
                } else {
                    System.out.print("Resultado NO válido para multiplicacion: "+num1+"*"+num2+"= "+mul);
                }
            break;
            
            
            case 4:
                int cociente=0;
                int resto=0;
                
                int n01=num1;
                int n02=num2;
                
                if(num1<0 || num2<0){ //Por si introduce valores negativos
                    n01=Math.abs(n01);
                    n02=Math.abs(n02);
                }
                
                if(n01!=0 && n02!=0){
                if(n01>n02){
                while(n01>n02 && n01!=0){
                    n01-=n02;
                    cociente++;
                    resto=n01;
                }
                if(resto==num2){
                    cociente++;
                    resto=0;
                }
                } else {
                    resto=n02;
                }


                if(num1<0 || num2<0){ //Por si solo uno de los números es negativo, dar el cociente y resto en negativo
                   cociente-=(cociente+cociente);
                   resto-=(resto+resto);
                }
                
                if(num1<num2){
                    cociente=0;
                    resto=n02;
                }
                
                    System.out.print("Resultado válido para division:\n"+num1+"/"+num2+"= cociente="+cociente+" y resto="+resto);
                } else {
                    System.out.print("Resultado NO válido para division: No se puede dividir entre 0");
                }
            break;
        }
            
        } else {
            System.out.println("\n[ DEBES INTRODUCIR UNA OPCION VALIDA ]");
        }
        
      System.out.println("");
    }
    
}
