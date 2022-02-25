import java.util.*;
public class Exercice31Merwan {
    private static List<Integer[]> splitArray(Integer[] originalArray, int coupe) {
        List<Integer[]> listOfArrays = new ArrayList<Integer[]>();
        int totalSize = originalArray.length;
        if (totalSize < coupe) {
            coupe = totalSize;
        }
        int debut = 0;
        int fin = coupe;

        while (debut < totalSize) {
            Integer[] partArray = Arrays.copyOfRange(originalArray, debut, fin);
            listOfArrays.add(partArray);

            debut += coupe;
            fin = debut + coupe;
            if (fin > totalSize) {
                fin = totalSize;
            }
        }
        return listOfArrays;
    }


    public static void main(String[] args) {
        List<Integer> testingOriginalList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            testingOriginalList.add(i);
        }

        int batchSize = 3;
        Integer[] originalArray = testingOriginalList.toArray(new Integer[]{});

        List<Integer[]> listOfArrays = splitArray(originalArray, batchSize);


        for (Integer[] array : listOfArrays) {
            System.out.println(Arrays.toString(array));
        }
    }
}