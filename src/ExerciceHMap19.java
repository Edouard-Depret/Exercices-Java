import java.util.Locale;
import java.util.Scanner;
public class ExerciceHMap19 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        System.out.println("Rentrez un nombre");
        String strOrigine=clavier.nextLine();
        char first = strOrigine.charAt(0);
        int comparaison = Character.compare(first,'-');
        boolean minus = false;

        if (comparaison == 0){
            minus = true;
            strOrigine = strOrigine.substring(1);
        }

        char ch;
        System.out.println("Mot original: "+strOrigine);
        String strReverse="";

        for (int i=0; i<strOrigine.length();i++){
            ch= strOrigine.charAt(i);
            strReverse= ch+strReverse;
        }
        String newStr="";
        char index = strReverse.charAt(0);
        while(index=='0'){
            strReverse = strReverse.substring(1);
            index=strReverse.charAt(0);
        }


        System.out.println(newStr);
        if (minus){
            strReverse = "-"+strReverse;
        }
        System.out.println("Mot inversé: "+strReverse);

    }
}

