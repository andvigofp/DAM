package pila;



/**
 * @Author: Andrés Fernández Pereira
 */

//Clase pila Dinamica
//parametro <T>

public class PilaDinamica<T> {

    //Atributos
    private Nodo<T> top; //Ultimodo nodo que se ha incluido
    private int tamanio;

    //Constructores
    public PilaDinamica() {
        top = null; //No hay elementos
        this.tamanio = 0;
    }

    //Indica si esta vacia o no
    // return

    public boolean isEmpy() {
        return top == null;

    }

    //Indica el tamaño
    //return

    public int size() {
        return this.tamanio;
    }

    //Devuelve el que esta más arriba en la pila
    // return

    public T top() {
      if (isEmpy()) {
          return null;
      } else {
          return top.getElemento();
      }
    }
    // Saca y devuelve el elemnto que mas arriba esta en la pila
    //return

    public T pop() {
        if (isEmpy()) {
            return null;
        } else {
            T elemento = top.getElemento();
            Nodo<T> aux = top.getSiguiente();
            top = null; //marco para borrar
            top = aux; //actualizo el top
            this.tamanio--;
            return elemento;
        }
    }

    public T push (T elemento) {
        Nodo<T> aux = new Nodo<>(elemento, top);
        top = aux; //actualizar el top
        this.tamanio++;
        return aux.getElemento();
    }

    //Devuelve el estado de la pila
    //return

    public String toString() {
       if (isEmpy()) {
           return "La pila esta vacia";
       } else {
           String resultado = "";
           Nodo<T> aux = top;
           //Recorro la pila
           while (aux != null) {
               resultado += aux.toString();
               aux = aux.getSiguiente();
           }
           return resultado;
       }
    }

}





