/////////////////////////////////////
//  Ejercicio02 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte2;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[][]n=new int[4][5];
    
    int row=0;
    int col=0;
    for(int i=0;i<(4*5);i++){
        int num=10000;
        while(num>9999 || num<0){
            System.out.print("Introduce un número entero ("+(i+1)+"/20): ");
            num=s.nextInt();
            
            if(num>9999 || num<0){
                System.out.print("[ DEBES INTRODUCIR UN NÚMERO ENTRE 0 Y 9999 ]\n\n");
            }
        }
        
        n[row][col]=num;
        col++;
        
        if(col>=5){
            col=0;
            row++;
        } 
    }
    System.out.print("\n");
    
    
    int suma_row=0;
    int suma_col=0;
    int suma_total=0;
    
    for(int i=0;i<4;i++){
        System.out.printf("+-------+-------+-------+-------+-------+----------------+\n");
                
        for(int x=0;x<5;x++){
            suma_total+=n[i][x];
            suma_row+=n[i][x];
            System.out.printf("%-2s %-5s","| ",n[i][x]," |");
        }
        System.out.printf("%-2s %-5s %-2s","| Fila "+i+": \u001B[33m",suma_row,"\u001B[0m|\n");
        suma_row=0;
    }
    System.out.printf("+-------+-------+-------+-------+-------+----------------+\n");
    System.out.printf("| Col 1 | Col 2 | Col 3 | Col 4 | Col 5 |  \u001B[36mTOTAL: "+suma_total+"\u001B[0m\n");
    
    for(int i=0;i<5;i++){
        for(int x=0;x<4;x++){
            suma_col+=n[x][i];
        }
        System.out.print("| \u001B[35m");
        System.out.printf("%-5s %-2s",suma_col,"\u001B[0m");
        suma_col=0;
    }
    System.out.print("\u001B[0m|\n");
    System.out.printf("+-------+-------+-------+-------+-------+\n");
    
    
    }
}
