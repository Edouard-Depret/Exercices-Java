public class Exercice16 {
    public static void main(String[] args) {
        double valeur = 225000;
        int annee=2015;
        int n=0;
        while(annee!=2001) {
            valeur = 225000*Math.pow(0.96,n);
            annee--;
            n++;
            System.out.printf("La valeur de la maison est de %.2f à l'année %d\n",valeur, annee+1);
        }
    }
}