public class Kujund {
//  tüübi omadused - klassi muutujad
    private String nimetus;
    private Double pindala;
    private Boolean nurkadeOlemasolu;
    private Integer nurkadeArv;

//  konstruktor
    public Kujund(String nimi) {
        System.out.println("Kujund klassi konstruktor");
        this.nimetus = nimi;
    }

//  setterid
    public void setNimetus(String nimi) {
        this.nimetus = nimi;
    }

    public void setNurkadeOlemasolu(Boolean nurkadeOlemasolu) {
        this.nurkadeOlemasolu = nurkadeOlemasolu;
    }

    public void setNurkadeArv(Integer nurkadeArv) {
        this.nurkadeArv = nurkadeArv;
    }

    //  tüübi tegevused - klassi meetodid
    public void arvutaPindala() {
        System.out.println("Kujund klassi arvutaPindala() meetod");
    }

    public void valjastaKirjeldus() {
        System.out.println(this.nimetus);
        this.arvutaPindala();
        System.out.println();
    }
}
