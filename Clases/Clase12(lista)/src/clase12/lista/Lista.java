package clase12.lista;

public class Lista {

    private NodoDeLista raiz;

    public void Insertar(NodoDeLista elemento) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setMatricula(elemento.getMatricula());
        nuevo.setDueno(elemento.getDueno());
        nuevo.setMarca(elemento.getMarca());

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoDeLista auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }

    }

    public void Imprimir() {

        NodoDeLista recorrido = raiz;
        System.out.println("Listado de todo los elementos de la lista");
        while (recorrido != null) {
            System.out.println("La marca es: " + recorrido.getMarca()
                    + ",el dueño es: " + recorrido.getDueno()
                    + ", la matrícula es: " + recorrido.getMatricula());
            recorrido=recorrido.getSiguiente();
        }
        System.out.println();
    }

}
