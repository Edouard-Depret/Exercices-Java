import java.util.ArrayList;
import java.util.Locale;

public class Exercice29 {

    static ArrayList seDeplacer(ArrayList<String> mouvement) {
        ArrayList<Integer> position = new ArrayList<>();
        int x = 0;
        int y = 0;

        for (int i = 0; i < mouvement.size(); i++) {
            if (mouvement.get(i).equals("haut")) {
                y++;
            } else {
                if (mouvement.get(i).equals("bas")) {
                    y--;
                } else {
                    if (mouvement.get(i).equals("droite")) {
                        x++;
                    } else {
                        if (mouvement.get(i).equals("gauche")) {
                            x--;
                        }
                    }
                }
            }
        }
        position.add(x);
        position.add(y);
        return position;
    }

    public static void main(String[] args) {
        String[] mouvement = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        ArrayList<String> tableau= new ArrayList<>();
        for (String c : mouvement){
            tableau.add(c);
        }
        System.out.println(seDeplacer(tableau));
    }
}
