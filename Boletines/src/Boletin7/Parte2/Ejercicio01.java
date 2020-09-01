/////////////////////////////////////
//  Ejercicio01 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte2;
public class Ejercicio01 {
    public static void main(String[] args) {
    
    int[][]n=new int[3][6];
    
    n[0][0]=0;
    n[0][1]=30;
    n[0][2]=2;
    n[0][5]=5;
    
    n[1][1]=75;
    n[1][4]=0;
    
    n[2][2]=-2;
    n[2][3]=9;
    n[2][5]=11;
    
    System.out.printf("        Col 1  Col 2  Col 3  Col 4  Col 5  Col 6\n");
    for(int i=0;i<=2;i++){
        System.out.printf("       +------+------+------+------+------+------+\n");
        System.out.print("Fila "+i+" ");
        for(int x=0;x<6;x++){
            System.out.printf("%-2s %-4s","| ",n[i][x]," |");
        }
        System.out.printf("|\n");
    }
    System.out.printf("       +------+------+------+------+------+------+\n");
    
    
    }
}
