public class PrinteriTest {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, true);
        printer1.lisaTooner(15);
        System.out.println("Printeri tooneri tase on " + printer1.getTooneriTase() + "%");

        Integer kontrolltoo = printer1.prindi(5);
        System.out.println("Printisin kontrolltöö jaoks " + kontrolltoo + " lehte ja printesrisse on jäänud " + printer1.getPaberiArv() + " paberit.");
    }
}
