
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
   public NodoAvl getIzquierdo() {
        return this.hijoIzq;
    }

    public void setIzquierdo(NodoAvl hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoAvl getDerecho() {
        return this.hijoDcho;
    }

    public void setDerecho(NodoAvl hijoDcho) {
        this.hijoDcho = hijoDcho;
    }
    
    void visitar()
    {
    System.out.print(dato + " ");
    }
}
