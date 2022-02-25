import java.util.Scanner;
public class LesStrings {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        String z=input.nextLine();
        String a="lisangola";
        String b="lisangola";

        System.out.println(a==b);//true
        System.out.println(a==z);//false
        System.out.println(a.equals(z));//true
        z=z.intern();
        System.out.println(a==z);//true
    }
}
