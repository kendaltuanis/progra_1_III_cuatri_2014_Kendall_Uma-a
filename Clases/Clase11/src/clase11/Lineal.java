package clase11;

public class Lineal {

    public int busquedaLinea(int[] arreglo, int elemento) {

        for (int i = 0; i < arreglo.length; i++) {

            if (arreglo[i] == elemento) {

                return i;
            }

        }
        return -1;

    }

}
