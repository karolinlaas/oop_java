public class Punkt {
//  omadused
    private String nimetus;
    private Double x;
    private Double y;
    private Integer veerand;

//  constructor
    public Punkt(String nimetus, Double x, Double y) {
        this.nimetus = nimetus;
        this.x = x;
        this.y = y;
        this.setVeerand();
    }

    //  setter:
    public void setVeerand() {
        if(this.x > 0 & this.y > 0) this.veerand = 1;
        else if(this.x > 0 & this.y < 0) this.veerand = 2;
        else if(this.x < 0 & this.y < 0) this.veerand = 3;
        else if(this.x < 0 & this.y > 0) this.veerand = 4;
        else this.veerand = 0;
    }

    public void valjastaKirjeldus() {
        System.out.println("Punkt " + this.nimetus + " koordinaatidega (" + this.x + "; " + this.y + ") asub " + this.veerand + ". veerandis.");
    }

}
