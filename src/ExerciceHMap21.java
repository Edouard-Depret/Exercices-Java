import java.util.Scanner;

public class ExerciceHMap21 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        System.out.println("Rentrez une phrase");
        String phraseOriginal=clavier.nextLine();
        char[] chars= phraseOriginal.toLowerCase().toCharArray();
        boolean espace = true;

        for (int i=0; i<chars.length;i++){
            if (Character.isLetter(chars[i])){
                if(espace){
                    chars[i]=Character.toUpperCase(chars[i]);
                    espace = false;
                }
            } else {
                espace = true;
            }

        }
        System.out.println(String.valueOf(chars));
    }
}