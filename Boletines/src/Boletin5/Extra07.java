/////////////////////////////////////
//  Extra07 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
public class Extra07 {
    public static void main(String[] args) {
    
    int r_altura=10;
    int altura=(r_altura/2);
   
    for(int i=0;i<altura;i++){
        
        for(int x=0;x<altura;x++){
            if(x==(altura-(i+1))){
                System.out.print("/");
            } else {
                System.out.print(" ");
            }
        }
        
        for(int x=0;x<altura;x++){
            if(x==i){
                System.out.print("\\");
            } else {
                System.out.print(" ");
            }
        }
    System.out.print("\n");
    }
    
    for(int i=0;i<altura;i++){

        for(int x=0;x<altura;x++){
            if(x==i){
                System.out.print("\\");
            } else {
                System.out.print(" ");
            }
        }
        
        for(int x=0;x<altura;x++){
            if(x==(altura-(i+1))){
                System.out.print("/");
            } else {
                System.out.print(" ");
            }
        }
            
    System.out.print("\n");
    }
    
    }
}
