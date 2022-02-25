public class Exercice15 {
    public static void main(String[] args) {
        double valeur = 40000;
        int n=0;
        while(valeur>5000) {

            valeur = 40000*Math.pow(0.93,n);
            n++;
            System.out.printf("La valeur de la voiture est de %.2f à l'année %d\n",valeur, 2015+n-1);
        }
    }
}
