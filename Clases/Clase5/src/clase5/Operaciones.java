package clase5;

public class Operaciones {

    public double Sumar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double Resta(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double Multiplicacion(double valor1, double valor2) {
        return valor1 * valor2;

    }

    public double Division(double valor1, double valor2) {

        if (valor2 == 0) {
            return 0;
        } else {
            return valor1 / valor2;
        }
    }

    public double Raiz(double valor1) {

        return Math.sqrt(valor1);
    }

    public double Potencia(double valor1, double valor2) {

        return Math.pow(valor1, valor2);
    }

}
