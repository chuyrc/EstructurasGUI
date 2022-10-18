/*
  Pila simple con funciones basicas:
    Verificar si la pila esta vacia
    Ingresar elementos a la pila
    Eliminar y extraer el tope de la pila
    Mostrar el tope de la pila
    Obtener el tamaño de la pila
    Vaciar por completo la pila
    Mostrar los elementas de la pila
*/
package estructuras;
import javax.swing.JOptionPane;

public class Pila {

    private Nodo ultimo;
    private int tamano;

    //  Constructor, crea la pila vacia
    public Pila() {
        ultimo = null;
        tamano = 0;
    }

    //  Método para saber si la pila esta vacia
    public boolean pilaVacia() {
        return ultimo == null;
    }

    //  Metodo pada ingresar elementos a la pila
    public void ingresar(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        nuevo.setSiguiente(ultimo);
        ultimo = nuevo;
        tamano++;
    }

    //  Método para eliminar elementos
    public int extraer() {
        //if(!pilaVacia()) {
            int dato = ultimo.getDato();
            ultimo = ultimo.getSiguiente();
            tamano--;
         
            return dato;
        //} 
     
        //JOptionPane.showMessageDialog(null,"La pila esta vacia");
        //return null;
    }

    //  Método para saber el tope de la pila
    public Integer mostrarTope() {
        if(!pilaVacia())
            return ultimo.getDato();
     
        return null;
    }

    //  Método para saber el tamaño de la pila
    public int getTamano() {
        return tamano;
    }
    
    //  Método para vaciar la pila
    public void vaciarPila() {
        while(!pilaVacia()) {
            extraer();
        }
    }

    //  Método para mostrar la pila
    public void mostrarPila() {
        if(!pilaVacia()) {
            Nodo actual = ultimo;
            String lista = "";
         
            while(actual != null) {
                lista += "  " + actual.getDato() + "\n";
                actual = actual.getSiguiente();
            }
            System.out.println("\nPila:\n" + lista);
            JOptionPane.showMessageDialog(null,"Pila:\n" + lista);
        }else {
            System.out.println("\nLa pila esta vacia\n");
            JOptionPane.showMessageDialog(null,"La pila esta vacia");
        }
    }

}
