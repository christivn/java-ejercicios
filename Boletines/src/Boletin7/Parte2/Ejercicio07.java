/////////////////////////////////////
//  Ejercicio07 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte2;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    int[][]n=new int[6][10];
    
    int tesoro_row=(int)(Math.random()*(6));
    int tesoro_col=(int)(Math.random()*(10));
    n[tesoro_row][tesoro_col]=777;
    boolean fin=false;
    
    int mina_row=0;
    int mina_col=0;
    int adv_row=0;
    int adv_col=0;
    boolean check=true;
    for(int i=0;i<3;i++){
        while(check==true){
            mina_row=(int)(Math.random()*(6));
            mina_col=(int)(Math.random()*(10));
            
            if(n[mina_row][mina_col]!=777){
                check=false;
            }
        }
        
        
        
        if(mina_row<=4){
            if(n[mina_row+1][mina_col]!=666){
                n[mina_row+1][mina_col]=333;
            }
        }
        if(mina_row<=4 && mina_col<=8){
            if(n[mina_row+1][mina_col+1]!=666){
                n[mina_row+1][mina_col+1]=333;
            }
        }
        if(mina_row<=4 && mina_col>=1){
            if(n[mina_row+1][mina_col-1]!=666){
                n[mina_row+1][mina_col-1]=333;
            }
        }
        
        
        if(mina_row>=1){
            if(n[mina_row-1][mina_col]!=666){
                n[mina_row-1][mina_col]=333;
            }
        }
        if(mina_row>=1 && mina_col<=8){
            if(n[mina_row-1][mina_col+1]!=666){
                n[mina_row-1][mina_col+1]=333;
            }
        }
        if(mina_row>=1 && mina_col>=1){
            if(n[mina_row-1][mina_col-1]!=666){
                n[mina_row-1][mina_col-1]=333;
            }
        }
        
        
        if(mina_col<=8){
            if(n[mina_row][mina_col+1]!=666){
                n[mina_row][mina_col+1]=333;
            }
        }
        if(mina_col>=1){
            if(n[mina_row][mina_col-1]!=666){
                n[mina_row][mina_col-1]=333;
            }
        }
        
        
        n[mina_row][mina_col]=666;
        check=true;
    }
    n[tesoro_row][tesoro_col]=777;
    
    
    while(fin==false){
    System.out.print("Tesoro: Fila:"+tesoro_row+", Col:"+tesoro_col+"\n");
    System.out.print("        Col 0  Col 1  Col 2  Col 3  Col 4  Col 5  Col 6  Col 7  Col 8   Col 9\n");
    for(int i=0;i<=5;i++){
        System.out.print("       +------+------+------+------+------+------+------+------+------+------+\n");
        System.out.print("Fila "+i+" ");
        for(int x=0;x<10;x++){
                if(n[i][x]==0 || n[i][x]==333 || n[i][x]==666 || n[i][x]==777){
                    System.out.print("|######");
                    System.out.print("\u001B[0m");
                }
                if(n[i][x]==1){
                    System.out.print("|      ");
                }
                if(n[i][x]==3){
                    System.out.print("|\u001B[33m!!!!!!");
                    System.out.print("\u001B[0m");
                }
                if(n[i][x]==4){
                    System.out.print("|\u001B[32m  WIN ");
                    System.out.print("\u001B[0m");
                }
                if(n[i][x]==5){
                    System.out.print("|\u001B[31mXXXXXX");
                    System.out.print("\u001B[0m");
                }
        }
        System.out.print("|\n");
    }
    System.out.print("       +------+------+------+------+------+------+------+------+------+------+\n");
    
    int o_col=-1;
    while(o_col<0 || o_col>9){
        System.out.print("Introduce la columna: ");
        o_col=s.nextInt();
        
        if(o_col<0 || o_col>9){
            System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]\n");
        }
    }
    
    int o_row=-1;
    while(o_row<0 || o_row>5){
        System.out.print("Introduce la fila: ");
        o_row=s.nextInt();
        
        if(o_row<0 || o_row>5){
            System.out.println("[ DEBES INTRODUCIR UNA OPCIÓN VÁLIDA ]\n");
        }
    }
    System.out.print("\n\n");
    
    
    if(n[o_row][o_col]==777){
        n[o_row][o_col]=4;
        
        
        System.out.print("        Col 0  Col 1  Col 2  Col 3  Col 4  Col 5  Col 6  Col 7  Col 8   Col 9\n");
    for(int i=0;i<=5;i++){
        System.out.print("       +------+------+------+------+------+------+------+------+------+------+\n");
        System.out.print("Fila "+i+" ");
        for(int x=0;x<10;x++){
                if(n[i][x]==0 || n[i][x]==333 || n[i][x]==666 || n[i][x]==777){
                    System.out.print("|######");
                    System.out.print("\u001B[0m");
                }
                if(n[i][x]==1){
                    System.out.print("|      ");
                }
                if(n[i][x]==3){
                    System.out.print("|\u001B[33m!!!!!!");
                    System.out.print("\u001B[0m");
                }
                if(n[i][x]==4){
                    System.out.print("|\u001B[32m  WIN ");
                    System.out.print("\u001B[0m");
                }
                if(n[i][x]==5){
                    System.out.print("|\u001B[31mXXXXXX");
                    System.out.print("\u001B[0m");
                }
        }
        System.out.print("|\n");
    }
    System.out.print("       +------+------+------+------+------+------+------+------+------+------+\n");
    System.out.print("\n[ HAS ENCONTRADO EL TESORO ]");
        
        
        fin=true;
        
    } else {
    
        if(n[o_row][o_col]==0){
            n[o_row][o_col]=1;
        }
    
        if(n[o_row][o_col]==333){
            n[o_row][o_col]=3;
        }
        
        if(n[o_row][o_col]==666){
            n[o_row][o_col]=5;
            
            System.out.print("        Col 0  Col 1  Col 2  Col 3  Col 4  Col 5  Col 6  Col 7  Col 8   Col 9\n");
    for(int i=0;i<=5;i++){
        System.out.print("       +------+------+------+------+------+------+------+------+------+------+\n");
        System.out.print("Fila "+i+" ");
        for(int x=0;x<10;x++){
                if(n[i][x]==0 || n[i][x]==333 || n[i][x]==666 || n[i][x]==777){
                    System.out.print("|######");
                    System.out.print("\u001B[0m");
                }
                if(n[i][x]==1){
                    System.out.print("|      ");
                }
                if(n[i][x]==3){
                    System.out.print("|\u001B[33m!!!!!!");
                    System.out.print("\u001B[0m");
                }
                if(n[i][x]==4){
                    System.out.print("|\u001B[32m  WIN ");
                    System.out.print("\u001B[0m");
                }
                if(n[i][x]==5){
                    System.out.print("|\u001B[31mXXXXXX");
                    System.out.print("\u001B[0m");
                }
        }
        System.out.print("|\n");
    }
    System.out.print("       +------+------+------+------+------+------+------+------+------+------+\n");
    System.out.print("\n[ HAS PISADO UNA MINA ]");
            
            fin=true;
        }
        
    }
    
    
    }
    }
}
