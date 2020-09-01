/////////////////////////////////////
//  Ejercicio15 - Christian Ramos  //
/////////////////////////////////////

package Boletin6;
public class Ejercicio15 {
    public static void main(String[] args) {
    
    String primera_nota="";
    int compas=((int)(Math.random()*3)+1)*4; //Hasta 12 compases (4 ,8 ,12)
    
    System.out.println("NÚMERO DE COMPASES: "+compas);
    System.out.println("+--------------------------------------+");
    
    for(int c=0;c<compas;c++){
    for(int i=0;i<4;i++){
        int notas=(int)(Math.random()*7);
        String snotas="";
        switch(notas){
            case 0:
                snotas="Do";
            break;

            case 1:
                snotas="Re";
            break;

            case 2:
                snotas="Mi";
            break;

            case 3:
                snotas="Fa";
            break;

            case 4:
                snotas="Sol";
            break;

            case 5:
                snotas="La";
            break;

            case 6:
                snotas="Si";
            break;
        }
        if(i==0 && c==0){
            primera_nota=snotas;
        }
        
        if(i==3 && c==(compas-1)){
            snotas=primera_nota;
        }

        System.out.print(snotas+" ");
    
    }
    if(c!=(compas-1)){
        System.out.print(" | ");
    }
    }
    System.out.print(" ||\n");
    }
}
