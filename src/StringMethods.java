import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        String email="christian.lisangola@gmail.com";
        //System.out.println(email.charAt(0));

        //for (int i=0; i<email.length(); i++){
        //    System.out.println(i+" => " + email.charAt(i));
        //}

        System.out.println("Entrez le caractère à rechercher");
        String lettre=input.nextLine();
        System.out.println("Le caractère recherché est "+ lettre + " et se trouve à la position "+email.indexOf(lettre));

        String emailWithStars=email.replace("i","*");
        System.out.println(emailWithStars);

        String emailSubstr=email.substring(0,4);
        System.out.println(emailSubstr);
    }
}
