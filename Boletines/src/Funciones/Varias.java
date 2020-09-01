package Funciones;
public class Varias {
 
// esCapicua("número a comprobar") ---> retorna Verdadero o falso
public static boolean esCapicua(int n) {
   boolean capicua=false;
    
   if(voltea(n)==n){
       capicua=true;
   }
    
    return capicua;
}


//==================================================================================================================//


// esPrimo("número a comprobar") ---> retorna Verdadero o falso
public static boolean esPrimo(int n) {
    for(int i=2;i<n;i++){
        if((n%i)==0){
            return false;
        }
    }
    
    return true;
}


//==================================================================================================================//


// siguientePrimo("número a comprobar") ---> retorna int (El menor primo que es mayor al número pasado)
public static int siguientePrimo(int n) {
    int siguiente=n+1;
    while(esPrimo(siguiente)==false){
        siguiente++;
    }
    return  siguiente;
}


//==================================================================================================================//


// potencia("base", "exponente") ---> retorna int (Calcula la potencia)
public static int potencia(int b, int e) {
    int resultado=1;
    for(int i=0;i<e;i++){
        resultado*=b;
    }
    return  resultado;
}


//==================================================================================================================//


// digitos("numero") ---> retorna int (Calcula el número de diígitos de un número)
public static int digitos(int n) {
    int digitos=0;

    while(n!=0){
        n=n/10;
        digitos++;
    }
    
    return  digitos;
}


//==================================================================================================================//


// voltea("numero") ---> retorna int (Voltea el número introducido)
public static int voltea(int n) {
    int num_volteado=0;
    int resto;

    while(n>0){
        resto=n%10;
        num_volteado=num_volteado*10+resto;
        n/=10;
    }

    return  num_volteado;
}


//==================================================================================================================//


// digitoN("numero", "num digito") ---> retorna int (Devuelve el número de digitos del número "n" introducido)
public static int digitoN(int n, int digito) {
    int mul=1;
    n=voltea(n);
    for(int i=0;i<digito;i++){
        mul*=10;
    }
    
    int resultado;
    resultado=(n%mul)-(n%(mul/10)); 
    resultado=voltea(resultado);
    return  resultado;
}


//==================================================================================================================//


// posicionDeDigito("numero", "digito a buscar") ---> retorna int (Devuelve el "digito" del número introducido [Primera ocurrencia])
public static int posicionDeDigito(int n, int digito) {
    int resultado=-1;
    
    for(int i=1;i<digitos(n);i++){
        if(digitoN(n,i)==digito){
            resultado=i;
        }
    }
    if(resultado>0){
        resultado-=1;
    }
    
    return  resultado;
}


//==================================================================================================================//


// quitaPorDetras("numero", "digitos a quitar") ---> retorna int (Le quita a un número n dígitos por detrás por la derecha)
public static int quitaPorDetras(int n, int digitos) {
    int mul=1;
    for(int i=0;i<digitos;i++){
        mul*=10;
    }
    return  n/mul;
}


//==================================================================================================================//


// quitaPorDelante("numero", "digitos a quitar") ---> retorna int (Le quita a un número n dígitos por delante por la izquierda)
public static int quitaPorDelante(int n, int digitos) {
    int mul=1;
    for(int i=0;i<(digitos(n)-digitos);i++){
        mul*=10;
    }
    return  n%mul;
}


//==================================================================================================================//


// pegaPorDetras("numero", "digito a añadir") ---> retorna int (Añade un dígito a un número por detras)
public static int pegaPorDetras(int n, int digito) {
    int mul=1;
    for(int i=0;i<digitos(digito);i++){
        mul*=10;
    }
    return  (n*mul)+digito;
}


//==================================================================================================================//


// pegaPorDelante("numero", "digito a añadir") ---> retorna int (Añade un dígito a un número por delante)
public static int pegaPorDelante(int n, int digito) {
    int mul=1;
    for(int i=0;i<digitos(n);i++){
        mul*=10;
    }
    return  n+(digito*mul);
}


//==================================================================================================================//


// trozoDeNumero("numero", "inicio", "fin") ---> retorna int (Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente)
public static int trozoDeNumero(int n, int inicio, int fin) {
    fin=digitos(n)-fin;
    n=quitaPorDelante(n,inicio-1);
    n=quitaPorDetras(n,fin);
    return  n;
}


//==================================================================================================================//


// juntaNumeros("numero1", "numero2") ---> retorna int (Pega dos números para formar uno)
public static int juntaNumeros(int n1, int n2) {
    return  pegaPorDetras(n1,n2);
}

    
}
