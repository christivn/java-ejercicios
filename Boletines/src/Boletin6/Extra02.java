/////////////////////////////////////
//  Extra02 - Christian Ramos      //
/////////////////////////////////////

package Boletin6;

import static java.time.Clock.system;

public class Extra02 {
    public static void main(String[] args) throws InterruptedException {
    
    int[] ruleta = new int[15];
    int[] ruleta_aux = new int[15];
    
    int balance=150;
    int apostado=1;
    int mayor_apuesta=0;
    
    int x1=1;
    int x2=1;
    
    String verde="\u001B[42m\u001B[37m";
    String rojo="\u001B[41m\u001B[37m";
    String negro="\u001B[37m\u001B[37m";
    
    for(int i=0;i<15;i++){
        int rand=(int)(Math.random()*37);
        ruleta[i]=rand;
    }
    
    for(int r=0;r<100000;r++){
    
    if(r<0){
    for(int i=0;i<15;i++){
        System.out.print("\u001B[0m"+color(ruleta[i])+" "+ruleta[i]+" \u001B[0m");
    }
    System.out.print("\n");
    }
    
    

    String apuesta="rojo";

    for(int i=0;i<15;i++){
        if(i!=14){
            ruleta_aux[i+1]=ruleta[i];
        }
        if(i==0){
            int rand=(int)(Math.random()*37);
            ruleta_aux[0]=rand;
        }
    }
    System.arraycopy(ruleta_aux, 0, ruleta, 0, 15);
    
    String resultado="";
    if(color(ruleta[0]).equals("\u001B[42m\u001B[37m")){
        resultado="verde";
    }
    if(color(ruleta[0]).equals("\u001B[41m\u001B[37m")){
        resultado="rojo";
    }
    if(color(ruleta[0]).equals("\u001B[37m\u001B[37m")){
        resultado="negro";
    }

    System.out.print("\n");
    for(int i=0;i<15;i++){
        System.out.print("\u001B[0m"+color(ruleta[i])+" "+ruleta[i]+" \u001B[0m");
    }
    
    
    if(resultado.equals(apuesta)){
        System.out.print("\n\n\u001B[0m\u001B[42m\u001B[37m HAS GANADO!!! \u001B[0m\n");
        balance=balance+apostado;
    } else {
        System.out.print("\n\n\u001B[0m\u001B[44m\u001B[37m HAS PERDIDO!!! \u001B[0m\n");
        balance=balance-apostado;
    }
    
    if(apostado>mayor_apuesta){
      mayor_apuesta=apostado;
    }
    
    System.out.print(" BALANCE TOTAL: "+balance+"€ \u001B[0m\n");
    System.out.print(" MAYOR APUESTA: "+mayor_apuesta+"€ \u001B[0m\n");
    System.out.print(" APUESTA: "+apostado+"€ \u001B[0m\n");
    
    if(resultado.equals(apuesta)){
       apostado=1;
       x1=1;
       x2=1;
    } else {
      apostado=x1+x2;
      x1=x2;
      x2=apostado;
    }
    
    
    Thread.sleep(50);
    }
    }
    
    
public static String color(int num) {
    switch(num){
        case 0: return "\u001B[42m\u001B[37m"; 
        case 1: return "\u001B[41m\u001B[37m";
        case 2: return "\u001B[37m\u001B[37m";
        case 3: return "\u001B[41m\u001B[37m";
        case 4: return "\u001B[37m\u001B[37m";
        case 5: return "\u001B[41m\u001B[37m";
        case 6: return "\u001B[37m\u001B[37m";
        case 7: return "\u001B[41m\u001B[37m";
        case 8: return "\u001B[37m\u001B[37m";
        case 9: return "\u001B[41m\u001B[37m";
        case 10: return "\u001B[37m\u001B[37m";
        case 11: return "\u001B[37m\u001B[37m";
        case 12: return "\u001B[41m\u001B[37m";
        case 13: return "\u001B[37m\u001B[37m";
        case 14: return "\u001B[41m\u001B[37m";
        case 15: return "\u001B[37m\u001B[37m";
        case 16: return "\u001B[41m\u001B[37m";
        case 17: return "\u001B[37m\u001B[37m";
        case 18: return "\u001B[41m\u001B[37m";
        case 19: return "\u001B[41m\u001B[37m";
        case 20: return "\u001B[37m\u001B[37m";
        case 21: return "\u001B[41m\u001B[37m";
        case 22: return "\u001B[37m\u001B[37m";
        case 23: return "\u001B[41m\u001B[37m";
        case 24: return "\u001B[37m\u001B[37m";
        case 25: return "\u001B[41m\u001B[37m";
        case 26: return "\u001B[37m\u001B[37m";
        case 27: return "\u001B[41m\u001B[37m";
        case 28: return "\u001B[37m\u001B[37m";
        case 29: return "\u001B[37m\u001B[37m";
        case 30: return "\u001B[41m\u001B[37m";
        case 31: return "\u001B[37m\u001B[37m";
        case 32: return "\u001B[41m\u001B[37m";
        case 33: return "\u001B[37m\u001B[37m";
        case 34: return "\u001B[41m\u001B[37m";
        case 35: return "\u001B[37m\u001B[37m";
        case 36: return "\u001B[41m\u001B[37m";
        default: return "ERROR EN LOS COLORES";
    }
}


}

