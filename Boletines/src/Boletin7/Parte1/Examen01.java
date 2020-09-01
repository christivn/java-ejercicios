///////////////////////////////////
//  Examen01 - Christian Ramos  //
/////////////////////////////////

package Boletin7.Parte1;
public class Examen01 {
    public static void main(String[] args) {
    
    double[] array_inicial=new double[10];
    double[] array_final=new double[10];
    
    for(int i=0;i<array_inicial.length;i++){
        double rand=(double)(Math.random()*32)+3;
        array_inicial[i]=Math.round(rand);
    }
    
    System.out.print("Array inicial: ");
    for(double n : array_inicial) { 
        System.out.printf("%.1f",n);
        System.out.print(" ");
    }
    System.out.print("\n");
    
    int cont=9;
    for(int i=0;i<array_final.length;i++){
        array_final[i]=array_inicial[cont];
        cont--;
    }
    
    System.out.print("Array final: ");
    for(double n : array_final) { 
        System.out.printf("%.1f",n);
        System.out.print(" ");
    }
    
    
    System.out.print("\n\nLos cuadros de los valores duplicados en el array final: ");
    for(int i=0;i<array_final.length;i++){
        if(i<9 && array_final[i]==array_final[i+1]){
            System.out.printf("%.0f",Math.pow(array_final[i],2));
            System.out.print(" ");
        }  
    }
    for(int i=0;i<array_final.length;i++){
        if(i<9 && array_final[i]==array_final[i+1]){
            System.out.printf("%.0f",Math.pow(array_final[i],2));
            System.out.print(" ");
        }  
    }
    System.out.print("\n");

    System.out.print("\nEl sumatorio de los valores duplicados en el array final es: ");
    double sumatorio=0;
    for(int i=0;i<array_final.length;i++){
        if(i<9 && array_final[i]==array_final[i+1]){
            sumatorio+=array_final[i];
        }  
    }
    System.out.printf("%.0f",sumatorio*2);
    System.out.print(" ");
    
     System.out.print("\n");
    }
}
