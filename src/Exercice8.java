import java.util.Scanner;
public class Exercice8 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.println("Rentrez la première variable, a");
        int a = clavier.nextInt();
        System.out.println("Rentrez la deuxième variable, b");
        int b = clavier.nextInt();
        System.out.println("Rentrez la troisième variable, c");
        int c = clavier.nextInt();

        double delta = (Math.pow(b,2)) - (4*a*c);

        System.out.printf("Delta est %f\n",delta);

        if (delta<0){
            System.out.printf("La formule est donc de %dx² + %dx + %d. Il n'y a pas de solution réelle",a,b,c);
        }
        else {
            if(delta>0){
                double premierNombre = (-(double)b-Math.sqrt(delta))/(2*(double)a);
                double deuxiemeNombre = (-(double)b+Math.sqrt(delta))/(2*(double)a);
                System.out.printf("La formule est donc de %dx² + %dx + %d. Il y a deux intersections et elles sont à x = %f et x= %f",a,b,c, premierNombre, deuxiemeNombre);
            } else {
                double troisiemeNombre = -((double)b/2*(double)a);
                System.out.printf("La formule est donc de %dx² + %dx + %d. Il n'y a qu'une intersection, et elle est à x = %f",a,b,c,troisiemeNombre);
            }
            }
        }
    }
