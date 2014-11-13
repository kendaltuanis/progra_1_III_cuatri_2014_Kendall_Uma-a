package practica2;

public class Problema1 {

    public String Meses(int A) {

        String En = "Enero", Feb = "Febrero", Mar = "Marzo", Ab = "Abril", May = "Mayo", Jun = "Junio", Jul="Julio",Ago="Agosto",Set="Setiembre", Oct="Octubre", Nov="Noviembre", Dic="Diciembre"; 
        

        if (A == 1) {
            return En;
        }
        if (A == 2) {
            return Feb;

        }
        if (A == 3) {
            return Mar;

        }
        if (A == 4) {
            return Ab;

        }
        if (A == 5) {
            return May;

        }
        if (A == 6) {
            return Jun;

        }
        if (A == 7) {
            return Jul;

        }
        if (A == 8) {
            return Ago;

        }
        if (A == 9) {
            return Set;

        }
        if (A == 10) {
            return Oct;

        }
        if (A == 11) {
            return Nov;

        } else {
            return Dic;
        }
    }

}
