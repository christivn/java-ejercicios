package Boletin8.String2;
public class Examen04_Funciones {

    public static int palabras_mas_10_menos_14_co(String[] palabras) {
        int palabras_mas_10_menos_14_co=0;
        for(String palabra:palabras){
            if (palabra.length()>10 && palabra.length()<14 && palabra.toLowerCase().startsWith("co")){
                palabras_mas_10_menos_14_co++;
            }
        }
        return palabras_mas_10_menos_14_co;
    }
    
    public static int[] contador_vocales(String[] palabras) {
        char[] palabraChar;
        int[] vocales_cont=new int[5];
        String[] vocales=new String[5];
        vocales[0]="a";
        vocales[1]="e";
        vocales[2]="i";
        vocales[3]="o";
        vocales[4]="u";
    
        for (int i = 0; i < palabras.length; i++) {
            for (int y = 0; y < vocales.length; y++) {
                if (palabras[i].toLowerCase().contains(vocales[y])) {
                    palabraChar = palabras[i].toLowerCase().toCharArray();
                    for (int x = 0; x < palabraChar.length; x++) {
                        if (palabraChar[x] == vocales[y].charAt(0)) {
                            vocales_cont[y]++;
                        }
                    }
                }
            }
        }
        
        return vocales_cont;
    }
    
    
    public static String vocales_escritas(int[] vocales_cont) {
        String str="";
        String[] vocales=new String[5];
        vocales[0]="a";
        vocales[1]="e";
        vocales[2]="i";
        vocales[3]="o";
        vocales[4]="u";
        
        for(int i=0;i<vocales_cont.length;i++){
        if(i!=vocales_cont.length-1){
            if(vocales_cont[i]!=0){
                str+=vocales[i]+", ";
            }
        } else {
            if(vocales_cont[i]!=0){
                str+=vocales[i]+".";
            }
        }
        }
        
        return str;
    }
    
    
    public static String textoASCII(int[] vocales_cont) {
        String str_ascii="";
        
        String[] vocales=new String[5];
        vocales[0]="a";
        vocales[1]="e";
        vocales[2]="i";
        vocales[3]="o";
        vocales[4]="u";
        
        for(int i=0;i<vocales_cont.length;i++){
        if(i!=vocales_cont.length-1){
            if(vocales_cont[i]!=0){
                int ascii=(int)vocales[i].charAt(0);
                str_ascii+=ascii+" ";
            }
        } else {
            if(vocales_cont[i]!=0){
                int ascii=(int)vocales[i].charAt(0);
                str_ascii+=ascii+" ";
            }
        }
        }
        
        return str_ascii;
    }
    
    
    public static int cont_puntos(String str) {
        int cont=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'){
                cont++;
            }
        }
        return cont;
    }
    
    
    public static double porcentaje_espacios(String str) {
        double total_espacios=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                total_espacios+=1;
            }
        }
        
        double porcentaje=Math.round(str.length()*(total_espacios/100));
        return porcentaje;
    }
    
}