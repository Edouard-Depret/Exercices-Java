public class Exercice30 {

    static boolean doubleCharacters(String message){
        boolean check = false;
        for (int i=1; i<message.length();i++){
            if (message.charAt(i) == message.charAt(i-1)){
                return true;
            }
        }
        return check;
    }



    public static void main(String[] args) {
        String message = "chats";
        System.out.println(doubleCharacters(message));
    }
}
