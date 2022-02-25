import java.util.Scanner;
public class Exercice1 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        final double PI=Math.PI;
        System.out.println("Veuillez rentrer le diamètre");
        int diametre=clavier.nextInt();
        double rayon = (double)diametre/2;
        double surface = Math.pow(rayon,2)*PI;
        System.out.printf("Le rayon est de %f et la surface est de %f", rayon, surface);

    }
}
