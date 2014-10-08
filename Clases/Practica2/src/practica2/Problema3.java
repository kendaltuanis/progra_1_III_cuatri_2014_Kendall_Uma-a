package practica2;

public class Problema3 {

    public String Revisado(char i) {

        if ((i == 'a') || (i == 'A')) {

            return "Excelente";
        } else {
            if ((i == 'B') || (i == 'b')) {

                return "Bueno";
            } else {
                if ((i == 'c') || (i == 'C')) {

                    return "Regular";
                } else {

                    if ((i == 'd') || (i == 'D')) {

                        return "Malo";
                    }
                    if ((i == 'e') || (i == 'E')) {

                        return "Pésimo";
                    } else {

                        return "Error";
                    }

                }

            }

        }
    }

}
