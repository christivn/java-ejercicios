/////////////////////////////////////
//  Ejercicio05 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte2;
public class Ejercicio05 {
    public static void main(String[] args) {
    
    int[][]n=new int[6][10];
    
    int row=0;
    int col=0;
    for(int i=0;i<(6*10);i++){
        int num=(int)(Math.random()*(1001));
        
        n[row][col]=num;
        col++;
        
        if(col>=10){
            col=0;
            row++;
        } 
    }
    
    int max_col=0;
    int max_row=0;
    
    int min_col=0;
    int min_row=0;
    
    row=0;
    col=0;
    for(int i=0;i<(6*10);i++){
        int num=(int)(Math.random()*(1001));
        
        if(n[row][col]>n[max_row][max_col]){
            max_row=row;
            max_col=col;
        }
        
        if(n[row][col]<n[min_row][min_col]){
            min_row=row;
            min_col=col;
        }
        
        col++;
        if(col>=10){
            col=0;
            row++;
        } 
    }
    
    
    System.out.printf("        Col 0  Col 1  Col 2  Col 3  Col 4  Col 5  Col 6  Col 7  Col 8   Col 9\n");
    for(int i=0;i<=5;i++){
        System.out.print("       +------+------+------+------+------+------+------+------+------+------+\n");
        System.out.print("Fila "+i+" ");
        for(int x=0;x<10;x++){
            if(i==max_row && x==max_col){
                System.out.printf("%-2s %-4s","| \u001B[32m",n[i][x]," |");
                System.out.print("\u001B[0m");
            } else if(i==min_row && x==min_col){
                System.out.printf("%-2s %-4s","| \u001B[31m",n[i][x]," |");
                System.out.print("\u001B[0m");
            } else {
                System.out.printf("%-2s %-4s","\u001B[0m| ",n[i][x]," |");
            }
        }
        System.out.print("|\n");
    }
    System.out.print("       +------+------+------+------+------+------+------+------+------+------+\n");
    
    System.out.print("\n\u001B[32m-Maximo: ");
    System.out.println("-Col: "+max_col);
    System.out.println("\t -Row: "+max_row+"\u001B[0m");
    
    System.out.print("\n\u001B[31m-Minimo: ");
    System.out.println("-Col: "+min_col);
    System.out.println("\t -Row: "+min_row+"\u001B[0m");
    }
}
