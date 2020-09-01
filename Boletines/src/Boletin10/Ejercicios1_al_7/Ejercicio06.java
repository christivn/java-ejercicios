    /////////////////////////////////////
//  Ejercicio06 - Christian Ramos  //
/////////////////////////////////////

package Boletin10.Ejercicios1_al_7;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
       
    Scanner s=new Scanner(System.in);
    HashMap<String,String> m = new HashMap<>();
    // usuario:contraseña //
    m.put("christian", "qwerty");
    m.put("admin", "admin");
    m.put("root", "1234");

    boolean login=false;
    for(int i=0;i<3;i++){
        System.out.print("Introduce el usuario: ");
        String user=s.nextLine();

        System.out.print("Introduce la contraseña: ");
        String pass=s.nextLine();
        
        if(m.containsKey(user) && m.containsValue(pass)){
            login=true;
            break;
        } else {
            System.out.println("\n[ CREDENCIALES INCORRECTAS ("+(i+1)+" intento de 3)]\n");
        }
    }
    
    if(login){
        System.out.println("\n[ Ha accedido al área restringida ]");
    } else {
        System.out.println("\n[ Lo siento, no tiene acceso al área restringida ]");
    }
        
    }
}
