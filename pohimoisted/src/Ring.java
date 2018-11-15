public class Ring {
    public Double raadius;
    public Double x;
    public Double y;

    public Ring() {
        this.raadius = 0.0;
    }

    public Ring(Double r) {
        this.raadius = r;
    }

    public void pindala() {
        Double ringiPindala = Math.PI * Math.pow(raadius, 2);
        System.out.println("Antud ringi pindala on " + Math.round(ringiPindala * 100) / 100.0);
    }
}
