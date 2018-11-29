public class Printer {
    private Integer tooneriTase;
    private Integer paberiArv;
    private Boolean kahepoolne;

    public Printer(Integer tooneriTase, Boolean kahepoolne) {
        this.tooneriTase = tooneriTase;
        this.kahepoolne = kahepoolne;
        this.paberiArv = 100;
    }

    public Integer getTooneriTase() {
        return tooneriTase;
    }

    public Integer lisaTooner(Integer toonerJuurde) {
        if (this.tooneriTase >= 0 & this.tooneriTase <= 100) {
            if (this.tooneriTase + toonerJuurde > 100) {
                return -1;
            }
            this.tooneriTase = this.tooneriTase + toonerJuurde;
            return this.tooneriTase;
        } else {
            return -1;
        }
    }
}
