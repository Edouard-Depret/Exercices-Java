import java.util.Scanner;
public class TableauStatiques {
    public static void main(String[] args) {
        //int[] notes={12,16,18};
        //int scores[]=new int[8];//{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}
        //boolean valeurs[]=new boolean[3];//{false,false,false}
        //String noms[]=new String[2];//{null,null,null}
        //String names[]={"Jean","Christian","Nicolas"};

        //System.out.println("Avant maj: "+names[1]);
        //names[1]="Merwan";
        //System.out.println("Après maj : "+names[1]);
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau : ");
        int tailleDuTableau = input.nextInt();
        int[] notes = new int[tailleDuTableau];
        int total = 0;

        for (int i = 0; i < notes.length; i++) {
            System.out.printf("Note[%d] : ", i);
            notes[i] = input.nextInt();
            total= total + notes[i];
        }
        System.out.printf("Affichage du tableau \n============\n");
        for (int i = 0; i < notes.length; i++) {
            System.out.printf("Note[%d] : %d \n", i, notes[i]);
        }
        System.out.printf("La somme des éléments du tableau est %d. La moyenne des éléments du tableau est %f",total, (double)total/notes.length);
        System.out.println("Autre itération \n ======== \n");
        for (int note : notes) {//3 4 5
            System.out.println(note);
        }
    }
}
