import java.util.Scanner;
public class Exercice2 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.println("Veuillez rentrer votre prénom");
        String prenom=clavier.nextLine();
        System.out.println("Veuillez rentrer votre nom");
        String nom=clavier.nextLine();
        System.out.println("Veuillez rentrer votre age");
        int age=clavier.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans.",prenom, nom, age);

    }
}
