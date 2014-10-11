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

    public String Numero36() {
        String dato = " ";
        int numero = 0;
        for (int i = 0; i < vector.length; i++) {
            numero += vector[i];
            dato += " " + vector[i];
            if (numero >= 36) {
                return dato;
            }
        }

        return "Es mayor que 36";
    }
    
     public String Numero50() {
        String dato = " ";
        int numero = 0;
        for (int i = 0; i < vector.length; i++) {
            numero += vector[i];
            dato += " " + vector[i];
            if (numero >= 50) {
                return dato;
            }
        }

        return "Es mayor que 50";
    }

}
