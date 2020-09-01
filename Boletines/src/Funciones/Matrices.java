package Funciones;
public class Matrices {

/**
 * Imprime el array bidimensional
 * @param array
 * @return 
 */
public static String pintarArrayBi(int[][] array) {
    String tabla="";
    String fila="";

    int max=0;
        for(int i=0;i<array.length;i++){
            for(int x=0;x<array[0].length;x++){
                if(array[i][x]>max){
                    max=array[i][x];
                }
            }
        }
    
    int min=max;
        for(int i=0;i<array.length;i++){
            for(int x=0;x<array[0].length;x++){
                if(array[i][x]<min){
                    min=array[i][x];
                }
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

    for(int i=0;i<array[0].length;i++){
        if(i==(array[0].length)){
            fila+="+";
        } else {
            fila+="+"+gion;
        }
    }
    fila+="+\n";
    tabla+=fila;
    
    String espacio="  ";
    for(int i=0;i<array.length;i++){
        for(int x=0;x<array[0].length;x++){
                String num_array=Integer.toString(array[i][x]);
                
                if(Varias.digitos(array[i][x])==digitos){
                    tabla+="|"+espacio+num_array+espacio;
                } else {
                    int array_digito=Varias.digitos(array[i][x]);
                    int dif=digitos-array_digito;
                    
                    String espacio_plus="";
                    
                    if(array[i][x]>0){
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
    }
    
    return tabla;
}
    
 
//==================================================================================================================//
 
    
// generaArrayBiInt("alto", "ancho","minimo","maximo") ---> Genera un array de tamaño n * m con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro
public static int[][] generaArrayBiInt(int n, int m, int min, int max) {
    int numero=0;
    int[][] array = new int[n][m];
    
    if(max!=0){
        max+=1;
    }
    
    for(int i=0;i<n;i++){
        for(int x=0;x<m;x++){
            array[i][x]=(int)(Math.random()*(max-min))+min;
        }
    }
    
    return array;
}
    

//==================================================================================================================//

// filaDeArrayBiInt("array","fila") ---> Devuelve la fila del array introducido
public static int[] filaDeArrayBiInt(int[][] array, int n) {
    int[] vector_array = new int[array[0].length];
    
    for(int i=0;i<array[0].length;i++){
        vector_array[i]=array[n][i];
    }
    
    return vector_array;
}
    
    
//==================================================================================================================//

// columnaDeArrayBiInt("array","columna") ---> Devuelve la fila del array introducido
public static int[] columnaDeArrayBiInt(int[][] array, int n) {
    int[] vector_array = new int[array.length];
    
    for(int i=0;i<array.length;i++){
        vector_array[i]=array[i][n];
    }
    
    return vector_array;
}


//==================================================================================================================//

// coordenadasEnArrayBiInt("array","número a buscar") ---> Devuelve todas las posiciones de un número introducido dentro de un array bidimensional (Si no encuentra nada devuelve [-1,-1])
public static int[][] coordenadasEnArrayBiInt(int[][] array, int n) {
    
    int ocurrencias=0; //número de ocurrencias para definir la longitud del array
    for(int i=0;i<array[0].length;i++){
        for(int x=0;x<array.length;x++){
            if(array[x][i]==n){
                ocurrencias++;
            }
        }
    }
    
    if(ocurrencias!=0){
        
        int[][] matriz_array = new int[ocurrencias][2];
        
        //Se guarda la pocisión del número
        int cont_fila=0;
        int cont_col=0;
        for(int i=0;i<array.length;i++){
            for(int x=0;x<array[0].length;x++){
                if(array[i][x]==n){
                    matriz_array[cont_fila][cont_col]=i;
                    cont_col++;
                    matriz_array[cont_fila][cont_col]=x;
                    cont_col=0;
                    cont_fila++;
                }
            }
        }
        
        //La primera ocurrencia simpre estará en la fila 0
        return matriz_array;
        
    } else {
        //Si no encuentra nada devuelve [-1,-1]
        int[][] matriz_array = new int[1][2];
            matriz_array[0][0]=-1;
            matriz_array[0][1]=-1;
        return matriz_array;
    }
   
    
}


//==================================================================================================================//

// esPuntoDeSilla("array","fila","columna") ---> Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna
public static boolean esPuntoDeSilla(int[][] array, int f, int c) {
    
    int n=array[f][c];
    int valid=0;
    
    int[] vector_fila=filaDeArrayBiInt(array,f);
        for(int x=0;x<vector_fila.length;x++){
            if(vector_fila[x]<n){
                valid++;
            }
        }
    
    int[] vector_col=columnaDeArrayBiInt(array,c);
        
        for(int x=0;x<vector_col.length;x++){
            if(vector_col[x]>n){
                valid++;
            }
        }
    
    if(valid!=0){
        boolean check=false;
        return check;
    } else {
        boolean check=true;
        return check;
    }
}


//==================================================================================================================//

// diagonal("array","fila","columna","dirección") ---> Devuelve un array que contiene una de las diagonales del array bidimensional que se pasa como parámetro. 

/* La dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
cadena “nose” indica que se elige la diagonal que va del noroeste hacia
el sureste, mientras que la cadena “neso” indica que se elige la diagonal
que va del noreste hacia el suroeste.*/

// nose (\) = noroeste -> suroeste
// neso (/) = noreste -> suroeste

public static int[] diagonal(int[][] array, int f, int c, String direccion) {
    
    direccion=direccion.toLowerCase();
    
    switch(direccion){
    
    case "neso":
        int longitud=0;
        for(int i=0;i<array.length;i++){
            for(int x=0;x<array[0].length;x++){
                if(i==(f+longitud) && x==(c-longitud)){
                    longitud++;
                }
            }
        }
    
        int[] vector = new int[longitud];
        int cont=0;
        for(int i=0;i<array.length;i++){
            for(int x=0;x<array[0].length;x++){
                if(i==(f+cont) && x==(c-cont)){
                    vector[cont]=array[i][x];
                    cont++;
                }
            }
        }
        
        return vector;
        
    case "nose":
        int longitud2=0;
        for(int i=0;i<array.length;i++){
            for(int x=0;x<array[0].length;x++){
                if(i==(f+longitud2) && x==(c+longitud2)){
                    longitud2++;
                }
            }
        }
    
        int[] vector2 = new int[longitud2];
        int cont2=0;
        for(int i=0;i<array.length;i++){
            for(int x=0;x<array[0].length;x++){
                if(i==(f+cont2) && x==(c+cont2)){
                    vector2[cont2]=array[i][x];
                    cont2++;
                }
            }
        }
        
        return vector2;
        
    default:
        int[] vector_cero = new int[2];
            vector_cero[0]=-1;
            vector_cero[1]=-1;
        return vector_cero;
    }
    
}


//==================================================================================================================//


}
