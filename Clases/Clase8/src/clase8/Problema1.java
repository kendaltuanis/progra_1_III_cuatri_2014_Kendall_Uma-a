package clase8;

public class Problema1 {

    int[] vector = new int[8];

    public void AgregarElemento(int elemento) {

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {

                vector[i] = elemento;
                break;
            }

        }
    }

    public double valorAcomulado() {

        int elementos = 0;

        for (int i = 0; i < vector.length; i++) {
            elementos += vector[i];

        }
        return elementos;
    }

    public String mayor36() {

        int sum36 = 0;
        String dato = "";
        String resultado = "";

        for (int i = 0; i < vector.length; i++) {
            sum36 += vector[i];
            dato += vector[i] + "-";
            if (sum36 >= 36) {
                resultado += dato;
                dato = "";
                sum36 = 0;
            }

        }
        return resultado;

    }

    public String mayor50() {

        int sum50 = 0;
        String dato = "";
        String resultado = "";

        for (int i = 0; i < vector.length; i++) {
            sum50 += vector[i];
            dato += vector[i] + "-";
            if (sum50 >= 50) {
                resultado += dato;
                dato = "";
                sum50 = 0;
            }

        }
        return resultado;

    }

}
