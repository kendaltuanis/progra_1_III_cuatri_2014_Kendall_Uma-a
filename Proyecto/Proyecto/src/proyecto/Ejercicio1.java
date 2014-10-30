package proyecto;

public class Ejercicio1 {

    private String palabra;
    private int saltos;
    String resultado = "";
    int temp = 0;
    int C;

    public Ejercicio1(String palabra, int saltos) {

        this.palabra = palabra;
        this.saltos = saltos;
    }

    char[] abeceMinu = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    String[] palabras = new String[1];

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
                } else {

                    mayusculas();

                }
            }

        }

    }

    public String numeros() {

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

    public void mayusculas() {

        for (int k = 0; k < palabra.length(); k++) {
            for (int l = 64; l <= 90; l++) {
                C = (char) l;
                if (palabra.charAt(k) == C) {

                    resultado += "" + (char) C;

                    break;
                }
            }

        }

    }

}
