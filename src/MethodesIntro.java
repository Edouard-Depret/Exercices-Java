import java.util.ArrayList;

public class MethodesIntro {
    static int calculerSomme(int nombre1,int nombre2){
        int somme=nombre1+nombre2;
        return somme;
    }

    static void eleverAuCarre(int nombre){
        nombre=nombre*nombre;
        System.out.println(nombre);
    }

    static void ajouterFruit(String nomFruit, ArrayList<String> fruits){
        fruits.add(nomFruit);
    }

    static double multiply(double nombre) {
        return nombre*nombre;
    }

    static double multiply(double nombre, double nombre2) {
        return nombre*nombre2;
    }

    public static void main(String[] args) {
        int nombre1=8;
        int nombre2=9;
        int somme=calculerSomme(nombre1,nombre2);
        System.out.printf("%d + %d = %d\n",nombre1,nombre2,somme);

        int nombre=9;
        eleverAuCarre(nombre);
        System.out.println(nombre);

        ArrayList<String> f=new ArrayList<>();
        f.add("pommes");
        f.add("mangues");
        System.out.println("Tableau avant l'appel de la méthode ajouterFruit() : "+f);
        ajouterFruit("ananas",f);
        System.out.println("Tableau après l'appel de la méthode ajouterFruit() : "+f);

        System.out.println("Avec un seul argument: "+multiply(7));
        System.out.println("Avec deux argument: "+multiply(7,3));
    }

}
