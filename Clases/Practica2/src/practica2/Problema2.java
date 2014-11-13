package practica2;

public class Problema2 {



    public int nose(int i) {

        if ((i % 10 == 2) || (i % 10 == 5) || (i % 10 == 8)) {

            return i * i;
        } else {
            if ((i % 10 == 4) || (i % 10 == 7) || (i % 10 == 9)) {
                return i * 5;
            } else {

                return i;
            }

        }

    }

}
