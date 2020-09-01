/////////////////////////////////////
//  Ejercicio15 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte1;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    boolean check=true;
    boolean fin=false;
    int[]array=new int[10];
    
    int cont=0;
    while(fin==false){
    if(cont==0){
    System.out.println("+-----------+---+---+---+---+---+---+---+---+---+----+");
    System.out.println("| Mesa nº   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |");
    System.out.println("+-----------+---+---+---+---+---+---+---+---+---+----+");
    System.out.print("| Ocupación |");
    for(int i=0;i<10;i++){
        array[i]=(int)(Math.random()*(4+1));
        System.out.print(" "+array[i]+" ");
        if(i==9){
            System.out.print(" ");
        }
        System.out.print("|");
    }
    System.out.println("\n+-----------+---+---+---+---+---+---+---+---+---+----+");
    }
    
    check=true;
    int personas=0;
    while(check){
        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        personas=s.nextInt();
        
        if(personas==-1){
            System.exit(0);
        }
        
        if(personas<0 || personas>4){
            System.out.println("\n\u001B[31mLo siento, no admitimos grupos de "+personas+", haga grupos de 4\n"+
                                 "personas como máximo e intente de nuevo.\u001B[0m");
        } else {
            check=false;
        }
    }
    
    int mesa=0;
    for(int i=0;i<10;i++){
        if(array[i]==0){
            mesa=i+1;
            i=10;
        }
    }
    

    if(mesa==0){
        boolean asiento=false;
        for(int i=0;i<10;i++){

            if((array[i]+personas)<=4 && asiento==false){
                mesa=i;
                System.out.println("\n"+"\u001B[32mTendrán que compartir mesa. Por favor, siéntense en la mesa número "+(mesa+1)+"\u001B[0m\n");
                array[mesa]+=personas;
                asiento=true;
            } 
        }
        
        if(asiento==false){
            System.out.println("\n"+"\u001B[31mLo siento, en estos momentos no queda sitio.\u001B[0m"+"\n");
            fin=true;
        }
        
    } else {
        System.out.println("\n"+"\u001B[32mPor favor, siéntense en la mesa número "+mesa+"\u001B[0m\n");
        array[mesa-1]=personas;
    }

    
    System.out.println("+-----------+---+---+---+---+---+---+---+---+---+----+");
    System.out.println("| Mesa nº   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |");
    System.out.println("+-----------+---+---+---+---+---+---+---+---+---+----+");
    System.out.print("| Ocupación |");
    for(int i=0;i<10;i++){
        System.out.print(" "+array[i]+" ");
        if(i==9){
            System.out.print(" ");
        }
        System.out.print("|");
    }
    System.out.println("\n+-----------+---+---+---+---+---+---+---+---+---+----+");
    
    
    cont++;
    }
    
    
    }
}
