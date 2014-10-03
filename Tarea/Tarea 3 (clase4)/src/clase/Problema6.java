package clase;

public class Problema6 {

    public Problema6() {
    }

    public String positivoNegativo(int b) {

        String positivo = " El número es positivo";
        String negativo = " El número es negativo";

        if (b >= 0) {
            return positivo;
        } else {
            return negativo;

        }
    }
}
