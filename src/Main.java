import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }

        private static void ukol1() {
            System.out.println("Hello world!");
        }

        private static void ukol2() {
            String uzivatel = "Karel";
            System.out.println(uzivatel);
        }

        private static void ukol3() {
            int pocetLekci = 10;
            System.out.println(pocetLekci);
        }

        private static void ukol4() {
            double cena = 10.0;
            System.out.println(cena);
        }

        private static void ukol5() {
            double cena = 0;
            for (int i = 0; i < 10; i++)
                cena += 0.1;
            System.out.println(cena);
        }

        private static void ukol6() {
            BigDecimal cena = BigDecimal.ZERO;
            cena = cena.add(BigDecimal.valueOf(0.1));
            System.out.println(cena);
        }

        private static void ukol7() {
            int vykonMotoru = 120;
            System.out.println("výkon Motoru je: " + vykonMotoru + " kW.");
        }

        private static void ukol8() {
            int velikostKosile = 37;
            System.out.println("Velikost košile je: " + velikostKosile);
        }

        private static void ukol9() {
            System.out.println("Metoda *skoro* bez chybičky!");}


}
