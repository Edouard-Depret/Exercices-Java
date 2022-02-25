public class Intro {
    public static void main(String[] args){
      int age=33;
      var nombre=67;

      String nom="Lisangola", prenom="Christian";
      String pays="France";

      double poids = 45.3;

      String nomComplet="Jean";
      char genre='m';

      boolean valeur=false;//false

        boolean estMajeur=age>=18; //true

      final double G=9.8;//constante

      System.out.println("Vous avez "+age+" ans");
      System.out.println("Bonjour votre nom est "+prenom+" "+nom);
      System.out.println("Bonjour, vous êtes "+prenom+ " "+nom+ ", vous avez "+age+", et vous vivez en "+pays);

      System.out.printf("Vous avez %d ans\n",age);
      System.out.printf("Bonjour votre nom est %s %s",prenom, nom);
      System.out.printf("Bonjour, vous êtes %s %s ,vous avez %d ans, et vous vivez en %s", prenom, nom, age, pays);
    }
}
