
package arbolavl;

public class NodoAvl {
    int dato;
    int fe; //Factor de equilibrio
    NodoAvl hijoIzq, hijoDcho;
    
    //Constructor
    public NodoAvl (int d){
        this.dato = d;
        this.fe = 0;
        this.hijoIzq=null;
        this.hijoDcho=null;
    }
   
    
    void visitar()
    {
    System.out.print(dato + " ");
    }
}
