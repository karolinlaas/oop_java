public class Toyota extends Auto {
    public Toyota(String nimetus, Integer voimsus) {
        super(nimetus, voimsus);
    }

    @Override
    public void pidurda() {
        System.out.println(getClass().getSimpleName() + " " + this.getNimetus() + " pidurdas");
    }

    public void kiirenda() {
        System.out.println(getClass().getSimpleName() + " " + this.getNimetus() + " kiirendas");
    }

    public void kaivita() {
        System.out.println(getClass().getSimpleName() + " " + this.getNimetus() + " käivitus");
    }
}
