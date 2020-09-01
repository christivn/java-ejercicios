/////////////////////////////////////
//  Ejercicio_Exepciones - Christian Ramos  //
/////////////////////////////////////

package Boletin11;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio_Exepciones {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int op1=0;
        int op2=0;
        
       for(;;){
       System.out.println("\n[ CALCULADORA ]");
       System.out.println("1. Introducir operadores");
       System.out.println("2. Suma");
       System.out.println("3. Resta");
       System.out.println("4. Multiplicación");
       System.out.println("5. División");
       System.out.println("6. Salir");
       System.out.print("Selecciona una opción: ");
       int o=sc.nextInt();
       
       switch(o){
           case 1: 
            try{
                System.out.print("\nOperador 1: ");
                op1=sc.nextInt();
                System.out.print("Operador 2: ");
                op2=sc.nextInt();
            }catch(NumberFormatException ex){
                System.out.println("\n[ DEBES INTRODUCIR CARACTERES NUMERICOS ]");
            }
           break;
           
           case 2:
               if(op1!=0 || op2!=0){
                    System.out.println(op1+"+"+op2+"= "+(op1+op2));
               } else {
                   System.out.println("\n[ DEBES INTRODUCIR ANTES LOS OPERADORES ]");
               }
           break;
           
           case 3:
                if(op1!=0 || op2!=0){
                    try {
                        if(op2>op1){ throw new ExcepcionMayor(); }
                        System.out.println(op1+"-"+op2+"= "+(op1-op2));
                    } catch(ExcepcionMayor ex){ 
                        System.out.println("\n"+ex.getMessage());
                    } 
               } else {
                   System.out.println("\n[ DEBES INTRODUCIR ANTES LOS OPERADORES ]");
               }
           break;
           
           case 4:
               if(op1!=0 || op2!=0){
                    System.out.println(op1+"*"+op2+"= "+(op1*op2));
               } else {
                   System.out.println("\n[ DEBES INTRODUCIR ANTES LOS OPERADORES ]");
               }
           break;
           
           case 5:
               if(op1!=0 || op2!=0){
                   try{
                    System.out.println(op1+"/"+op2+"= "+(op1/op2));
                   } catch(ArithmeticException ex){ 
                       System.out.println("\n[ NO SE PUEDE DIVIDIR POR CERO ]");
                   }  
               } else {
                   System.out.println("\n[ DEBES INTRODUCIR ANTES LOS OPERADORES ]");
               }
           break;
           
           case 6: System.exit(0); break;
           
           default: System.out.println("\n[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]"); break;
       }
       }
    }

public static class ExcepcionMayor extends Exception{
    public ExcepcionMayor(){
        super();
    }
    @Override
    public String getMessage(){
        return "[ EL PRIMER OPERADOR DEBE DE SER MAYOR AL SEGUNDO ]";
    }
}

    
    
}
