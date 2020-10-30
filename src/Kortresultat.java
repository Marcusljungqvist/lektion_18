import java.util.Random;

public class Kortresultat {

    public static void main(String[] args) {

        Kort kort1 = new Kort();
        Kort kort2  = new Kort();



        kort1.färg = Kort.spader;
        kort1.valör = Kort.Dam;

        kort2.färg = Kort.klöver;
        kort2.valör = 7;

        System.out.println("---- Kort 1 ----");
        Kort.utskrift(kort1);
        System.out.println("---- Kort 2 ----");
        Kort.utskrift(kort2);

        System.out.println("---- Slumpade kort ----");
        for (int i = 0; i <10 ; i++) {
            Kort kort3 = Kort.getRandomCard();
            Kort.utskrift(kort3);
        }

    }
}
