import java.util.Scanner;
public class Exercice11 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Rentrez un chiffre");
        int a = clavier.nextInt();
        int fact = 1;
        if (a==0){
            System.out.println("0! = 1");
        } else {

            for (int i = 1; i <= a; i++) {
                fact = fact * i;
            }
            System.out.printf("%d! = %d", a, fact);
        }
    }
}