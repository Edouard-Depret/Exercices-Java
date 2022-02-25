import java.util.Scanner;
public class Exercice6 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Veuillez rentrer la première valeur");
        int a=clavier.nextInt();
        System.out.println("Veuillez rentrer la deuxième valeur");
        int b=clavier.nextInt();
        System.out.printf("Vos deux valeurs sont x = %d et y = %d",a,b);

        int transition = 0;
        transition = a;
        a = b;
        b=transition;

        System.out.printf("Les deux variables x et y sont maintenant x = %d, y = %d",a, b);

    }
}
