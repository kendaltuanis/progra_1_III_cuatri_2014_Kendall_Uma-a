
package clase12.lista;


public class Clase12Lista {

    
    public static void main(String[] args) {
        
            
        NodoDeLista nodoDeLista1 = new NodoDeLista();
        
        nodoDeLista1.setMatricula("01");
        nodoDeLista1.setDueno("Efrén Jiménez");
        nodoDeLista1.setMarca("Toyota");
        
        NodoDeLista nodoDeLista2 = new NodoDeLista();
        
        nodoDeLista2.setMatricula("02");
        nodoDeLista2.setDueno("Marito Mortadela");
        nodoDeLista2.setMarca("Vaca");
        
        Lista lista = new Lista();
        lista.Insertar(nodoDeLista1);
        lista.Insertar(nodoDeLista2);
        
        lista.Imprimir();
    }
    
}
