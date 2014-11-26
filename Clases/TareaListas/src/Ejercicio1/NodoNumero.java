
package Ejercicio1;


public class NodoNumero {
    
    
    private int numero;
    private NodoNumero siguiente;
    

    public NodoNumero() {
        
        numero=0;
        siguiente=null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoNumero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoNumero siguiente) {
        this.siguiente = siguiente;
    }
    
}
