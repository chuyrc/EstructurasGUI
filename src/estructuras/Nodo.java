/*
  Clase auxiliar para las clases:
    ListaSimple
    Cola
    Pila

    https://github.com/chuyrc/EstructurasGUI.git
*/
package estructuras;

public class Nodo {
    private int dato;
    private Nodo siguiente;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
