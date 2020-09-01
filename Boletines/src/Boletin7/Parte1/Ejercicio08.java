/////////////////////////////////////
//  Ejercicio08 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    int[] temp = new int[12];
    String[] mes = new String[12];
    mes[0]="ENERO";
    mes[1]="FEBREO";
    mes[2]="MARZO";
    mes[3]="ABRIL";
    mes[4]="MAYO";
    mes[5]="JUNIO";
    mes[6]="JULIO";
    mes[7]="AGOSTO";
    mes[8]="SEPTIEMBRE";
    mes[9]="OCTUBRE";
    mes[10]="NOVIEMBRE";
    mes[11]="DICIEMBRE";
    
    for(int i=0;i<12;i++){
        System.out.print("Introduce la temperatura media (Mes: "+(i+1)+"/12): ");
        int media=s.nextInt();
        temp[i]=media;
    }
    System.out.println("--------------------------------------------------\n");
    
    
    System.out.print("               -50  -45  -40  -35  -30  -25  -20  -15  -10  -5    0    5   10   15   20   25   30   35   40   45   50\n");
    System.out.print("+--------------+--------------------------------------------------|--------------------------------------------------+\n");
    
    for(int x=0;x<12;x++){
        System.out.printf("%-2s %-10s %-1s","| ",mes[x]," |");
    
    if((temp[x]-1)>=0){
    for(int i=0;i<50;i++){
        System.out.print(" ");
    }
    System.out.print(" ");
    for(int i=0;i<50;i++){
            if((temp[x]-1)<i){
             System.out.print(" ");
            } else {
             System.out.print("\u001B[32m#");
            }
        }  
    }
    
    if((temp[x]-1)<0){
    for(int i=0;i<50;i++){
            if(Math.abs(temp[x])<(50-i)){
             System.out.print(" ");
            } else {
             System.out.print("#");
            }
        }  
    
    for(int i=0;i<50;i++){
        System.out.print(" ");
    }
    }
    
    if(x!=11){
        System.out.print(" |\n");
    } else {
        System.out.print(" |");
    }
    }
    
    System.out.print("\n+--------------+┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼┘");
    System.out.print("\n               0   4    9    14   19  23   28   33   39  42   47   52");
    System.out.println("\n");
    
    }
}
