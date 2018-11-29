public class Auto {
    private String nimetus;
    private Boolean mootor;
    private Integer rattad;
    private Integer voimsus;

    public Auto(String nimetus, Integer voimsus) {
        this.nimetus = nimetus;
        this.voimsus = voimsus;
        this.rattad = 4;
        this.mootor = true;
    }

    public void kaivita() {
        System.out.println("Auto käivitus.");
    }

    public void pidurda() {
        System.out.println("Auto pidurdas.");
    }

    public void kiirenda() {
        System.out.println("Auto kiirendas.");
    }

    public String getNimetus() {
        return nimetus;
    }
}
