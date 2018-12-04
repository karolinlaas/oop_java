public class TervislikBurger extends Burger {
    private String tervislikLisand1;
    private Double tervislikLisand1Hind;
    private String tervislikLisand2;
    private Double tervislikLisand2Hind;

    public TervislikBurger(String nimetus, String liha, String sai, Double hind) {
        super(nimetus, liha, sai, hind);
    }

    public void valiTervislikLisand1(String tervislikLisand1, Double tervislikLisand1Hind) {
        this.tervislikLisand1 = tervislikLisand1;
        this.tervislikLisand1Hind = tervislikLisand1Hind;
        System.out.println("Burgerile on lisatud " + this.tervislikLisand1 + ", mis maksab " + this.tervislikLisand1Hind + " eurot.");
    }

    public void valiTervislikLisand2(String tervislikLisand2, Double tervislikLisand2Hind) {
        this.tervislikLisand2 = tervislikLisand2;
        this.tervislikLisand2Hind = tervislikLisand2Hind;
        System.out.println("Burgerile on lisatud " + this.tervislikLisand2 + ", mis maksab " + this.tervislikLisand2Hind + " eurot.");
    }

    @Override
    public void koostaBurger() {
        System.out.println("Valitud on " + getNimetus() + ", mille lihaks on " + getLiha() + " ning millel on " + getSai() + ".");
        System.out.println("Burgeri hind kokku on " + (getHind() + tervislikLisand1Hind + tervislikLisand2Hind) + " eurot.");
    }
}
