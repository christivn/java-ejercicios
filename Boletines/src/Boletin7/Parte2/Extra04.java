//////////////////////////////////
//  Extra04 - Christian Ramos  //
////////////////////////////////

package Boletin7.Parte2;
import java.util.Scanner;

public class Extra04 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    boolean check=true;
    int[][]n=new int[8][8];
    
    
    String pos="";
    int col=0;
    int row=0;
    while(check){
        System.out.print("Introduzca la posición de la torre: ");
        pos=s.next();
        pos=pos.toLowerCase();
        
        boolean pos_valid=true;
        switch(pos){
            case "a1": row=7;col=0; break;
            case "b1": row=7;col=1; break;
            case "c1": row=7;col=2; break;
            case "d1": row=7;col=3; break;
            case "e1": row=7;col=4; break;
            case "f1": row=7;col=5; break;
            case "g1": row=7;col=6; break;
            case "h1": row=7;col=7; break;
            
            case "a2": row=6;col=0; break;
            case "b2": row=6;col=1; break;
            case "c2": row=6;col=2; break;
            case "d2": row=6;col=3; break;
            case "e2": row=6;col=4; break;
            case "f2": row=6;col=5; break;
            case "g2": row=6;col=6; break;
            case "h2": row=6;col=7; break;
            
            case "a3": row=5;col=0; break;
            case "b3": row=5;col=1; break;
            case "c3": row=5;col=2; break;
            case "d3": row=5;col=3; break;
            case "e3": row=5;col=4; break;
            case "f3": row=5;col=5; break;
            case "g3": row=5;col=6; break;
            case "h3": row=5;col=7; break;
            
            case "a4": row=4;col=0; break;
            case "b4": row=4;col=1; break;
            case "c4": row=4;col=2; break;
            case "d4": row=4;col=3; break;
            case "e4": row=4;col=4; break;
            case "f4": row=4;col=5; break;
            case "g4": row=4;col=6; break;
            case "h4": row=4;col=7; break;
            
            case "a5": row=3;col=0; break;
            case "b5": row=3;col=1; break;
            case "c5": row=3;col=2; break;
            case "d5": row=3;col=3; break;
            case "e5": row=3;col=4; break;
            case "f5": row=3;col=5; break;
            case "g5": row=3;col=6; break;
            case "h5": row=3;col=7; break;
            
            case "a6": row=2;col=0; break;
            case "b6": row=2;col=1; break;
            case "c6": row=2;col=2; break;
            case "d6": row=2;col=3; break;
            case "e6": row=2;col=4; break;
            case "f6": row=2;col=5; break;
            case "g6": row=2;col=6; break;
            case "h6": row=2;col=7; break;
            
            case "a7": row=1;col=0; break;
            case "b7": row=1;col=1; break;
            case "c7": row=1;col=2; break;
            case "d7": row=1;col=3; break;
            case "e7": row=1;col=4; break;
            case "f7": row=1;col=5; break;
            case "g7": row=1;col=6; break;
            case "h7": row=1;col=7; break;
            
            case "a8": row=0;col=0; break;
            case "b8": row=0;col=1; break;
            case "c8": row=0;col=2; break;
            case "d8": row=0;col=3; break;
            case "e8": row=0;col=4; break;
            case "f8": row=0;col=5; break;
            case "g8": row=0;col=6; break;
            case "h8": row=0;col=7; break;
            
            default: 
                System.out.print("[ DEBES INTRODUCIR UNA POSICIÓN VÁLIDA ]\n");
                pos_valid=false;
            break;
        }
        System.out.print("\n");
        
        if(pos_valid){
            n[row][col]=1;
            check=false;
        }
        
    }
    
    
    
    for(int i=1;i<8;i++){
        if((row+i)<=7 && (col-i)>=0){
            n[row+i][col-i]=2;
        }
    }
    for(int i=1;i<8;i++){
        if((row-i)>=0 && (col+i)<=7){
            n[row-i][col+i]=2;
        }
    }
    for(int i=1;i<8;i++){
        if((row+i)<=7 && (col+i)<=7){
            n[row+i][col+i]=2;
        }
    }
    for(int i=1;i<8;i++){
        if((row-i)>=0 && (col-i)>=0){
            n[row-i][col-i]=2;
        }
    }
    
    
    
    for(int i=1;i<8;i++){
        if((row+i)<=7){
            n[row+i][col]=2;
        }
    }
    for(int i=1;i<8;i++){
        if((row-i)>=0){
            n[row-i][col]=2;
        }
    }
    for(int i=1;i<8;i++){
        if((col+i)<=7){
            n[row][col+i]=2;
        }
    }
    
    for(int i=1;i<8;i++){
        if((col-i)>=0){
            n[row][col-i]=2;
        }
    }
    
    
    
    if(col+1<=7){
        n[row][col+1]=2;
    }
    if(col-1>=0){
        n[row][col-1]=2;
    }
    if(row+1<=7){
        n[row+1][col]=2;
    }
    if(row-1>=0){
        n[row-1][col]=2;
    }
    if(row-1>=0 && col-1>=0){
        n[row-1][col-1]=2;
    }
    if(row+1<=7 && col+1<=7){
        n[row+1][col+1]=2;
    }
    if(row+1<=7 && col-1>=0){
        n[row+1][col-1]=2;
    }
    if(row-1>=0 && col+1<=7){
        n[row-1][col+1]=2;
    }
    
    
    System.out.print("       a    b    c    d    e    f    g    h\n");
    for(int i=0;i<8;i++){
        System.out.print("    +----+----+----+----+----+----+----+----+\n");
        System.out.print("  "+(8-i)+" ");
        for(int x=0;x<8;x++){
            if(n[i][x]==1){
                System.out.print("|\u001B[44m DD ");
                System.out.print("\u001B[0m");
            } else {
                if(n[i][x]==2){
                    System.out.print("|\u001B[46m ·· ");
                    System.out.print("\u001B[0m");
                } else {
                    System.out.print("|    ");
                }
            }
        }
        System.out.print("| "+(8-i)+"\n");
    }
    System.out.print("    +----+----+----+----+----+----+----+----+\n");
    System.out.print("       a    b    c    d    e    f    g    h\n");
    
    
    System.out.println("\nEl álfil puede moverse a las siguientes posiciones:");
    for(int i=0;i<8;i++){
        for(int x=0;x<8;x++){
            if(n[i][x]==2){
                
                String letra="";
                switch(x){
                    case 0: letra="a"; break;
                    case 1: letra="b"; break;
                    case 2: letra="c"; break;
                    case 3: letra="d"; break;
                    case 4: letra="e"; break;
                    case 5: letra="f"; break;
                    case 6: letra="g"; break;
                    case 7: letra="h"; break;
                }
                
                System.out.print(letra+(8-i)+"  ");
            }
        }
    }
    
    
    System.out.print("\n\n");
    }
}
