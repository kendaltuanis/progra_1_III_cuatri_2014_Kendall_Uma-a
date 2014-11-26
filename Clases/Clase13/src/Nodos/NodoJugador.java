

package Nodos;


public class NodoJugador {
    
    private String nombre;
    private int edad;

   private NodoJugador siguiente;
    
    
    public NodoJugador(){
        nombre="";
        edad=0;
    }

    public NodoJugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoJugador siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
