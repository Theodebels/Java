
import java.util.Random;

public class app {

    public static void main(String[] args) {
        Random generateur = new Random();

        final int MAX = 100;
        int MIN = 50;
        int nbrpartie = 1;
        double essaitot = 0;

        int nbr = generateur.nextInt(MAX);
        for (int i = 1; i < 10000; i++) {
            int usernbr = generateur.nextInt(MAX);
            int nbressai = 1;
            while (usernbr != nbr) {
                nbressai++;
                essaitot += nbressai;
                usernbr = generateur.nextInt(MAX);

                if (nbr > MIN) {

                }
            }
            nbrpartie++;
        }
        result(essaitot, nbrpartie);
    }

    public static void result(double essaitot, int nbrpartie) {
        double moyenne = (double) ((int) (essaitot / nbrpartie * 100)) / 10000;
        System.out.println("En moyenne sur " + nbrpartie + " parties, il m'a fallu "
                + moyenne + " tentatives.");
    }

}
