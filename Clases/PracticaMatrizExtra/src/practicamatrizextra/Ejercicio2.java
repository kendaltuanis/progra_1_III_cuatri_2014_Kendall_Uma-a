package practicamatrizextra;

import java.util.Random;

public class Ejercicio2 {

    int[][] matrixA = new int[0][0];

    public void iniciarMatriz(int filas, int columnas) {

        matrixA = new int[columnas][columnas];
    }

    public void llenar() {

        Random random = new Random();

        for (int f = 0; f < matrixA.length; f++) {
            for (int c = 0; c < matrixA[0].length; c++) {
                matrixA[f][c] = (random.nextInt() * 1 + 15);

            }
        }

    }

    public boolean diagonalSuperior() {

        boolean validar = false;

        for (int f = 1; f < matrixA.length; f++) {
            for (int c = 1; c < f; c++) {
                if (matrixA[f][c] == 0) {
                    validar = true;
                }
                
                else{
                    validar=false;
                    break;
                }

            }

        }
        return validar;
    }

}
