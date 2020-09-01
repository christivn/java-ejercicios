/////////////////////////////////////
//  Calculadora - Christian Ramos  //
/////////////////////////////////////

package Boletin8;
import java.util.Scanner;

public class Calculadora {
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
                    System.out.print("Resultado válido para suma: "+num1+"+"+num2+"= "+suma(num1,num2));
                } else {
                    System.out.print("Resultado NO válido para suma: "+Math.abs(num1)+"+"+Math.abs(num2)+"= "+suma(num1,num2));
                }
            break;
            
            
            case 2:
                if(num1>0 && num2>0){
                    System.out.print("Resultado válido para resta: "+num1+"-"+num2+"= "+resta(num1,num2));
                } else {
                    System.out.print("Resultado NO válido para resta: "+num1+"-"+num2+"= "+resta(num1,num2));
                }
            break;
            
            
            case 3:
                if(num1>0 && num2>0){
                    System.out.print("Resultado válido para multiplicacion: "+num1+"*"+num2+"= "+multiplicar(num1,num2));
                } else {
                    System.out.print("Resultado NO válido para multiplicacion: "+num1+"*"+num2+"= "+multiplicar(num1,num2));
                }
            break;
            
            
            case 4:
                if(dividir(num1,num2)[2]==1){
                   System.out.print("Resultado válido para division:\n"+num1+"/"+num2+"= cociente="+dividir(num1,num2)[0]+" y resto="+dividir(num1,num2)[1]);
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
    
    
//========================================================================================================//
    
    
    public static int suma(int num1, int num2) {
        return num1+num2;
    }
    
    public static int resta(int num1, int num2) {
        return num1-num2;
    }
    
    public static int multiplicar(int num1, int num2) {
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
                
        return mul;
    }
    
    public static int[] dividir(int num1, int num2) {
                int[] dividir = new int[3];
        
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
                
                dividir[0]=cociente;
                dividir[1]=resto;
                dividir[2]=1; // Validación
                } else {
                    dividir[2]=0; //Validación
                }
                
                return dividir;
    }
}
