import java.util.ArrayList;
import java.util.Arrays;
public class Exercice31 {

    static ArrayList decouper(int[] tableau, int taille){
        ArrayList decoupe = new ArrayList<>();
        if(taille>tableau.length){
            taille=tableau.length;
        }
        for (int i=0; i<tableau.length;i+=taille){
            if (i+taille>tableau.length){
                decoupe.add(Arrays.copyOfRange(tableau, i, tableau.length));
            } else  {

            decoupe.add(Arrays.copyOfRange(tableau, i, tableau[taille]));
            }
        }
        return decoupe;

    }

    public static void main(String[] args) {
        int taille = 2;
        int[] tableau = {1,2,3,4,5};

        System.out.println(decouper(tableau,taille));
    }
}
