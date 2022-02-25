import java.util.Arrays;
public class Exercice17 {
    public static void main(String[] args) {
        int[] tableau={1,2,3,4,5,6,7,8};
        int[] tableauInverse= new int[tableau.length];

        for (int i = 0; i<tableau.length; i++){
            tableauInverse[i]=tableau[tableau.length-1-i];
            System.out.println("Le tableau actuel possède: "+ Arrays.toString(tableauInverse));
        }


    }
}
