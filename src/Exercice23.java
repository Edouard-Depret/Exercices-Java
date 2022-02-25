import java.util.ArrayList;
import java.util.Scanner;
public class Exercice23 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        ArrayList langages = new ArrayList<>();
        String input = "";

        do {
            System.out.println("Rentrez un langage de programmation");
            input = clavier.nextLine();
            langages.add(input);
        } while (!(input.equals("stop")));
        langages.remove(langages.size()-1);

        System.out.println("Voici la liste: "+langages);
        do {
            System.out.println("Voulez-vous retirer un langage de la liste? oui pour continuer, stop pour arrêter");
            input=clavier.nextLine();
            if (input.equals("oui")){
                System.out.println("Quel langage souhaitez-vous retirer de la liste?");
                input = clavier.nextLine();
                langages.remove(input);
                System.out.println("Voici la liste finale: "+langages);
            }
        } while (!(input.equals("stop")));
    }
}
