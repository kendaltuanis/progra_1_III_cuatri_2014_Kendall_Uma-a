package clase8;

public class Problema4 {

    int[] elementos = new int[10];

    public void AgregarElemento(int elemento) {

        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == 0) {

                elementos[i] = elemento;
                break;
            }

        }
    }

    public String verificarOrdenado() {
        String ordenado = "Esta ordenado de menor a mayor";
        String desordenado = "Esta desordenado";

        int orden = 1;
        for (int i = 0; i < 9; i++) {
            if (elementos[i + 1] < elementos[i]) {
                orden = 0;
            }
        }
        if (orden == 1) {
            return ordenado;
        } else {
            return desordenado;
        }

    }

}
