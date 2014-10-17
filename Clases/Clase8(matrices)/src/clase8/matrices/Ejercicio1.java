package clase8.matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    private int[][] matriz;

    public void CrearMatriz(int fila, int columnas) {

        matriz = new int[fila][columnas];

    }

    public void CargarMatriz() {

        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = teclado.nextInt();

            }

        }
    }

    public String Imprimir() {

        String impresion = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                impresion += matriz[i][j]+ " ";

            }
            impresion += "\n";

        }
        return impresion;
    }

}
