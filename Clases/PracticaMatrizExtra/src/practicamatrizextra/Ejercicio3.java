

package practicamatrizextra;

import java.util.Random;


public class Ejercicio3 {
    
     int[][] matrixA = new int[4][7];
     
     
     
    public void llenar() {


        for (int f = 0; f < matrixA.length; f++) {
            for (int c = 0; c < matrixA[0].length; c++) {
                matrixA[f][c] = f+c;

            }
        }

    }
    
    public void mostrar_matriz() {

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 7; i++) {
                System.out.print(matrixA[j][i] + " ");
            }
            System.out.println("");
        }
    }
     
     
     
}
