import java.util.Scanner;
public class ExerciceTableau16 {
    public static void main(String[] args) {
        int arraySize, minPos = 0, maxPos = 0;
        double min = Double.POSITIVE_INFINITY, max = Double.NEGATIVE_INFINITY;
        Scanner input=new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        arraySize = input.nextInt();
        int[] numbersArray=new int[arraySize];
        System.out.println("Remplissage du tableau\n");
        for(int i=0;i<numbersArray.length;i++){
            System.out.printf("[%d] : ",i);
            numbersArray[i]=input.nextInt();

            if (numbersArray[i] < min) {
                min = numbersArray[i];
                minPos = i;
            } else if (numbersArray[i] > max) {
                max = numbersArray[i];
                maxPos = i;
            }
        }

        System.out.println("Affichage du tableau\n");
        System.out.print("[");
        for(int i=0;i<numbersArray.length;i++){

            System.out.printf("%d",numbersArray[i]);
            if (i == minPos){
                System.out.print("(pp)");
            } else if (i == maxPos) {
                System.out.print("(pg)");
            }
            if (i < (numbersArray.length -1)){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
