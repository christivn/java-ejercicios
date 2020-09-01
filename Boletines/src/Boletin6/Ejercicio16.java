/////////////////////////////////////
//  Ejercicio16 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio16 {
    public static void main(String[] args) {
    
    int figura1=(int)(Math.random()*5);
        String sfigura1="";
        switch(figura1){
            case 0:
                sfigura1="Corazón";
            break;

            case 1:
                sfigura1="Diamante";
            break;

            case 2:
                sfigura1="Herradura";
            break;

            case 3:
                sfigura1="Campana";
            break;

            case 4:
                sfigura1="Limón";
            break;
        }
    
        int figura2=(int)(Math.random()*5);
        String sfigura2="";
        switch(figura2){
            case 0:
                sfigura2="Corazón";
            break;

            case 1:
                sfigura2="Diamante";
            break;

            case 2:
                sfigura2="Herradura";
            break;

            case 3:
                sfigura2="Campana";
            break;

            case 4:
                sfigura2="Limón";
            break;
        }
        
        int figura3=(int)(Math.random()*5);
        String sfigura3="";
        switch(figura3){
            case 0:
                sfigura3="Corazón";
            break;

            case 1:
                sfigura3="Diamante";
            break;

            case 2:
                sfigura3="Herradura";
            break;

            case 3:
                sfigura3="Campana";
            break;

            case 4:
                sfigura3="Limón";
            break;
        }
    
    System.out.println(sfigura1+" | "+sfigura2+" | "+sfigura3);
    System.out.println("------------------------------------");
    
    if(figura1!=figura2 && figura1!=figura3 &&  figura2!=figura3){
        System.out.println("Lo siento, ha perdido");
    }
    if(figura1==figura2 && figura1==figura3 && figura2==figura3){
        System.out.println("Enhorabuena, ha ganado 10 monedas");
    } else {
    if(figura1==figura2 || figura1==figura3 || figura2==figura3){
        System.out.println("Bien, ha recuperado su moneda");
    }
    }
    
    }
}
