package Boletin8.String2;
public class Examen03_Funciones {

    public static boolean minusculaChar(char caracter) {
        String str_caracter=caracter+"";
        if(str_caracter.equals(str_caracter.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean vocal(String caracter) {
        if(caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u")){
            return true;
        } else {
            return false;
        }
    }
    
}
