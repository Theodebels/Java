// Ex 4 :

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Choisissez une couleur : ");
        String couleur = in.next().trim();

        if (couleur.equalsIgnoreCase("r")) {

            System.out.println("Vous avez chosis le rouge.");
        } else if (couleur.equalsIgnoreCase("v")) {
            System.out.println("Vous avez choisis le vert.");
        } else if (couleur.equalsIgnoreCase("b")) {
            System.out.println("Vous avez choisis le bleu.");
        } else if (couleur.equalsIgnoreCase("m")) {
            System.out.println("Vous avez choisi le marron.");

        } else {
            System.out.println("Connais pas.");
        }
        in.close();
    }
}
