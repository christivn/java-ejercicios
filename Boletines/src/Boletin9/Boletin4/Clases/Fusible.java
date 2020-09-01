/////////////////////////////////////
//  Bombillas - Christian Ramos  //
/////////////////////////////////////

package Boletin9.Boletin4.Clases;

public class Fusible {

    private Bombilla[] bombillas;
    private static boolean fusible=false;

    public Fusible(Bombilla[] bombillas) {
        this.bombillas = bombillas;
        this.fusible = false;
    }


    public boolean Estado() {
        return fusible;
    }
        
    public void SaltarFusibles() {
        this.fusible = true;
        for(int i=0;i<bombillas.length;i++){
            bombillas[i].setEstado(false);
        }
        System.out.println("[ HAN SALTADO LOS FUSIBLES ]");
    }
    
    public void RepararFusibles() {
        this.fusible = false;
        for(int i=0;i<bombillas.length;i++){
            bombillas[i].setEstado(true);
        }
        System.out.println("[ SE HAN REPARADO LOS FUSIBLES ]");
    }

}
