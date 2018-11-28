public class Voodi {
    private String nimetus;
    private Integer korgus;
    private Integer linad;
    private Integer padi;
    private Integer tekk;

    public Voodi(String nimetus, Integer korgus, Integer linad, Integer padi, Integer tekk) {
        this.nimetus = nimetus;
        this.korgus = korgus;
        this.linad = linad;
        this.padi = padi;
        this.tekk = tekk;
    }

    public String getNimetus() {
        return nimetus;
    }

    public Integer getKorgus() {
        return korgus;
    }

    public Integer getLinad() {
        return linad;
    }

    public Integer getPadi() {
        return padi;
    }

    public Integer getTekk() {
        return tekk;
    }

    public void voodiLoomine() {
        System.out.println("Voodi on valmis");
    }
}
