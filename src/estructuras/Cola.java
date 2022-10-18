/*
  Cola simple con funciones basicas:
    Ingresar elemento
    Extraer elemento
    Mostrar elementos
    Verificar si la cola esta vacia
*/
package estructuras;
import javax.swing.JOptionPane;

public class Cola {

    private Nodo primero;
    private Nodo ultimo;

    //  Se declara la cola vacia
    public Cola() {
        primero = null;
        ultimo = null;
    }

    //  Método para ingresar elementos a la lista
    public void ingresar(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
     
        if(colaVacia()) {
            primero = nuevo;
            primero.setSiguiente(null);
            ultimo = nuevo;
        }
        if(!colaVacia()) {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(null);
            ultimo = nuevo;
        }
        JOptionPane.showMessageDialog(null,"Se ha añadido el dato");
    }

    //  Método para extraer y eliminar elementos de la cola
    public Integer extraer() {
        if(!colaVacia()) {
            int dato = primero.getDato();
         
            if(primero == ultimo) {
                primero = null;
                ultimo = null;
            }else {
                primero = primero.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,"Se ha extraido un elemento");
         
            return dato;
        } else {
            System.out.println("\nLa cola esta vacia\n");
            JOptionPane.showMessageDialog(null,"La cola esta vacia");
         
            return null;
        }
    }

    //  Método para mostrar todos los elementos de la cola
    public void mostrarCola() {
        if(!colaVacia()) {
            Nodo nuevo = primero;
            String colaInvertida = "";
            String cola = "";
         
            while(nuevo != null) {
                cola += "  " + nuevo.getDato() + "\n";
                nuevo = nuevo.getSiguiente();
            }
            String[] cadena = cola.split(" ");
         
            for(int i = cadena.length - 1; i >= 0; i--) {
                colaInvertida += "" + cadena[i];
            }
            System.out.println(colaInvertida);
            JOptionPane.showMessageDialog(null,"Cola\n" + colaInvertida);
         
        } else {
            System.out.println("\nLa cola esta vacia\n");
            JOptionPane.showMessageDialog(null,"La cola esta vacia");
        }
    }

    //  Método para saber si la cola esta vacia
    public boolean colaVacia() {
        return primero == null;
    }

}
