/////////////////////////////////////
//  Ejercicio22 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
public class Ejercicio22 {
    public static void main(String[] args) {
        
    int num=2;
    while(num<=100){
        
    int contador=0;
    boolean primo=false;
    
    for(int i=2;i<(100+num);++i){
      if(num%i==0 && num%num==0 && num%1==0){
        contador++;
        primo=true;
      }
      if(contador>1){
        primo=false;
      }
    }
    
    if(primo){
      System.out.println(num);
    }
    num++;
    }
        
    }
}
