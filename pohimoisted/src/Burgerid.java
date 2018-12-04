public class Burgerid {
    public static void main(String[] args) {
        Burger burger1 = new Burger("Klassikaline burger", "sealiha", "nisujahust kukkel", 5.0);

        burger1.valiLisand1("muna", 1.0);
        burger1.valiLisand2("tomat", 0.6);
        burger1.valiLisand3("salat", 0.5);
        burger1.valiLisand4("kurk", 0.4);

        burger1.koostaBurger();

        TervislikBurger burger2 = new TervislikBurger("Tervislik burger", "kanaliha", "mustast teraleivast kukkel", 7.0);

        burger2.valiTervislikLisand1("vegan juust", 1.0);
        burger2.valiTervislikLisand2("sibul", 0.7);

        burger2.koostaBurger();

        LuxBurger burger3 = new LuxBurger("LuxBurger", "sealiha", "nisujahust kukkel", 10.00);

        burger3.koostaBurger();
    }
}
