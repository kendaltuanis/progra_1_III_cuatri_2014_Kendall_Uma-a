package proyecto;

public class Ejercicio1 {

    private String palabra;
    private int saltos;
    String resultado = "";
    int temp = 0;

    public Ejercicio1(String palabra, int saltos) {

        this.palabra = palabra;
        this.saltos = saltos;
    }

    char[] abeceMinu = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] abeceMayu = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public void letras() {

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j <= abeceMinu.length - 1; j++) {

                if (palabra.charAt(i) == abeceMinu[j]) {

                    if ((j + saltos) > abeceMinu.length - 1) {

                        temp = ((j + saltos) - (abeceMinu.length - 1));
                        resultado += "" + abeceMinu[temp - 1];

                    } else {

                        resultado += "" + abeceMinu[j + saltos];

                    }

                }
                
                if (palabra.charAt(i) == abeceMayu[j]) {

                    if ((j + saltos) > abeceMayu.length - 1) {

                        temp = ((j + saltos) - (abeceMayu.length - 1));
                        resultado += "" + abeceMayu[temp - 1];

                    } else {

                        resultado += "" + abeceMayu[j + saltos];

                    }

                }

            }

        }

    }

    public String numerosyResultado() {

        for (int i = 0; i < palabra.length(); i++) {

            for (int j = 0; j <= numeros.length - 1; j++) {

                if (palabra.charAt(i) == numeros[j]) {

                    if ((j + saltos) > numeros.length - 1) {

                        temp = ((j + saltos) - (numeros.length - 1));
                        resultado += "" + numeros[temp - 1];

                    } else {

                        resultado += "" + numeros[j + saltos];

                    }
                }
            }

        }

        return resultado;

    }
}
