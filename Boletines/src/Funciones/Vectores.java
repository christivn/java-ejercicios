package Funciones;
public class Vectores {

/**
 * Imprime el array unidimensional
 * @param array
 * @return 
 */
public static String pintarArray(int[] array) {
    String tabla="";
    String fila="";
    

    int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
    
    int min=max;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }

    int digitos=0;
    if(max>0 && min>=0){
        digitos=Varias.digitos(max);
    } else {
        digitos=Varias.digitos(min)+1;
    }
    
    if(max==0 && min==0){
        digitos=1;
    }
    
    String gion="";
    for(int i=0;i<digitos+4;i++){
        gion+="-";
    }

    for(int i=0;i<array.length;i++){
        fila+="+"+gion;
    }
    fila+="+\n";
    tabla+=fila;
    
    String espacio="  ";
    for(int i=0;i<array.length;i++){
                String num_array=Integer.toString(array[i]);
                
                if(Varias.digitos(array[i])==digitos){
                    tabla+="|"+espacio+num_array+espacio;
                } else {
                    int array_digito=Varias.digitos(array[i]);
                    int dif=digitos-array_digito;
                    
                    String espacio_plus="";
                    
                    if(array[i]>0){
                        for(int y=0;y<dif;y++){
                            espacio_plus+=" ";
                        }
                    } else {
                        for(int y=0;y<dif-1;y++){
                            espacio_plus+=" ";
                        }
                    }
                    
                    tabla+="|"+espacio+num_array+espacio+espacio_plus;
                }
    }
    tabla+="|\n"+fila;
    
    return tabla;
}


//==================================================================================================================//

    
// generaArrayInt("tamaño","minimo","maximo") ---> Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro
public static int[] generaArrayInt(int t, int min, int max) {
    int numero=0;
    int[] array = new int[t];
    
    if(max!=0){
        max+=1;
    }
    
    for(int i=0;i<t;i++){
        array[i]=(int)(Math.random()*(max-min))+min;
    }
    
    return array;
}
    

//==================================================================================================================//


// minimoArrayInt("array") ---> Devuelve el mínimo del array que se pasa como parámetro.
public static int minimoArrayInt(int[] array) {
    int max=0;
    for(int i=0;i<array.length;i++){
        if(array[i]>max){
            max=array[i];
        }
    }
    
    int min=max;
    for(int i=0;i<array.length;i++){
        if(array[i]<min){
            min=array[i];
        }
    }
    
    return min;
}


//==================================================================================================================//


// maximoArrayInt("array") ---> Devuelve el maximo del array que se pasa como parámetro.
public static int maximoArrayInt(int[] array) {
    int max=0;
    for(int i=0;i<array.length;i++){
        if(array[i]>max){
            max=array[i];
        }
    }
    return max;
}


//==================================================================================================================//


// mediaArrayInt("array") ---> Devuelve la media del array que se pasa como parámetro.
public static int mediaArrayInt(int[] array) {
    int cont=0;
    int suma=0;
    for(int i=0;i<array.length;i++){
        suma+=array[i];
        cont++;
    }
    
    int media=suma/cont;
    return media;
}


//==================================================================================================================//


// estaEnArrayInt("array") ---> Devuelve un booleano que dice si el numero está en el array.
public static boolean estaEnArrayInt(int[] array, int n) {
    boolean check=false;
    for(int i=0;i<array.length;i++){
        if(array[i]==n){
            check=true;
        }
    }
    return check;
}


//==================================================================================================================//


// posicionEnArray("array") ---> Busca un número en un array y devuelve la posición (el índice) en la que se encuentra
public static int[] posicionEnArray(int[] array, int n) {
    int cont=0;
    for(int i=0;i<array.length;i++){
        if(array[i]==n){
            cont++;
        }
    }

    int[] posicion = new int[cont];
    int cont_posicion=0;
    for(int i=0;i<array.length;i++){
        if(array[i]==n){
            posicion[cont_posicion]=i;
            cont_posicion++;
        }
    }
    
    return posicion;
}


//==================================================================================================================//


// volteaArrayInt("array") ---> Devuelve el array volteado.
public static int[] volteaArrayInt(int[] array) {
    int[] volteado = new int[array.length];
    for(int i=0;i<array.length;i++){
        volteado[i]=array[(array.length-1)-i];
    }
    return volteado;
}


//==================================================================================================================//


// rotaDerechaArrayInt("array", "posiciones a rotar") ---> Rota el array a la derecha n posiciones
public static int[] rotaDerechaArrayInt(int[] array, int n) {
    int[] auxiliar = new int[array.length];
    
    int cont=0;
    for(int i=0;i<array.length;i++){
        if(i<n){
            auxiliar[i]=array[(array.length-n)+cont];
            cont++;
        } else {
            auxiliar[i]=array[i];
        }
    }

    for(int i=0;i<array.length;i++){
        if((i+n)<array.length){
            auxiliar[i+n]=array[i];
        }
    }
    
    return auxiliar;
}



//==================================================================================================================//


// rotaIzquierdaArrayInt("array", "posiciones a rotar") ---> Rota el array a la izquierda n posiciones
public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
    int[] auxiliar = new int[array.length];
    
    int cont=0;
    for(int i=0;i<array.length;i++){
        if(i>(array.length-(n+1))){
            auxiliar[i]=array[cont];
            cont++;
        } else {
            auxiliar[i]=array[i];
        }
    }

    for(int i=0;i<array.length;i++){
        if((i+n)<array.length){
            auxiliar[i]=array[i+n];
        }
    }
    
    return auxiliar;
}



}
