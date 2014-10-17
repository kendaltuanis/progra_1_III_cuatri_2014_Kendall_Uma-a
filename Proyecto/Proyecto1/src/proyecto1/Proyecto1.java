package proyecto1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kendall
 */
public class Proyecto1 {

    public static void main(String[] args) {
        
        Juego juego = new Juego();
        Scanner teclado = new Scanner(System.in);
        int menu;
        char continuar = ' ';
        String X = "";
        String O = "";
        

        do {

            menu = Integer.parseInt(JOptionPane.showInputDialog("1.Seleccione el nombre del primer jugador" + "\n"
                    + "2.Seleccione el nombre del segundo jugador" + "\n"
                    + "3.Iniciar juego" + "\n"
                    + "4.Estadísticas" + "\n"
                    + "5.Salir"));

            switch (menu) {

                case 1:

                    X = JOptionPane.showInputDialog("Selecciona el nombre del primer jugador");
                    break;

                case 2:

                    O = JOptionPane.showInputDialog("Selecciona el nombre del segundo jugador");
                    break;
                case 3:
                    
                    juego.CargarMatriz();

                    break;

                case 4:

                    JOptionPane.showMessageDialog(null, X);
                    JOptionPane.showMessageDialog(null, O);

                    break;

            }

            continuar = JOptionPane.showInputDialog("¿Desea continuar?").charAt(0);
        } while ((continuar == 's') || (continuar == 'S'));

    }

}
