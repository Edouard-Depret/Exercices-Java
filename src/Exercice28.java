import java.util.ArrayList;
import java.util.Locale;

public class Exercice28 {

    static ArrayList alternerMajEtMin(ArrayList<Character> alphabet){

        for (int i = 0; i<alphabet.size();i++){
            alphabet.get(i);
            alphabet.set(i,Character.toUpperCase(alphabet.get(i)));
            if (i==0){
                alphabet.set(i,Character.toLowerCase(alphabet.get(i)));
            } else  {
                if (i%2 == 0){
                    alphabet.set(i,Character.toLowerCase(alphabet.get(i)));
                }
            }
        }
        return alphabet;
    }

    public static void main(String[] args) {
        Character[] alphabet = {'a','b','c','d','e','f','g','h'};
        ArrayList<Character> tableau= new ArrayList<>();
        for (Character c : alphabet){
            tableau.add(c);
        }

        System.out.println(alternerMajEtMin(tableau));
    }
}
