import java.util.Scanner;
public class Exercice7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Rentrez un nombre");
        int a = clavier.nextInt();
        if (a == 0) {
            System.out.println("Le nombre choisi est zéro et il est pair");
        } else {
            if (a < 0) {
                if (a % 2 == 0) {
                    System.out.printf("Votre nombre est %d et il est pair et négatif",a);
                } else {
                    System.out.printf("Votre nombre est %d et il est impair et négatif",a);
                }
            } else {
                if (a % 2 == 0) {
                    System.out.printf("Votre nombre est %d et il est pair et positif",a);
                } else {
                    System.out.printf("Votre nombre est %d et il est impair et positif",a);
                }
            }
        }


    }
}