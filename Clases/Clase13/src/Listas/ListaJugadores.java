
package Listas;

import Nodos.NodoJugador;


public class ListaJugadores {
    
    NodoJugador raiz;
    
    public void Insertar(NodoJugador jugador) {

       NodoJugador nuevo = new NodoJugador();
        nuevo.setNombre(jugador.getNombre());
        nuevo.setEdad(jugador.getEdad());
        nuevo.setSiguiente(null);
        
        if (raiz == null) {

            raiz = nuevo;
        } else {

            NodoJugador aux;
            aux = raiz;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }

    }
    
    public boolean Eliminar(String nombre){
    
        NodoJugador siguienteJugador =raiz;
        NodoJugador anterior=siguienteJugador;
        if(siguienteJugador==null){
        
            System.out.println("La lista está vacia");
            return true;
        }
        while(siguienteJugador!=null){
        
            if(siguienteJugador.getNombre().equals(nombre)){
                          if(raiz==siguienteJugador){
                              raiz=siguienteJugador.getSiguiente();
                          }
                          anterior.setSiguiente(siguienteJugador.getSiguiente());
                          return true;
            }
            anterior=siguienteJugador;
            siguienteJugador=siguienteJugador.getSiguiente();
            
        }
        return false;
        
    }
    
    public String imprimir(){
    
        NodoJugador aux;
        aux=raiz;
        String temporal="";
        while(aux!=null){
        
            temporal+="Nombre "+aux.getNombre()+", Edad"+aux.getEdad()+"\n";
            aux=aux.getSiguiente();
        }
    
    return temporal;
    
    }
    
}
