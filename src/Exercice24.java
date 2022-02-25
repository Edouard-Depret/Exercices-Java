import java.util.ArrayList;
import java.util.Scanner;
public class Exercice24 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        ArrayList nombres = new ArrayList<>();
        String input = "";

        do {
            System.out.println("Rentrez un nombre (stop pour arrêter)");
            input = clavier.nextLine();
            nombres.add(input);
        } while (!(input.equals("stop")));
        nombres.remove(nombres.size()-1);

        System.out.println("Voici la liste: "+nombres);
        System.out.println("Quel nombre voulez-vous retirer?");
        input = clavier.nextLine();

        for (int i = 0; i< nombres.size();i++){
            if (input.equals(nombres.get(i))){
                nombres.remove(input);
                i--;
            }
        }

        System.out.println("Voici la liste finale: "+nombres);
    }
}