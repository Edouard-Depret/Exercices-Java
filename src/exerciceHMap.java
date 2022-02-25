import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;

public class exerciceHMap {
    public static void main(String[] args) {
        String phraseOriginal="When I am Myself, i am hAppy and have a goOd Result";
        String phraseSansEspace=phraseOriginal.replaceAll("[^a-zA-Z0-9]","");
        String phrase=phraseSansEspace.toLowerCase(Locale.ROOT);
        HashMap<Character,Integer> occurences = new HashMap<>();

        for (int i=0; i<phrase.length();i++){
            char lettre=phrase.charAt(i);
            if (occurences.containsKey(lettre)){
                occurences.replace(lettre,occurences.get(lettre)+1);
            } else  {
                occurences.put(lettre,1);
            }

        }
        int max = 0;
        Character key_max=Character.MIN_VALUE;
        for (Character key:occurences.keySet()){
            if (occurences.get(key) >= max){
                max = occurences.get(key);
                key_max = key;
            }
        }
        System.out.println(occurences);
        System.out.println(max);
        System.out.println(key_max);

        System.out.println("La lettre qui se voit le plus dans la phrase est le "+ key_max +" et apparait "+ max + " fois.");
    }
}
