/////////////////////////////////////
//  Simulacro01 - Christian Ramos  //
/////////////////////////////////////

package Boletin5;
import java.util.Scanner;
public class Simulacro01 {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el día: ");
    int day=s.nextInt();
    
    System.out.print("Introduce el mes: ");
    int month=s.nextInt();
    
    System.out.print("Introduce el año: ");
    int year=s.nextInt();
    
    System.out.println("------------------------------");
    
    int m_day=day;
    int m_month=month;
    int m_year=year;
    
    boolean check=true;
    
    
    if(month<=12 && month>=1){
    if(day<1 || day>31 && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)){
        System.out.println("[ EL DÍA DEBE ESTAR ENTRE 0 y 31 ]");
        check=false;
    }
    if(day<1 || day>30 && (month==4 || month==6 || month==9 || month==11)){
        System.out.println("[ EL DÍA DEBE ESTAR ENTRE 0 y 30 ]");
        check=false;
    }
    if(day<1 || day>28 && month==2){
        System.out.println("[ EL DÍA DEBE ESTAR ENTRE 0 y 28 EN FEBRERO]");
        check=false;
    }
    }
    
    if(month>12 || month<1){
        System.out.println("[ EL MES DEBE DE ESTAR ENTRE 1 Y 12 ]");
        check=false;
    } 
    
    if(year==0){
        System.out.println("[ EL AÑO 0 NO HA EXISTIDO ]");
        check=false;
    } 

   if(check){
       
   if(day<31 && month!=2){
       m_day++;
   }
   
   if(day<28 && month==2){
       m_day++;
   }
   
   if(day==28 && month==2){
       m_day=01;
       m_month++;
   }
   
   if(day==31 && month!=12){
       m_day=01;
       m_month++;
   }
   
   if(day==31 && month==12){
       m_day=01;
       m_month=01;
       m_year++;
   }
       
    if(day>10 && month>10){
        System.out.println("Día de hoy: "+day+"/"+month+"/"+year+" ");
    } 
    if(day<10 && month>10){
        System.out.println("Día de hoy: 0"+day+"/"+month+"/"+year+" ");
    } 
    if(day>10 && month<10){
        System.out.println("Día de hoy: "+day+"/0"+month+"/"+year+" ");
    } 
    if(day<10 && month<10){
        System.out.println("Día de hoy: 0"+day+"/0"+month+"/"+year+" ");
    }
    
    if(m_day>10 && m_month>10){
        System.out.println("Día de mañana: "+m_day+"/"+m_month+"/"+m_year+" ");
    } 
    if(m_day<10 && m_month>10){
        System.out.println("Día de mañana: 0"+m_day+"/"+m_month+"/"+m_year+" ");
    } 
    if(m_day>10 && m_month<10){
        System.out.println("Día de mañana: "+m_day+"/0"+m_month+"/"+m_year+" ");
    } 
    if(m_day<10 && m_month<10){
        System.out.println("Día de mañana: 0"+m_day+"/0"+m_month+"/"+m_year+" ");
    }
   }
    
    }
}
