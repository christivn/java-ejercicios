/////////////////////////////////////
//  Examen02 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;

import java.util.Scanner;

public class Examen02 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[][]cuarto=new int[4][5];
    boolean encontrado=false;
    
    int mosquito_fil=(int)(Math.random()*4);
    int mosquito_col=(int)(Math.random()*5);
    
    cuarto[mosquito_fil][mosquito_col]=1;
    
    for(int f=0;f<4;f++){
        for(int c=0;c<5;c++){
            if(cuarto[f][c]==0){
                System.out.print("- ");
            }
            if(cuarto[f][c]==1){
                System.out.print("* ");
            }
        }
        System.out.print("\n");
    }
    
    int intentos=5;
    boolean check=true;
    System.out.println("Tienes "+intentos+" intentos para encontrar al mosquito: \n");
    
    while(encontrado==false){
     
     check=true;
     int ancho=0;
     while(check){
        System.out.print("Escriba el ancho del cuarto: ");
        ancho=s.nextInt();
        
        if(ancho<4 && ancho>=0){
            check=false;
        } else {
            System.out.print("[ ANCHO NO VÁLIDO ]\n\n");
        }
     }
     
     check=true;
     int alto=0;
     while(check){
        System.out.print("Escriba el alto del cuarto: ");
        alto=s.nextInt();
        
        if(alto<5 && alto>=0){
            check=false;
        } else {
            System.out.print("[ ALTO NO VÁLIDO ]\n\n");
        }
     }
     
     System.out.print("\n");
     
     
     if(intentos==1){
        encontrado=true;
     }
     
     if(cuarto[ancho][alto]==1){
         System.out.println("----------------------------------------------\n");
         System.out.println("\033[32m[ Has ganado ☺. Acertaste en el intento ]\u001B[0m\n");
         encontrado=true;
     } else {
        intentos--;
        cuarto[ancho][alto]=2;
        
        System.out.println("----------------------------------------------\n");
        System.out.println("El mosquito no se encontraba en esa posición");
        if(intentos==0){
            System.out.println("[ Te quedan has quedado sin intentos ]\n");
        } else {
            System.out.println("[ Te quedan "+intentos+" intentos ]\n");
        }
        System.out.println("----------------------------------------------\n");
     }
    }
    
    System.out.println("Tus intentos fueron: "); 
    for(int f=0;f<4;f++){
        for(int c=0;c<5;c++){
            if(cuarto[f][c]==0){
                System.out.print("\u001B[0m\033[30m- ");
            }
            if(cuarto[f][c]==1){
                System.out.print("\u001B[0m\033[32m* ");
            }
            if(cuarto[f][c]==2){
                System.out.print("\u001B[0m\u001B[35mo ");
            }
        }
        System.out.print("\n");
    }
    
    System.out.print("\n");
    
    
    }
}
