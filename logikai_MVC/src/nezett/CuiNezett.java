package nezett;

import java.util.Scanner;

public class CuiNezett {

    private static final Scanner sc = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();

    private void konzolraIr(String szoveg) {
        System.out.println(szoveg);
    }

    public void leirasMegjelenito(String szoveg) {
        konzolraIr(szoveg + SEP);
    }

    public void feladatMegjelenito(String szoveg) {
        konzolraIr(szoveg);
    }

    public void valasztas(String szoveg) {
        leirasMegjelenito(szoveg + SEP);
        sc.nextInt();
    }

}
