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
        this.lisand1 = "muna";
        this.lisand2 = "tomat";
        this.lisand3 = "salat";
        this.lisand4 = "kurk";
        this.lisand1Hind = 1.0;
        this.lisand2Hind = 0.6;
        this.lisand3Hind = 0.5;
        this.lisand4Hind = 0.4;
    }

    public void valiLisand1() {
        System.out.println("Burgerile on lisatud " + this.lisand1 + ", mis maksab " + this.lisand1Hind + " eurot.");
    }

    public void valiLisand2() {
        System.out.println("Burgerile on lisatud " + this.lisand2 + ", mis maksab " + this.lisand2Hind + " eurot.");
    }

    public void valiLisand3() {
        System.out.println("Burgerile on lisatud " + this.lisand3 + ", mis maksab " + this.lisand3Hind + " eurot.");
    }

    public void valiLisand4() {
        System.out.println("Burgerile on lisatud " + this.lisand4 + ", mis maksab " + this.lisand4Hind + " eurot.");
    }

    public void koostaBurger() {
        System.out.println("Valitud on " + getNimetus() + ", mille lihaks on " + getLiha() + " ning millel on " + getSai() + ".");
        System.out.println("Lisanditena on valitud " + lisand1 + ", " + lisand2 + ", " + lisand3 + " ja " + lisand4 + ".");

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
