import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class ExerciceHMap22 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Rentrez une phrase");
        String phraseOriginal=clavier.nextLine();
        String phraseSansEspace=phraseOriginal.replaceAll("[^a-zA-Z0-9]","");
        String phrase=phraseSansEspace.toLowerCase(Locale.ROOT);
        String newPhrase = "";
        String phraseSansDoublons="";
        HashMap<Character,Integer> occurences = new HashMap<>();
        HashMap<Character,Integer> doublons = new HashMap<>();

        for (int i=0; i<phrase.length();i++){
            char lettre=phrase.charAt(i);
            if (occurences.containsKey(lettre)){
                occurences.replace(lettre,occurences.get(lettre)+1);
            } else  {
                occurences.put(lettre,1);
                newPhrase = newPhrase+lettre;
            }

        }

        for (Character key:occurences.keySet()){
            if(occurences.get(key)>1){
                doublons.put(key,occurences.get(key));
            } else {
                if (occurences.get(key)==1){
                    phraseSansDoublons= phraseSansDoublons+key;
                }
            }
        }

        System.out.println("La chaine de départ fournie est: " + phraseOriginal);
        System.out.println("Voici la liste de tous les charactères et leurs occurences: " +occurences);
        System.out.println("Voici la phrase sans les doublons: "+newPhrase);
        System.out.println("La liste des doublons est: "+doublons);
        System.out.println("La phrase sans les doublons: "+phraseSansDoublons);
    }
}