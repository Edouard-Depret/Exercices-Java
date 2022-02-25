public class ExerciceTableau14 {
    public static void main(String[] args) {
        int resultat = 0;
        int maxCount=0;
        int array[]={2, 7, 5, 6, 7, 1, 6, 2, 1, 7};
        for (int i=1; i< array.length;i++){
            int counter = 1;
            for (int j = i+1; j<array.length;j++){
                if (array[i]==array[j]){
                    counter++;
                }
            }
            if (maxCount<counter){
                maxCount = counter;
                resultat = array[i];
            }
        }

        System.out.println("l’élément le plus fréquent est le "+resultat+" et que sa fréquence d’apparition est " +maxCount);


    }
}
