package proyecto;

public class Ejercicio2 {

    public String dinero(int cantidad) {

        int[] billeMo = {5000, 2000, 1000, 500, 100, 50, 25};
        String[] billeMoLetras = {"Billete de cincomil", "Billete de dosmil ", "Billete de mil", "Moneda de quinientos", "moneda de cien", "moneda de cincuenta", "moneda de veinticinco"};

        String resultado = "";
        int cont = 0;

        for (int j = cantidad; cantidad > 0; j++) {

            for (int i = 0; i < billeMo.length; i++) {

                cont = cantidad / billeMo[i]; 
                if(cantidad>0 && cont>0)
                {
                              
                resultado +=  cont+"-" + billeMoLetras[i]+"\n";
                cantidad = cantidad - ((billeMo[i]*cont));

                }
                
                if(cantidad<25)
                {
                    cantidad=0;
                }

            }

        }

        return resultado;

    }

}
