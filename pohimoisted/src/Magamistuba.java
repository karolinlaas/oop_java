public class Magamistuba {
    public static void main(String[] args) {
//      loome 4 seina toa ehitamiseks
        Sein sein1 = new Sein ("põhi");
        Sein sein2 = new Sein ("lõuna");
        Sein sein3 = new Sein ("ida");
        Sein sein4 = new Sein ("lääs");

        System.out.println(sein1.getSuund());
        System.out.println(sein2.getSuund());
        System.out.println(sein3.getSuund());
        System.out.println(sein4.getSuund());

        Lagi lagi = new Lagi (3.5, "soe valge");

        System.out.println("Kõrgus = " + lagi.getKorgus());
        System.out.println("Lae värv on " + lagi.getVarv());

        Voodi voodi = new Voodi ("Anna", 60, 2, 4, 1);

        voodi.voodiLoomine();

        Lamp lamp = new Lamp ("kati", true);
        lamp.lulita(); // lülita sisse
        System.out.println("Nüüd saab magada");
        lamp.lulita(); // lülita välja
    }
}
