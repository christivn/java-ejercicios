/////////////////////////////////////
//  Extra01 - Christian Ramos  //
/////////////////////////////////////

package Boletin8.String1;
import java.util.Scanner;

public class Extra01 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    for(;;){
        String str="";
        boolean javalin=false;
        boolean principio=false;
        boolean fin=false;
        
        System.out.print("\nEscriba una frase: ");
        str=s.nextLine();
        String str_aux=str;
        str=str.toLowerCase();

        
        if(str.indexOf("javalin,javalon")==0){
            javalin=true;
            principio=true;
            
            if(principio){
                str_aux=str_aux.substring(15);
                str_aux=str_aux.trim();
            }
        }
        
        if(str.indexOf("javalen,len,len")==(str.length()-15)){
            javalin=true;
            fin=true;
            
            if(fin){
                str_aux=str_aux.substring(str.length()-15,str.length());
                str_aux=str_aux.trim();
            }
        }
        
        
        if(javalin){
            System.out.println("Usted habla Javalandia\n");
            System.out.println(str_aux);
        } else {
            System.out.println("No es idioma Javalandia\n");
        }
       
        
    }
    
    }
}
