package pl.wsiz.podyplomowe.io.part1;


public class Exercise07 {

    /**

     7. Wczytaj liczbę naturalną. Rozpoczynając od wczytanej liczby wypisz, w kolejności malejącej,
        wszystkie liczby do zera.

     Podaj liczbę: 13

     13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0

     */

    public static void main(String[] args) {

        int number = 14;

        while (number >= 0) {
            System.out.printf("%d%s", number, number > 0 ? ", " : "");

            number--;
        }

//        for (; number >= 0; number--) {
//            System.out.printf("%d%s", number, number > 0 ? ", " : "");
//        }
    }
}
