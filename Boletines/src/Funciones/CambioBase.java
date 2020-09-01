package Funciones;
public class CambioBase {

// binario_decimal("numero binario") ---> retorna el número en decimal
public static int binario_decimal(int n) {
    int numero=0;
    int[] array = new int[Funciones.Varias.digitos(n)];
    
        for(int i=0;i<Funciones.Varias.digitos(n);i++){
        array[i]=Funciones.Varias.digitoN(n, i+1);
        
        if(array[i]==1){
            numero+=Math.pow(2,(Funciones.Varias.digitos(n)-1)-i);
        }
    }
    
    return numero;
}

//==================================================================================================================//


// decimal_binario("numero decimal") ---> retorna el numero en binario
public static int decimal_binario(int n) {
    int cociente=n;
    int resto=0;
    int mul=1;
    
   while(2<=cociente) {
        resto+=(cociente%2)*mul;
        cociente/=2;
        mul*=10;
    }
   resto+=cociente*mul;
    
    return resto;
}


//==================================================================================================================//


// decimal_octal("numero decimal") ---> retorna el numero en octal
public static int decimal_octal(int n) {
    int cociente=n;
    int resto=0;
    int mul=1;
    
   while(8<=cociente) {
        resto+=(cociente%8)*mul;
        cociente/=8;
        mul*=10;
    }
   resto+=cociente*mul;
    
    return resto;
}


//==================================================================================================================//


// decimal_hexadecimal("numero decimal") ---> retorna el numero en hexadecimal
public static String decimal_hexadecimal(int n) {
    String numero="";
    
    int cociente=n;
    int resto=0;
    int mul=1;
    
   String caracter="";
   while(16<=cociente) {
        
        switch(cociente%16){
            case 0: caracter="0"; break;
            case 1: caracter="1"; break;
            case 2: caracter="2"; break;
            case 3: caracter="3"; break;
            case 4: caracter="4"; break;
            case 5: caracter="5"; break;
            case 6: caracter="6"; break;
            case 7: caracter="7"; break;
            case 8: caracter="8"; break;
            case 9: caracter="9"; break;
            case 10: caracter="A"; break;
            case 11: caracter="B"; break;
            case 12: caracter="C"; break;
            case 13: caracter="D"; break;
            case 14: caracter="E"; break;
            case 15: caracter="F"; break;
        }

        numero+=caracter;
        cociente/=16;
    }
   
   if(n<16){
            switch(cociente){
            case 0: numero="0"; break;
            case 1: numero="1"; break;
            case 2: numero="2"; break;
            case 3: numero="3"; break;
            case 4: numero="4"; break;
            case 5: numero="5"; break;
            case 6: numero="6"; break;
            case 7: numero="7"; break;
            case 8: numero="8"; break;
            case 9: numero="9"; break;
            case 10: numero="A"; break;
            case 11: numero="B"; break;
            case 12: numero="C"; break;
            case 13: numero="D"; break;
            case 14: numero="E"; break;
            case 15: numero="F"; break;
        }
   } else {
       numero+=Integer.toString(cociente);
   }
    
    String numero_invertido="";
    for(int i=numero.length()-1;i>=0;i--){
        numero_invertido+=numero.charAt(i);
    }
    
    return numero_invertido;
}


//==================================================================================================================//


// octal_decimal("numero octal") ---> retorna el numero en decimal
public static int octal_decimal(int n) {
    int numero=0;
    int[] array = new int[Funciones.Varias.digitos(n)];
    
    for(int i=0;i<Funciones.Varias.digitos(n);i++){
        array[i]=Funciones.Varias.digitoN(n, i+1);
        
        numero+=array[i]*Math.pow(8,(Funciones.Varias.digitos(n)-1)-i);
    }
    
    return numero;
}


//==================================================================================================================//


// hexadecimal_decimal("numero hexadecimal") ---> retorna el numero en decimal
public static int hexadecimal_decimal(String num) {
    int resultado=0;
    
    int numero=0;
    char caracter;
    for(int i=0;i<num.length();i++){
        caracter=num.charAt((num.length()-1)-i);
        switch(caracter){
            case '0': numero=0; break;
            case '1': numero=1; break;
            case '2': numero=2; break;
            case '3': numero=3; break;
            case '4': numero=4; break;
            case '5': numero=5; break;
            case '6': numero=6; break;
            case '7': numero=7; break;
            case '8': numero=8; break;
            case '9': numero=9; break;
            case 'A': numero=10; break;
            case 'B': numero=11; break;
            case 'C': numero=12; break;
            case 'D': numero=13; break;
            case 'E': numero=14; break;
            case 'F': numero=15; break;
        }
        
        resultado+=numero*(Math.pow(16,i));
    }
    
    return resultado;
}


}
