public class LuxBurger extends Burger {
    public LuxBurger(String nimetus, String liha, String sai, Double hind) {
        super(nimetus, liha, sai, hind);
    }

    @Override
    public void koostaBurger() {
        System.out.println("Valitud on LuxBurger, mille lihaks on " + this.getLiha() + ", saiaks on " + this.getSai() + ", lisadena on juures friikartulid ja jook ning kokku maksab burger " + this.getHind() + " eurot.");
    }
}
