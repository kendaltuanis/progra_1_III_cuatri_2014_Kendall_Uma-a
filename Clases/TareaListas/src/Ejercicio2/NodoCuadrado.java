
package Ejercicio2;


public class NodoCuadrado {
    
    private int numero;
    private NodoCuadrado siguiente;
    

    public NodoCuadrado() {
        
        numero=0;
        siguiente=null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NodoCuadrado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCuadrado siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
