import java.util.ArrayList;
import java.util.List;

public class Exercice33Aymane {
    static ArrayList<List> somme(int[] table, int S){
        ArrayList<List> tableSortie = new ArrayList<List>();

        for (int i=0;i<table.length;i++){
            for (int j=i+1;j<table.length;j++){
                if (table[i]+table[j]==S){
                    List<Integer> list = List.of(new Integer[]{table[i], table[j]});
                    tableSortie.add(list);
                }
            }
        }

        return tableSortie;
    }
    public static void main(String[] args) {
        int[] tableEntree = {3,2,4,7,5,-1};
        System.out.println(somme(tableEntree,6));
    }
}