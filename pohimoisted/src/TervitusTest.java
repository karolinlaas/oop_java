public class TervitusTest {
    public static void main(String[] args) {
        Tervitus karolinTervitus = new Tervitus("Tere, õpilased!");
        Tervitus vaikneTervitus = new Tervitus();
        karolinTervitus.tervita();
        vaikneTervitus.tervita();
    }
}
