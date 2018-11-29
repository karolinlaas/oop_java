public class Autod {
    public static void main(String[] args) {
        Auto auto = new Auto("mingi auto", 40);
        auto.kaivita();
        auto.kiirenda();
        auto.pidurda();

        Toyota avensis = new Toyota("Avensis", 108);
        avensis.kaivita();
        avensis.kiirenda();
        avensis.pidurda();

        Toyota aygo = new Toyota("AYGO", 53);
        aygo.kaivita();
        aygo.kiirenda();
        aygo.pidurda();
    }
}
