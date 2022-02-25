import java.util.Scanner;
public class Exercice5 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.println("Rentrez la première variable, a");
        int a = clavier.nextInt();
        System.out.println("Rentrez la deuxième variable, b");
        int b = clavier.nextInt();
        System.out.println("Rentrez la troisième variable, c");
        int c = clavier.nextInt();
        System.out.println("Rentrez la quatrième variable, x");
        double x = clavier.nextDouble();

        double formule=((((double)a+(double)b)/2)*(Math.pow(x,3))) + (Math.pow((a+b),2)*Math.pow(x,2))+a+b+c;

        System.out.printf("La réponse est %f",formule);
    }
}
