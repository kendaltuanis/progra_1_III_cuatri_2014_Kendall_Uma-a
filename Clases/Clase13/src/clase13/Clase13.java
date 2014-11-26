
package clase13;

import Listas.ListaJugadores;
import Nodos.NodoJugador;
import java.util.Scanner;


public class Clase13 {

   
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        ListaJugadores listaJugadoresLiga = new ListaJugadores();
        
        NodoJugador nodoJugador1=new NodoJugador();
        nodoJugador1.setNombre("Armando Aloso");
        nodoJugador1.setEdad(30);
        listaJugadoresLiga.Insertar(nodoJugador1);
        
        NodoJugador nodoJugador2=new NodoJugador();
        nodoJugador2.setNombre("Alvarado Sanchez");
        nodoJugador2.setEdad(28);
        listaJugadoresLiga.Insertar(nodoJugador2);
        
        NodoJugador nodoJugador3=new NodoJugador();
        nodoJugador3.setNombre("Patrick Pemberton");
        nodoJugador3.setEdad(31);
        listaJugadoresLiga.Insertar(nodoJugador3);
        
        System.out.println(listaJugadoresLiga.imprimir()); 
        
        
        
        
        
        
    }
    
}
