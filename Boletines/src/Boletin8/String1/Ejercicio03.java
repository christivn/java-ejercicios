/////////////////////////////////////
//  Ejercicio03 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String1;
public class Ejercicio03 {
    public static void main(String[] args) {
    
    String[] nombres = new String[]{ "Manuel","Elena","María","Juán","Jesús","Lucia","Francisco","Raul","Núria" };
    String filtro="";
    
    if(!"".equals(filtro)){
    System.out.println("Nombres que empiecen por: "+filtro);
    for(int i=0;i<nombres.length;i++){
        if((nombres[i].toLowerCase().indexOf(filtro))==0){
            System.out.println(nombres[i]);
        }
    }
    } else {
        System.out.println("[ DEBES INTRODUCIR UN FILTRO ]");
    }
    
    }
}
