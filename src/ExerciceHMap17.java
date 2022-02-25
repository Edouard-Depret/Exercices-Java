import java.util.Scanner;
public class ExerciceHMap17 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Rentrez une phrase");
        String str=clavier.nextLine();
        char ch;
        System.out.println("Mot original: "+str);
        String strReverse="";

        for (int i=0; i<str.length();i++){
            ch= str.charAt(i);
            strReverse= ch+strReverse;
        }

        System.out.println("Mot inversé: "+strReverse);
    }
}
