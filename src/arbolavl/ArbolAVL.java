
package arbolavl;
import java.util.Scanner;
public class ArbolAVL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta, respuesta_arbol;
        Arbolito Arbol = new Arbolito();
        Arbol.insertarAvl(5);
        Arbol.insertarAvl(6);
        Arbol.insertarAvl(3);
        Arbol.insertarAvl(1);
        Arbol.insertarAvl(4);

            //Menú
            System.out.println("¡Bienvenido al menú para crear un Árbol Avl!");
        do{
            System.out.println("Ingrese 1 para insertar un nodo");
            System.out.println("Ingrese 2 para recorrer el árbol");
            System.out.println("Ingrese 3 para salir");
            respuesta=sc.nextInt();
            sc.nextLine();
                while(respuesta<1 || respuesta>3){
                System.out.println("Error: La opcion ingresa no es válida");
                System.out.println("Ingrese 1 para insertar un nodo");
                System.out.println("Ingrese 2 para recorrer el árbol");
                System.out.println("Ingrese 3 para salir");
                respuesta=sc.nextInt();
                sc.nextLine();
                }
            switch(respuesta){
               case 1:
                System.out.println("¡Los nodos fueron insertados de manera correcta!");
                    break;
                case 2:
                   System.out.println("¿Como desea recorrer el árbol?");
                   System.out.println("1. Recorrido Inorden");
                   System.out.println("2. Recorrido Preorden");
                   System.out.println("3. Recorrido Postorden");
                   respuesta_arbol=sc.nextInt();
                   sc.nextLine();
                    switch(respuesta_arbol){
                        case 1:
                    System.out.println("Recorrido en Inorden:");
                    Arbol.preorden(Arbol.obtenerRaiz());
                    break;
                        case 2:
                    System.out.println("Recorrido en Preorden:");
                    Arbol.preorden(Arbol.obtenerRaiz());
                     break;
                        case 3:
                     System.out.println("Recorrido en Postorden:");
                     Arbol.postorden(Arbol.obtenerRaiz());
                     break;
                    }
                    break;
                }    
        }while(respuesta<3);
    }
 }
    

