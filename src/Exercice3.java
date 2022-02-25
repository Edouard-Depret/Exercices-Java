import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Veuillez rentrer la première valeur");
        int a=clavier.nextInt();

        System.out.println("Veuillez rentrer la deuxième valeur");
        int b=clavier.nextInt();

        System.out.println("Veuillez rentrer la troisième valeur");
        int c=clavier.nextInt();
        System.out.printf("Avant la permutation, les variables sont %d, %d et %d\n", a,b,c);
        int transition = 0;

        transition = b;
        b = a;
        a = c;
        c=transition;

        System.out.printf("Les trois variables sont maintenant %d, %d et %d", a, b, c);


    }
}
