public class Lamp {
    private String nimetus;
    private Boolean patarei;
    private Boolean valgustus = false;

    public Lamp(String nimetus, Boolean patarei) {
        this.nimetus = nimetus;
        this.patarei = patarei;
        this.valgustus = valgustus;
    }

    public String getNimetus() {
        return nimetus;
    }

    public Boolean getPatarei() {
        return patarei;
    }

    public Boolean getValgustus() {
        return valgustus;
    }

    public void lulita() {
        if (valgustus == false) {
            valgustus = true;
            System.out.println("Lamp on sisse lülitatud");
        }
        else {
            valgustus = false;
            System.out.println("Lamp on välja lülitatud");
        }
    }
}