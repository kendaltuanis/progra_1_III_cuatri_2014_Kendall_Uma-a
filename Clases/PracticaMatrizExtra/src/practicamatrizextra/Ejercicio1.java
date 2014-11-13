package practicamatrizextra;

import java.util.Random;

public class Ejercicio1 {

    int[][] matrixA = new int[0][0];

    public void iniciarMatriz(int filas, int columnas) {

        matrixA = new int[columnas][columnas];
    }

    public void llenar() {

        Random random = new Random();

        for (int f = 0; f < matrixA.length; f++) {
            for (int c = 0; c < matrixA[0].length; c++) {
                matrixA[f][c] = (int) (random.nextInt() * 1 + 15);

            }
        }

    }

    public String impresionPorFila() {
        String temp = "";

        for (int f = 0; f < matrixA.length; f++) {
            for (int c = 0; c < matrixA[0].length; c++) {
                temp += String.valueOf(matrixA[f][c])+"-";

            }
            temp+="\n";
        }
        return temp;
    }

    public String impresionTriangularSuperior() {
        String temp = "";
        
        for (int f = 1; f < matrixA.length; f++) {
            for (int c = 1; c < f; c++) {
                temp += String.valueOf(matrixA[f][c])+"-";

            }
             temp+="\n";
          
        }
        return temp;
    }
    
     public String impresionTriangularInferior() {
        String temp = "";
        
        for (int f = matrixA.length-2; f >=0; f--) {
            for (int c = matrixA[0].length-f; c > 0; c--) {
                temp += String.valueOf(matrixA[f][c])+"-";

            }
             temp+="\n";
          
        }
        return temp;
    }

}
