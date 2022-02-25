import java.util.Scanner;
public class Exercice4 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Quel âge as-tu?");
        int age = clavier.nextInt();
        int annee= 2022-age;
        System.out.printf("Vous êtes né en %d", annee);
    }
}
