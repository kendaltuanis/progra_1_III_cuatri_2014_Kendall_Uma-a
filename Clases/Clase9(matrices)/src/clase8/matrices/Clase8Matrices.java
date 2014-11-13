package clase8.matrices;

import java.util.Scanner;

/**
 *
 * @author Kendall
 */
public class Clase8Matrices {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio1 matriz = new Ejercicio1();
     
        matriz.introducir_numeros();
        matriz.mostrar_matriz();
        matriz.insertarFila();
        matriz.mostrar_matriz();
    }

}
