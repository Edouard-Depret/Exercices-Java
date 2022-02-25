import java.util.ArrayList;
import java.util.Scanner;
public class Exercice25 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        ArrayList email = new ArrayList<>();
        int hotmail = 0;
        int yahoo = 0;
        int gmail = 0;
        String input = "";

        do {
            System.out.println("Rentrez une adresse email (stop pour arrêter)");
            input = clavier.nextLine();
            email.add(input);
        } while (!(input.equals("stop")));
        email.remove(email.size() - 1);
        for (int i = 0; i < email.size(); i++) {
            if (email.get(i).toString().contains("hotmail")) {
                hotmail++;
            } else {
                if (email.get(i).toString().contains("yahoo")){
                    yahoo++;
                } else  {
                    if (email.get(i).toString().contains("gmail")){
                        gmail++;
                    }
                }
            }
        }

        //pourcentages email hotmail
        double hotmailPourcent = ((double)hotmail/((double)hotmail+(double)yahoo+(double)gmail));
        double gmailPourcent = ((double)gmail/((double)hotmail+(double)yahoo+(double)gmail));
        double yahooPourcent = ((double)yahoo/((double)hotmail+(double)yahoo+(double)gmail));
        System.out.println("Voici le nombre d'adresse hotmail " + hotmail);
        System.out.println("Voici le nombre d'adresse yahoo " + yahoo);
        System.out.println("Voici le nombre d'adresse gmail " + gmail);
        System.out.printf("La répartition des adresse emails est de \nHotmail: %.2f %%, \nGmail: %.2f %%\nYahoo: %.2f %%",hotmailPourcent*100,gmailPourcent*100,yahooPourcent*100);
    }
}