/////////////////////////////////////
//  Ejercicio04 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte2;

public class Ejercicio04 {
    public static void main(String[] args) throws InterruptedException {
    
    int[][]n=new int[4][5];
    
    int row=0;
    int col=0;
    for(int i=0;i<(4*5);i++){
        int num=(int)(Math.random()*(1000))+100;
        
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
        System.out.print("+-------+-------+-------+-------+-------+----------------+\n");
                
        for(int x=0;x<5;x++){
            suma_total+=n[i][x];
            suma_row+=n[i][x];
            System.out.printf("%-2s %-5s","| ",n[i][x]," |");
        }
        
        System.out.print("|");
        Thread.sleep(1500);
        System.out.printf("%-2s %-5s %-2s"," Fila "+i+": \u001B[33m",suma_row,"\u001B[0m|\n");
        suma_row=0;
    }
    System.out.print("+-------+-------+-------+-------+-------+----------------+\n");
    System.out.print("| Col 1 | Col 2 | Col 3 | Col 4 | Col 5 |  ");
    Thread.sleep(1500);
    System.out.print("\u001B[36mTOTAL: "+suma_total+"\u001B[0m\n");
    
    for(int i=0;i<5;i++){
        for(int x=0;x<4;x++){
            suma_col+=n[x][i];
        }
        System.out.print("| \u001B[35m");
        Thread.sleep(500);
        System.out.printf("%-5s %-2s",suma_col,"\u001B[0m");
        suma_col=0;
    }
    System.out.print("\u001B[0m|\n");
    System.out.printf("+-------+-------+-------+-------+-------+\n");
    
    
    }
}
