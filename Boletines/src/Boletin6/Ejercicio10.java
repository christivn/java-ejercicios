/////////////////////////////////////
//  Ejercicio10 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio10 {
    public static void main(String[] args) {
    
    for(int i=0;i<10;i++){
        int x=((int)(Math.random()*(40)))+1;
        
        for(int y=0;y<x;y++){
            int rand=(int)(Math.random()*(6));
            switch(rand){
                case 0:
                    System.out.print("*");
                break;
                
                case 1:
                    System.out.print("-");
                break;
                
                case 2:
                    System.out.print("=");
                break;
                
                case 3:
                    System.out.print(".");
                break;
                
                case 4:
                    System.out.print("|");
                break;
                
                case 5:
                    System.out.print("@");
                break;
            }
        }
        System.out.println("");
    }
        
    }
}
