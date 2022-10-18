/*
  Lista simple con funciones basicas:
    Ingresar elemento
    Buscar elemento 
    Modificar elemento
    Eliminar elemento
    Ver todos los elementos
    Verificar si la cola esta vacia
*/
package estructuras;
import javax.swing.JOptionPane;

public class ListaSimple {

    private Nodo primero = new Nodo();
    private Nodo ultimo = new Nodo();

    //  Constructor vacio. Crea la lista sin elementos (vacia)
    public ListaSimple() {
        primero = null;
        ultimo = null;
    }

    //  Método para agregar elementos a la lista
    public void ingresarNodo() {
        Nodo nodoNuevo = new Nodo();
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a ingresar"));
        nodoNuevo.setDato(dato);
     
        //  Ingresa el primer elemento de la lista
        if(listaVacia()) {
            primero = nodoNuevo;
            primero.setSiguiente(null);
            ultimo = primero;
        }
        //  Ingresa elementos a partir del primero
        if(!listaVacia()) {
            ultimo.setSiguiente(nodoNuevo);
            nodoNuevo.setSiguiente(null);
            ultimo = nodoNuevo;
        }
        JOptionPane.showMessageDialog(null,"Dato ingresa con exito");
    }

    //  Método para buscar un elemento dentro de la lista
    public Integer buscar() {
        if(!listaVacia()) {
            Nodo actual = new Nodo();
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar"));
            actual = primero;
            int posicion = 1;
            boolean nodoEncontrado = false;
         
            while(actual != null && nodoEncontrado != true) {
                if(actual.getDato() == dato) {
                    System.out.println("El elemento " + actual.getDato() + " esta en la posición " + posicion);
                    JOptionPane.showMessageDialog(null,"El elemento " + actual.getDato() + " esta en la posición " + posicion);
                    nodoEncontrado = true;
                 
                    return actual.getDato();
                }
                actual = actual.getSiguiente();
                posicion++;
            }
            if(!nodoEncontrado) {
                System.out.println("\nElemento no encontrado\n");
                JOptionPane.showMessageDialog(null,"\nElemento no encontrado\n");
             
                return null;
            }
        }else {
            System.out.println("\nLa lista esta vacia\n");
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }
        
        return null;
    }

    //  Método para modificar un elemento de la lista
    public void modificar() {
        if(!listaVacia()) {
            Nodo actual = new Nodo();
            actual = primero;
            boolean encontrado = false;
            int dato1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a modificar"));
            while(actual != null && encontrado != true) {
                if(actual.getDato() == dato1) {
                    int dato2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor"));
                    System.out.print("\nEl elemento " + actual.getDato());
                    actual.setDato(dato2);
                    System.out.print(" se modifico por " + actual.getDato() + "\n");
                    JOptionPane.showMessageDialog(null,"Se ha modificado correctamente");
                    encontrado = true;
                }
                actual = actual.getSiguiente();
            }
            if(!encontrado) {
                JOptionPane.showMessageDialog(null,"Elemento no encontrado");
            }
        }else {
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }
    }

    //  Método para eliminar elementos de la lista
    public void eliminar() {
        if(!listaVacia()) {
            Nodo actual = new Nodo();
            Nodo anterior = new Nodo();
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a eliminar"));
            actual = primero;
            anterior = null;
            int posicion = 1;
            boolean nodoEncontrado = false;
         
            while(actual != null && nodoEncontrado != true) {
                if(actual.getDato() == dato) {
                    System.out.print("\nEl elemento: " + actual.getDato() + " de la posición: " + posicion + " se ha eliminado\n");
                    JOptionPane.showMessageDialog(null,"El elemento: " + actual.getDato() + " de la posición: " + posicion + " se ha eliminado");
                 
                    if(actual == primero) {
                        primero = primero.getSiguiente();
                    }else if(actual == ultimo) {
                        anterior.setSiguiente(null);
                        ultimo = anterior;
                    }else {
                        anterior.setSiguiente(actual.getSiguiente());
                    }
                    nodoEncontrado = true;
                }
                anterior = actual;
                actual = actual.getSiguiente();
                posicion++;
            }
            if(!nodoEncontrado) {
                System.out.println("\nElemento no encontrado\n");
                JOptionPane.showMessageDialog(null,"Elemento no encontrado");
            }
        }else {
            System.out.println("\nLa lista esta vacia\n");
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }
    }

    //  Método para poder visualizar la lista
    public void verLista() {
        if(!listaVacia()) {
            Nodo actual = new Nodo();
            String lista = "";
            actual = primero;
         
            while(actual != null) {
                lista += "  " + actual.getDato() + "\n";
                actual = actual.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,"Lista\n" + lista);
         
        } else {
            System.out.println("\nLa lista esta vacia\n");
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }
    }

    //  Verifica que la lista no este vacia
    public boolean listaVacia() {
        return primero == null;
    }

}
