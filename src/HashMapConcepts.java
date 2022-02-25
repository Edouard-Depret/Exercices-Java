import java.util.HashMap;
import java.util.Scanner;
public class HashMapConcepts {
    public static void main(String[] args) {
        HashMap<String,String> user= new HashMap<>(); //{}
        user.put("email","jojo@gmail.com");
        user.put("username","jojo");
        user.put("fullName","jojo le zozor");

        user.replace("fullName","papy");
        user.remove("fullName","papy");

        HashMap<Integer,String> mois = new HashMap<>();
 //       mois.put(1,"Janvier");
 //       mois.put(2,"Février");
 //       mois.put(3,"Mars");
 //       mois.put(4,"Avril");
 //       mois.put(5,"Mai");
 //       mois.put(6,"Juin");
//        mois.put(7,"Juillet");
//        mois.put(8,"Août");
//        mois.put(9,"Septembre");
//        mois.put(10,"Octobre");
//        mois.put(11,"Novembre");
//        mois.put(12,"Décembre");

        String[] nomMois={"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"};
        for (int i=0; i<nomMois.length;i++){
            mois.put(i+1,nomMois[i]);
        }

        int counter=1;
        for (String m:nomMois){
            mois.put(counter,m);
            counter++;
        }

        System.out.println(mois.get(4));
    }
}
