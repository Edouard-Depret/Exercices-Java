public class Exercice32Salim {
    static void TP32(int number){
        StringBuilder pas = new StringBuilder("");
        for(int i=0;i<number;i++){
            pas.append(' ');
        }
        for(int i=0;i<number;i++){
            pas.setCharAt(i,'#');
            System.out.println(pas);
        }
    }

    public static void main(String[] args) {
        TP32(5);
    }
}
