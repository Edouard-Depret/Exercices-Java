import java.util.Scanner;
public class Exercice26 {

    static boolean DecouperMot(String mot, String nombre){
        return mot.substring(0,nombre.length()).equalsIgnoreCase(nombre);
    }

    public static void main(String[] args) {

        Scanner clavier=new Scanner(System.in);
        System.out.println("Entrez le premier mot");
        String premier= clavier.nextLine();
        System.out.println("Entrez le préfixe à chercher");
        String prefixe= clavier.nextLine();

        System.out.println((DecouperMot(premier,prefixe)));

    }
}
