public class Kujundid {
    public static void main(String[] args) {
        Kujund ring = new Kujund("Ring");
        Kujund ruut = new Kujund("Ruut");
        Kujund kolmnurk = new Kujund("Kolmnurk");

        ring.valjastaKirjeldus();

/*      Need read ei tööta, kuna nimetus on privaatne omadus
        ring.nimetus = "Ruut";
         ring.valjastaKirjeldus(); */

        ring.setNimetus("Ruut");
        ring.valjastaKirjeldus();

        ruut.valjastaKirjeldus();
        kolmnurk.valjastaKirjeldus();
    }
}