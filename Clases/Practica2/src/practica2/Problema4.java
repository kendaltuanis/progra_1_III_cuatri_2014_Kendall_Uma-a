package practica2;

public class Problema4 {

    private int year;

    public boolean hola(int year) {
        this.year = year;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return false;
        } else {
            return true;

        }

    }

    public void setYear(int year) {
        this.year = year;
    }

    public String mes(int i) {

        if (hola(year) == true) {

            if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12)) {
                return "Tiene 31 días";
            } else {
                if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {

                    return "Tiene 30 días";
                } else {

                    if ((i == 2)) {

                        return " Tiene 28 días";

                    } else {

                        return " Número incorrecto";
                    }
                }

            }

        } else {

            if (hola(year) == false) {
                if ((i == 1) || (i == 3) || (i == 5) || (i == 7) || (i == 8) || (i == 10) || (i == 12)) {
                    return "Tiene 31 días";
                } else {
                    if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {

                        return "Tiene 30 días";
                    } else {
                        if ((i == 2)) {

                            return " Tiene 29 días";

                        } else {
                            return " Número incorrecto";
                        }

                    }

                }

            } else {
                return "Número incorrecto";
            }
        }

    }

}
