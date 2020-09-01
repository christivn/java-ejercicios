/////////////////////////////////////
//  Ejercicio02 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio02 {
    public static void main(String[] args) {
    
    int palo=(int)(Math.random()*4) + 1;
    String spalo="";
    switch(palo){
        case 1:
            spalo="Picas";
        break;
        
        case 2:
            spalo="Corazones";
        break;
        
        case 3:
            spalo="Diamantes";
        break;
        
        case 4:
            spalo="Teboles";
        break;
    }
    
    int num=(int)(Math.random()*13) + 1;
    String snum="";
    switch(num){
        case 1:
            snum="A";
        break;
        
       case 11:
            snum="J";
        break;
        
        case 12:
            snum="Q";
        break;
        
        case 13:
            snum="K";
        break;
        
        default:
            snum=String.valueOf(num);
        break;
    }
    
    System.out.println(snum+" de "+spalo);
    }
}
