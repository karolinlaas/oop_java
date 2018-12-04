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

    public void valiLisand1(String lisand1, Double lisand1Hind) {
        System.out.println("Burgerile on lisatud " + this.lisand1);
    }

    public void valiLisand2(String lisand2, Double lisand2Hind) {
        System.out.println("Burgerile on lisatud " + this.lisand2);
    }

    public void valiLisand3(String lisand3, Double lisand3Hind) {
        System.out.println("Burgerile on lisatud " + this.lisand3);
    }

    public void valiLisand4(String lisand4, Double lisand4Hind) {
        System.out.println("Burgerile on lisatud " + this.lisand4);
    }

    public void koostaBurger() {

    }
}
