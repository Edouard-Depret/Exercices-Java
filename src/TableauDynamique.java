import java.util.ArrayList;

public class TableauDynamique {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        System.out.println("Taille: "+fruits.size());
        fruits.add("Pommes");
        System.out.println("Taille après ajout de la pomme: "+fruits.size());
        fruits.add("Oranges");
        System.out.println("Taille après ajout des oranges: "+fruits.size());

        //Lecture

        System.out.println("Index 0: "+fruits.get(0));
        System.out.println("Index 1: "+fruits.get(1));

        //Changer la valeur d'un input

        fruits.set(1,"Ananas");
        System.out.println("Index 1 après changement: "+fruits.get(1));

        // tester si le tableau est vide

        if (fruits.isEmpty()){
            System.out.println("Le tableau est vide");
        } else {
            System.out.println("Le tableau n'est pas vide");
        }
        fruits.add("Banane");
        System.out.println("Avant suppression: "+fruits.get(2));
        // Vider le tableau
        //fruits.clear();
        fruits.remove(2);
        //System.out.println("Après suppression: "+fruits.get(2));//Out Of Bounds
    }
}
