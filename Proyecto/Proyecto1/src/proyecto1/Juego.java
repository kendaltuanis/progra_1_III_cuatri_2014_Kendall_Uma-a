package proyecto1;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Juego {

    private int[][] matriz;

    public void CrearMatriz() {

        matriz = new int[6][7];
    }

    public void CargarMatriz(int fila, int columna) {

        Scanner teclado = new Scanner(System.in);
        int hola;
        int temp1;
        int temp2;
        int temp3;
        int temp4;
        int temp5;
        
        for (int f = 0; f > 6; f++) {
            for (int c = 0; c < 7; c++) {

                matriz[f][c] = teclado.nextInt();
            }

        }

    }

    public String rendirse(int rendirse) {
        String rendido1 = "El jugador número 1 se ha rendido";
        String rendido2 = "El jugador número 2 se ha rendido";
        String numeroIncorrecto = "Has selecionado un número incorrecto";

        if (rendirse == 1) {

            return rendido1;
        }
        if (rendirse == 2) {

            return rendido2;
        } else {

            return numeroIncorrecto;
        }

    }

}
