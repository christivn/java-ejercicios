/////////////////////////////////////
//  Ejercicio08 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio08 {
    public static void main(String[] args) {
    
    for(int x=0;x<3;x++){
    System.out.println("+---------------------------------+");
    System.out.println("|          Quiniela "+(x+1)+"             |");
    System.out.println("+---------------+-----------------+");
    
            for(int i=0;i<14;i++){
            if(x==2){
                i=13;
            }
            
            int rand=(int)(Math.random()*(6));
            String apuesta="";

            switch(rand){
                case 0:
                    apuesta="[1] X 2";
                break;

                case 1:
                    apuesta="[1] X 2";
                break;

                case 2:
                    apuesta="[1] X 2";
                break;
                
                case 3:
                    apuesta="1 [X] 2";
                break;
                
                case 4:
                    apuesta="1 X [2]";
                break;
                
                case 5:
                    apuesta="1 X [2]";
                break;
            }
            
            System.out.println("| Apuesta "+(i+1)+"\t|\t"+apuesta+"\t  |");
            }
            
    System.out.println("+---------------------------------+\n\n");
    }
        
    }
}
