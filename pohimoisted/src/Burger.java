public class Burger {
    private String nimetus;
    private String liha;
    private String sai;
    private Double hind;
    private String lisand1;
    private Double lisand1Hind;
    private String lisand2;
    private Double lisand2Hind;
    private String lisand3;
    private Double lisand3Hind;
    private String lisand4;
    private Double lisand4Hind;

    public Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
    }

    public void valiLisand1(String lisand1, Double lisand1Hind) {
        this.lisand1 = lisand1;
        this.lisand1Hind = lisand1Hind;
        System.out.println("Burgerile on lisatud " + this.lisand1 + ", mis maksab " + this.lisand1Hind + " eurot.");
    }

    public void valiLisand2(String lisand2, Double lisand2Hind) {
        this.lisand2 = lisand2;
        this.lisand2Hind = lisand2Hind;
        System.out.println("Burgerile on lisatud " + this.lisand2 + ", mis maksab " + this.lisand2Hind + " eurot.");
    }

    public void valiLisand3(String lisand3, Double lisand3Hind) {
        this.lisand3 = lisand3;
        this.lisand3Hind = lisand3Hind;
        System.out.println("Burgerile on lisatud " + this.lisand3 + ", mis maksab " + this.lisand3Hind + " eurot.");
    }

    public void valiLisand4(String lisand4, Double lisand4Hind) {
        this.lisand4 = lisand4;
        this.lisand4Hind = lisand4Hind;
        System.out.println("Burgerile on lisatud " + this.lisand4 + ", mis maksab " + this.lisand4Hind + " eurot.");
    }

    public void koostaBurger() {
        System.out.println("Valitud on " + getNimetus() + ", mille lihaks on " + getLiha() + " ning millel on " + getSai() + ".");

        System.out.println("Burgeri hind kokku on " + (hind + lisand1Hind + lisand2Hind + lisand3Hind + lisand4Hind) + " eurot.");
    }

    public String getNimetus() {
        return nimetus;
    }

    public String getLiha() {
        return liha;
    }

    public String getSai() {
        return sai;
    }

    public Double getHind() {
        return hind;
    }
}
