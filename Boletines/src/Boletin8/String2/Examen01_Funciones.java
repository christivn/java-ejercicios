package Boletin8.String2;
public class Examen01_Funciones {

    
    public static int pesetas_duros20(int pesetas) {
        int duros20=0;
        if((pesetas/100)>0){
            while((pesetas-100)>=0){
                pesetas-=100;
                duros20++;
            }
        }
        return duros20;
    }
    
    public static int pesetas_duros5(int pesetas) {
        pesetas-=pesetas_duros20(pesetas)*100;
        
        int duros5=0;
        if((pesetas/25)>0){
            while((pesetas-25)>=0){
                pesetas-=25;
                duros5++;
            }
        }
        return duros5;
    }
    
    public static int pesetas_duros1(int pesetas) {
        pesetas-=pesetas_duros20(pesetas)*100;
        pesetas-=pesetas_duros5(pesetas)*25;
        
        int duros1=0;
        if((pesetas/5)>0){
            while((pesetas-5)>=0){
                pesetas-=5;
                duros1++;
            }
        }
        return duros1;
    }
    
    public static boolean multiplo5(int n) {
        if(n%5==0){
            return true;
        } else {
            return false;
        }
    }
    
    
}
