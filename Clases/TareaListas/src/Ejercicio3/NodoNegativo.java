
package Ejercicio3;


public class NodoNegativo {
    
    private int negativo;
    private NodoNegativo siguiente;

    public NodoNegativo() {
        negativo=0;
        siguiente=null;
        
    }

    public int getNegativo() {
        return negativo;
    }

    public void setNegativo(int negativo) {
        this.negativo = negativo;
    }

    public NodoNegativo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoNegativo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
