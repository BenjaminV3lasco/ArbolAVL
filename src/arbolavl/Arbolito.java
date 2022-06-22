
package arbolavl;
import 
public class Arbolito {
    private NodoAvl raiz;
    //Constructor
    public Arbolito(){
        raiz=null;
    }
    //Método Buscar
    public NodoAvl busqueda(int d, NodoAvl r){
    if (raiz==null){
     return null;
    }else if(r.dato==d){
        return r;
    }else if(r.dato<d){
        return busqueda (d,r.hijoDcho);
    }else{
        return busqueda(d,r.hijoIzq);
    }
  }
    //Método para obtener factor de equilibrio
    public int ObtenerFE(NodoAvl x){
        if(x==null){
        return -1;
        }else{
        return x.fe;
        }
    }
    //Método Rotación Izquierda
    public NodoAvl RotacionIzq(NodoAvl c){
    NodoAvl aux=c.hijoIzq;
    c.hijoIzq=aux.hijoDcho;
    aux.hijoDcho=c;
    c.fe = Math.max(ObtenerFE(c.hijoIzq), ObtenerFE(c.hijoDcho)) + 1;
    aux.fe = Math.max(ObtenerFE(aux.hijoIzq), ObtenerFE(aux.hijoDcho)) + 1;
    return aux;
    }
    //Método Rotación Derecha
    public NodoAvl RotacionDcho(NodoAvl c){
    NodoAvl aux=c.hijoDcho;
    c.hijoDcho=aux.hijoIzq;
    aux.hijoIzq=c;
    c.fe = Math.max(ObtenerFE(c.hijoIzq), ObtenerFE(c.hijoDcho)) + 1;
    aux.fe = Math.max(ObtenerFE(aux.hijoIzq), ObtenerFE(aux.hijoDcho)) + 1;
    return aux;
    }
    
}

