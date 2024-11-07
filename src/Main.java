import java.util.Scanner;


public class Main {

    static Scanner readConsole = new Scanner(System.in);
    /* Scanner ger dig kontakt till konsolen, där användaren skriver.
    Används ofta med .nextLine() (i vårt fall  )  för att läsa in text som använaden skrivit. Utdata med .nextLine() är String (text).
     */

    public static void main(String[] args) {

        String antalTimmarSomString;
        Double antalTimmarSomDouble;
        Double antalsekunderSomDouble;
        Double antalMinuterSomDouble;

        System.out.println("Skriv antal timmar");
        antalTimmarSomString = readConsole.nextLine();

        antalTimmarSomDouble = Double.valueOf(antalTimmarSomString);
        antalMinuterSomDouble = antalTimmarSomDouble * 60d;
        antalsekunderSomDouble = antalMinuterSomDouble * 60d;

        System.out.println( "Antal minuter " + antalMinuterSomDouble);
        System.out.println( "Antal sekunder " + antalsekunderSomDouble);


    }
}
