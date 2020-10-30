import java.util.Random;

public class Kort<hej> {


    /**
     * nödvändiga klassvriabler
     */
    //klassvariabler
    public static final int klöver = 0;
    public static final int ruter = 1;
    public static final int hjärter = 2;
    public static final int spader = 3;

    public static final int Knäckt = 11;
    public static final int Dam = 12;
    public static final int Kung = 13;


    public static final String[] valörer = {null,"1", "2","3","4","5","6","7","8","9","10",
                                    "Knäckt","Dam","Kung","Ace"};
    public static final String[] färger = {"Klöver", "Ruter", "Hjärter", "Spader"};

    /**
     * En klassmetod som slumpar fram ett kort
     * @return ett kort
     */
   public static Kort getRandomCard() {
       Kort c = new Kort();

       c.färg = (int) (Math.random() * 4); // Färg
       c.valör = (int) (Math.random() * 13) + 1;  // Valör

       return c;
   }

    /**
     * För utskrift
     * @param
     */
    //Utskrift
    public static void utskrift(Kort abcd) {
                System.out.println(Kort.färger[abcd.färg] + " " + Kort.valörer[abcd.valör]);

    }




    //instansvariabler
    int färg;
    int valör;

}
