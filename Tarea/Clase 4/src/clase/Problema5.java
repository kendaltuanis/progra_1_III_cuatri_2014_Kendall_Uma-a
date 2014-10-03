package clase;

public class Problema5 {

    public Problema5() {
    }

    public String parImpar(int A) {

        String par = "El número es par";
        String impar = "El número es impar";

        if (A % 2 == 0) {
            return par;
        } else {
            return impar;
        }
    }

}
