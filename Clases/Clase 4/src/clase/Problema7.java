package clase;

public class Problema7 {

    private int C;

    public Problema7(int c) {
        this.C = c;
    }

    public String PositivoNegativo() {

        String positivo = " El número es positivo";
        String negativo = " El número es negativo";

        if (C >= 0) {
            return positivo;

        } else {

            return negativo;
        }

    }

    public String parImpar() {

        String Par = " El número es par";
        String Impar = " El número es impar";

        if (C % 2 == 0) {
            return Par;

        } else {

            return Impar;
        }

    }

    public String Multi5() {

        int resto = C % 5;

        String Multiplo = " El número es múltiplo 5";
        String noMultiplo = " El número no es múltiplo de 5";

        if (resto == 0) {
            return Multiplo;

        } else {

            return noMultiplo;
        }

    }

    public String Multi10() {

        int resto = C % 10;

        String Multiplo = " El número es múltiplo 10";
        String noMultiplo = " El número no es múltiplo de 10";

        if (resto == 0) {
            return Multiplo;

        } else {

            return noMultiplo;
        }

    }

    public String mayorMenor() {

        String mayor = " El número es mayor que 100";
        String menor = " El número es menor que 100";

        if (C > 100) {
            return mayor;

        } else {

            return menor;
        }

    }

   
        
         
     
}
