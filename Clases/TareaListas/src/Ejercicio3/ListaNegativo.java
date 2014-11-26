package Ejercicio3;

public class ListaNegativo {

    NodoNegativo raiz;

    public void Insertar(NodoNegativo numero) {

        NodoNegativo nuevo = new NodoNegativo();
        nuevo.setNegativo(numero.getNegativo());
        nuevo.setSiguiente(null);
        if (raiz == null) {

            raiz = nuevo;
        } else {

            NodoNegativo aux;
            aux = raiz;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }

    }

    public void Validar() {

        NodoNegativo aux;
        aux = raiz;
        while (aux != null) {
            if (aux.getNegativo() < 0) {

                aux.setNegativo(0);
            }
            aux = aux.getSiguiente();
        }

    }

}
