package clase8.matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    private int[][] matriz;
    private int columnas = 7;
    private int filas = 6;

    Scanner reader = new Scanner(System.in);

    public void CrearMatriz() {

        matriz = new int[filas][columnas];
    }
    /*/
     public void definir_dimension_matriz() {

     System.out.print("Introduzca el número de filas: ");
     filas = reader.nextInt();
     System.out.print("Introduzca el número de columnas: ");
     columnas = reader.nextInt();
     System.out.println("Ha creado una matriz " + filas + "x" + columnas + ".");
     }/*/

    public void introducir_numeros() {

        matriz = new int[filas][columnas];
        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {

                matriz[j][i] = 0;

            }
        }
    }
    
    public void insertarFila(){
    int j,k;
    
        System.out.println("Número de la fila (0 a "+(filas-1)+ ") donde se insertará");
        j=reader.nextInt();
        for (k = 0; k < columnas; k++) {
            System.out.println("Digite el elemento "+ (k)+ " de la fila "+ (j));
           matriz[j][k]=reader.nextInt();
        }
    
    
        
    }

    public void mostrar_matriz() {

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }

}
