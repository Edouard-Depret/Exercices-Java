import java.util.ArrayList;

public class Exercice27 {

    static String locationFinder(int[][] tableau, int nombre){
        ArrayList position = new ArrayList<>();
        int count = 0;
        for (int i=0; i< tableau.length; i++){
            for (int j=0; j<tableau[i].length; j++){
                if (tableau[i][j] == nombre){
                    position.add("("+i+","+j+")");
                    count++;
                }
            }
        }

        String message=nombre+" se retrouve "+count+" fois dans les emplacements suivants : "+position;
        return message;
    }


    public static void main(String[] args) {

        int[][] tableau = {
                {1,4,2,1},
                {6,3,9,9},
                {1,9,1,0}
        };
        int nombre = 1;
        System.out.println(locationFinder(tableau, nombre));

    }
}
