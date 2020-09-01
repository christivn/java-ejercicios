/////////////////////////////////////
//  Extra01 - Christian Ramos      //
/////////////////////////////////////

package Boletin8.String2;
public class Extra01 {
    
    public static void main(String[] args) {
        Extra01 email= new Extra01("test@gmail.com");
        email.contiene_arroba();
    }
    
    
    
    String email;
    
    public Extra01(String email) {
        this.email=email;
    }

    public void contiene_arroba () {
        if(this.email.contains("@")){
            System.out.println("El email ("+this.email+") contine '@'");
        } else {
            System.out.println("El email ("+this.email+") NO contine '@'");
        }
    }
    
}
