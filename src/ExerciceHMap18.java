import java.util.Locale;
import java.util.Scanner;
public class ExerciceHMap18 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Rentrez un mot");
        String strOrigine=clavier.nextLine();
        String str = strOrigine.toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
        char ch;
        System.out.println("Mot original: "+strOrigine);
        System.out.println("Mot sans espaces ni majuscules: "+str);
        String strReverse="";

        for (int i=0; i<str.length();i++){
            ch= str.charAt(i);
            strReverse= ch+strReverse;
        }

        System.out.println("Mot inversé: "+strReverse);

        if (str.equals(strReverse)){
            System.out.printf("La phrase %s est un palindrome",strOrigine);
        } else  {
            System.out.printf("La phrase %s n'est pas un palindrome",strOrigine);
        }
    }
}