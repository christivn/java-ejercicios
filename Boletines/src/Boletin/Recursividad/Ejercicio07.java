/////////////////////////////////////
//  Ejercicio07 - Christian Ramos  //
/////////////////////////////////////

package Boletin.Recursividad;
public class Ejercicio07 {
    public static void main(String[] args) {
        
        int a=7;
        int b=2; 
        int resultado= multiplicar(a,b);
        
        System.out.println("La división de ("+a+"*"+b+") es: "+resultado);
    }
    
    public static int multiplicar(int a,int b) {
        int r;
        if(b==0){
            return 0;
        } else {
            r=a+multiplicar(a,b-1);
        }
        return r;
    }
}
