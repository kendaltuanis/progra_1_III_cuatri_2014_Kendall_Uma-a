package Main;





import java.util.Random;
import java.util.Scanner;
import Ejercicio2.ListaCuadrado;
import Ejercicio2.NodoCuadrado;
import Ejercicio3.ListaNegativo;
import Ejercicio3.NodoNegativo;


public class TareaListas {

 
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
     
        ListaNumeros oListaNumeros = new ListaNumeros();
        for (int i = 0; i < 10; i++) {
            
               System.out.println("Digite el número "+ (i+1));
               NodoNumero numero = new NodoNumero();
               numero.setNumero(teclado.nextInt());
               oListaNumeros.Insertar(numero);
     
        }
        
        oListaNumeros.DividirLista();
        System.out.println(oListaNumeros.imprimir());
        
        
        ListaCuadrado cuadrado = new ListaCuadrado();
        
        Random random = new Random();
        int numero = random.nextInt(3)*200;
        /*   
        for (int i = 0; i < numero; i++) {
            NodoCuadrado nodoCuadrado = new NodoCuadrado();
            nodoCuadrado.setNumero(random.nextInt(10)*20);
            cuadrado.Insertar(nodoCuadrado);
            
        }
        System.out.println(cuadrado.ImpresionCuadrado());
        
        /*/
        ListaNegativo listanegativo = new ListaNegativo();
         for (int i = 0; i < numero; i++) {
             NodoNegativo negativo = new NodoNegativo();
           negativo.setNegativo(random.nextInt(10)*-20);
           listanegativo.Insertar(negativo);
            
        }
         listanegativo.Validar();
        
        
    }
    
}
