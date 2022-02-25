import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("multiplication de");
        int multiplicationDebut = clavier.nextInt();
        System.out.println("jusqu'à");
        int multiplicationFin = clavier.nextInt();
        if (multiplicationFin < multiplicationDebut){
            int transition = multiplicationDebut;
            multiplicationDebut = multiplicationFin;
            multiplicationFin=transition;
        }
        for (int j=multiplicationDebut; j<=multiplicationFin; j++) {
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }
}
