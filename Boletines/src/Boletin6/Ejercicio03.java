/////////////////////////////////////
//  Ejercicio03 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio03 {
    public static void main(String[] args) {
        
    int palo=(int)(Math.random()*4) + 1;
    String spalo="";
    switch(palo){
        case 1:
            spalo="Espadas";
        break;
        
        case 2:
            spalo="Bastos";
        break;
        
        case 3:
            spalo="Oros";
        break;
        
        case 4:
            spalo="Copas";
        break;
    }
    
    int num=0;
    while(num!=2 && num!=3 && num!=4 && num!=5 && num!=6 && num!=7 && num!=11 && num!=12 && num!=13){
    num=(int)(Math.random()*13) + 1;
    }
    
    String snum="";
    switch(num){
        case 1:
            snum="As";
        break;
        
       case 11:
            snum="Sota";
        break;
        
        case 12:
            snum="Caballo";
        break;
        
        case 13:
            snum="Rey";
        break;
        
        default:
            snum=String.valueOf(num);
        break;
    }
    
    System.out.println(snum+" de "+spalo);
        
    }
}
