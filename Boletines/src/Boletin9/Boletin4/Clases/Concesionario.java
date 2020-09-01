/////////////////////////////////////
//  Concesionario - Christian Ramos //
/////////////////////////////////////

package Boletin9.Boletin4.Clases;

public class Concesionario {

    private static Coche[] coches;
    private static int valor_total;

    public Concesionario(Coche[] coches) {
        this.coches = coches;
        for(int i=0;i<coches.length;i++){
            valor_total+=coches[i].getPrecio();
        }
    }

    public void nuevoCoche(Coche coche) {
        Coche[] coches_array=new Coche[Concesionario.coches.length+1];
        
        for(int i=0;i<coches.length;i++){
            coches_array[i]=Concesionario.coches[i];
        }
        coches_array[coches_array.length-1]=coche;
        
        Concesionario.coches=coches_array;
        
        for(int i=0;i<coches.length;i++){
            valor_total+=coches[i].getPrecio();
        }
        System.out.println("[ SE HA AÑADIDO UN NUEVO COCHE AL CONCESIONARIO ]");
    }

    @Override
    public String toString() {
        String str="";
        for(int i=0;i<coches.length;i++){
            str+=coches[i]+"\n";
        }
        str+="\nPrecio total en coches: "+valor_total;
        return str;
    }
    
    

}
