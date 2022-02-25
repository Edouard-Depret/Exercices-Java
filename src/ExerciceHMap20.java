import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class ExerciceHMap20 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Rentrez la première phrase");
        String phraseOriginal=clavier.nextLine();
        System.out.println("Rentrez la seconde phrase");
        String phraseOriginalDeux =clavier.nextLine();

        String phraseSansEspace=phraseOriginal.replaceAll("[^a-zA-Z0-9]","");
        String phraseSansEspaceDeux=phraseOriginalDeux.replaceAll("[^a-zA-Z0-9]","");

        String phrase=phraseSansEspace.toLowerCase(Locale.ROOT);
        String phraseDeux=phraseSansEspaceDeux.toLowerCase(Locale.ROOT);

        HashMap<Character,Integer> occurences = new HashMap<>();
        HashMap<Character,Integer> occurencesDeux = new HashMap<>();

        for (int i=0; i<phrase.length();i++){
            char lettre=phrase.charAt(i);
            if (occurences.containsKey(lettre)){
                occurences.replace(lettre,occurences.get(lettre)+1);
            } else  {
                occurences.put(lettre,1);
            }
        }

        for (int i=0; i<phraseDeux.length();i++){
            char lettre=phraseDeux.charAt(i);
            if (occurencesDeux.containsKey(lettre)){
                occurencesDeux.replace(lettre,occurencesDeux.get(lettre)+1);
            } else  {
                occurencesDeux.put(lettre,1);
            }
        }
        System.out.println(occurences);
        System.out.println(occurencesDeux);
        if (occurences.equals(occurencesDeux)){
            System.out.printf("%s et %s sont des anagrammes l'un de l'autre", phraseOriginal, phraseOriginalDeux);
        } else {
            System.out.printf("%s et %s ne sont pas des anagrammes l'un de l'autre", phraseOriginal, phraseOriginalDeux);
        }
    }
}