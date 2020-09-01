/////////////////////////////////////
//  Extra03 - Christian Ramos      //
/////////////////////////////////////

package Boletin8.String2;
public class Extra03 {
    public static void main(String[] args) {

    String[][] personas = new String[][]{
    { "Juan","juan@gmail.com" },
    { "Manuel","manuel@gmail.com" },
    { "Lucia","lucia@gmail.com" },
    { "Nerea","nereagmail.com" },
    { "Jesús","jesus@gmail.com" }};
    Extra03 info=new Extra03(personas);
    
    info.mostrar();
    System.out.print("\n");
    consultar_email("Lucia");
    System.out.print("\n");
    info.emails_sin_arroba();
    
    }
    
    
    public static String[][] array;
    public Extra03(String[][] info) {
        this.array=info;
    }
    
    public void mostrar () {
        System.out.println("+---------------+");
        System.out.println("|      INFO     |");
        System.out.println("+---------------+");
        for(int i=0;i<array.length;i++){
            System.out.println("Nombre: "+array[i][0]);
            System.out.println("Email: "+array[i][1]);
            System.out.println("+---------------+");
        }
    }
    
    public static void consultar_email(String nombre) {
        String email="";
        for(int i=0;i<array.length;i++){
            if(array[i][0].toLowerCase().equals(nombre.toLowerCase())){
                email=array[i][1];
            }
        }
        
        System.out.println("El email de "+nombre+" es "+email);
    }
    
    public void emails_sin_arroba() {
        for(int i=0;i<array.length;i++){
            if(!array[i][1].contains("@")){
                System.out.println("El email de "+array[i][0]+" <"+array[i][1]+"> no tiene '@'.");
            }
        }
    }
    
}