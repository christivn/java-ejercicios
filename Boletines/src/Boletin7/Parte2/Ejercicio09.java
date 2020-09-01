/////////////////////////////////////
//  Ejercicio09 - Christian Ramos  //
/////////////////////////////////////

package Boletin7.Parte2;
public class Ejercicio09 {
    public static void main(String[] args) {
    
    int[][]n=new int[12][12];
    int[][]n_aux=new int[12][12];
    
    for(int i=0;i<12;i++){
        for(int x=0;x<12;x++){
            n[i][x]=(int)(Math.random()*(101));
        }
    }
    
    
    System.out.print("\u001B[42m ARRAY GENERADO \u001B[0m\n");
    for(int i=0;i<12;i++){
        System.out.print("+------+------+------+------+------+------+------+------+------+------+------+------+\n");
        for(int x=0;x<12;x++){
            if(i==0 || i==11 || x==0 || x==11){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[31m",n[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==1 || i==10 || x==1 || x==10){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[32m",n[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==2 || i==9 || x==2 || x==9){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[33m",n[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==3 || i==8 || x==3 || x==8){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[35m",n[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==4 || i==7 || x==4 || x==7){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[36m",n[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==5 || i==6 || x==5 || x==6){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[34m",n[i][x]);
                System.out.print("\u001B[0m");
            }
                            }
                        }
                    }
                }
            }
        }
        System.out.print("|\n");
    }
    System.out.print("+------+------+------+------+------+------+------+------+------+------+------+------+\n\n");
    
    
    
    
    for(int i=0;i<12;i++){
        for(int x=0;x<12;x++){
            if(i==0 || i==11 || x==0 || x==11){
                
                if(x<11 && i==0){
                    n_aux[i][x+1]=n[i][x];
                }
                
                if(x==11 && i==1){
                    n_aux[i][x]=n[0][11];
                }
                
                if(x==11 && i<11){
                    n_aux[i+1][x]=n[i][x];
                }
                
                if(x==10 && i==11){
                    n_aux[i][x]=n[11][11];
                }
                
                if(x>0 && i==11){
                    n_aux[i][x-1]=n[i][x];
                }
                
                if(x==0 && i==10){
                    n_aux[i][x]=n[11][0];
                }
                
                if(x==0 && i>0){
                    n_aux[i-1][x]=n[i][x];
                }
                
            } else {
            if(i==1 || i==10 || x==1 || x==10){

                if(x<11-1 && i==0+1){
                    n_aux[i][x+1]=n[i][x];
                }
                
                if(x==11-1 && i==1+1){
                    n_aux[i][x]=n[0+1][11-1];
                }
                
                if(x==11-1 && i<11+1){
                    n_aux[i+1][x]=n[i][x];
                }
                
                if(x==10-1 && i==11-1){
                    n_aux[i][x]=n[11-1][11-1];
                }
                
                if(x>0+1 && i==11-1){
                    n_aux[i][x-1]=n[i][x];
                }
                
                if(x==0+1 && i==10-1){
                    n_aux[i][x]=n[11-1][0+1];
                }
                
                if(x==0+1 && i>0+1){
                    n_aux[i-1][x]=n[i][x];
                }
                
            } else {
            if(i==2 || i==9 || x==2 || x==9){

                if(x<11-2 && i==0+2){
                    n_aux[i][x+1]=n[i][x];
                }
                
                if(x==11-2 && i==1+2){
                    n_aux[i][x]=n[0+2][11-2];
                }
                
                if(x==11-2 && i<11+2){
                    n_aux[i+1][x]=n[i][x];
                }
                
                if(x==10-2 && i==11-2){
                    n_aux[i][x]=n[11-2][11-2];
                }
                
                if(x>0+2 && i==11-2){
                    n_aux[i][x-1]=n[i][x];
                }
                
                if(x==0+2 && i==10-2){
                    n_aux[i][x]=n[11-2][0+2];
                }
                
                if(x==0+2 && i>0+2){
                    n_aux[i-1][x]=n[i][x];
                }
                
            } else {
            if(i==3 || i==8 || x==3 || x==8){

                if(x<11-3 && i==0+3){
                    n_aux[i][x+1]=n[i][x];
                }
                
                if(x==11-3 && i==1+3){
                    n_aux[i][x]=n[0+3][11-3];
                }
                
                if(x==11-3 && i<11+3){
                    n_aux[i+1][x]=n[i][x];
                }
                
                if(x==10-3 && i==11-3){
                    n_aux[i][x]=n[11-3][11-3];
                }
                
                if(x>0+3 && i==11-3){
                    n_aux[i][x-1]=n[i][x];
                }
                
                if(x==0+3 && i==10-3){
                    n_aux[i][x]=n[11-3][0+3];
                }
                
                if(x==0+3 && i>0+3){
                    n_aux[i-1][x]=n[i][x];
                }
                
            } else {
            if(i==4 || i==7 || x==4 || x==7){

                if(x<11-4 && i==0+4){
                    n_aux[i][x+1]=n[i][x];
                }
                
                if(x==11-4 && i==1+4){
                    n_aux[i][x]=n[0+4][11-4];
                }
                
                if(x==11-4 && i<11+4){
                    n_aux[i+1][x]=n[i][x];
                }
                
                if(x==10-4 && i==11-4){
                    n_aux[i][x]=n[11-4][11-4];
                }
                
                if(x>0+4 && i==11-4){
                    n_aux[i][x-1]=n[i][x];
                }
                
                if(x==0+4 && i==10-4){
                    n_aux[i][x]=n[11-4][0+4];
                }
                
                if(x==0+4 && i>0+4){
                    n_aux[i-1][x]=n[i][x];
                }
                
            } else {
            if(i==5 || i==6 || x==5 || x==6){
                
                if(x<11-5 && i==0+5){
                    n_aux[i][x+1]=n[i][x];
                }
                
                if(x==11-5 && i==1+5){
                    n_aux[i][x]=n[0+5][11-5];
                }
                
                if(x==10-5 && i==11-5){
                    n_aux[i][x]=n[11-5][11-5];
                }
                
                if(x==0+5 && i==10-5){
                    n_aux[i][x]=n[11-5][0+5];
                }

            }
                            }
                        }
                    }
                }
            }
        }
    }
    
    
    System.out.print("\u001B[41m ARRAY ORDENADO \u001B[0m\n");
        for(int i=0;i<12;i++){
        System.out.print("+------+------+------+------+------+------+------+------+------+------+------+------+\n");
        for(int x=0;x<12;x++){
            if(i==0 || i==11 || x==0 || x==11){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[31m",n_aux[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==1 || i==10 || x==1 || x==10){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[32m",n_aux[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==2 || i==9 || x==2 || x==9){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[33m",n_aux[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==3 || i==8 || x==3 || x==8){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[35m",n_aux[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==4 || i==7 || x==4 || x==7){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[36m",n_aux[i][x]);
                System.out.print("\u001B[0m");
            } else {
            if(i==5 || i==6 || x==5 || x==6){
                System.out.printf("%-2s %-4s","| \u001B[0m\u001B[34m",n_aux[i][x]);
                System.out.print("\u001B[0m");
            }
                            }
                        }
                    }
                }
            }
        }
        System.out.print("|\n");
    }
    System.out.print("+------+------+------+------+------+------+------+------+------+------+------+------+\n\n");
    
    }
}
