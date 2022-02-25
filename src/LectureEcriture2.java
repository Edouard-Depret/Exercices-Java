import java.util.Scanner;
public class LectureEcriture2 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.println("Entrer la distance: ");
        int distance=clavier.nextInt();
        System.out.println("Entrer le temps ");
        int temps=clavier.nextInt();

        double vitesse = (double) distance/(double)temps;
        System.out.printf("La vitesse est de = %f km/h", vitesse);
    }
}
