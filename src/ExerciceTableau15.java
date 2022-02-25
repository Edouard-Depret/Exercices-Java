import java.util.Scanner;
public class ExerciceTableau15 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Quelle taille fait le premier tableau? 1/3");
        int n = clavier.nextInt();
        int total = 0;
        int[] tableauUn = new int[n];
        for (int i = 0; i < tableauUn.length; i++) {
            System.out.printf("Rentrez valeur index %d \n", i);
            tableauUn[i]=clavier.nextInt();
            if(tableauUn[i]%3==0){
                total += tableauUn[i];
            }
        }

        System.out.println("Quelle taille fait le deuxième tableau? 2/3");
        n = clavier.nextInt();
        int[] tableauDeux = new int[n];
        for (int i = 0; i < tableauDeux.length; i++) {
            System.out.printf("Rentrez valeur index %d \n", i);
            tableauDeux[i]=clavier.nextInt();
            if(tableauDeux[i]%3==0){
                total += tableauDeux[i];
            }
        }

        System.out.println("Quelle taille fait le troisième tableau? 3/3");
        n = clavier.nextInt();
        int[] tableauTrois = new int[n];
        for (int i = 0; i < tableauTrois.length; i++) {
            System.out.printf("Rentrez valeur index %d \n", i);
            tableauTrois[i]=clavier.nextInt();
            if(tableauTrois[i]%3==0){
                total += tableauTrois[i];
            }
        }
        System.out.println("La somme des multiples de trois est: "+ total);
    }
}
