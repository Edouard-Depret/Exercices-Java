public class Blocs {
    public static void main(String[] args) {

        //int age=45;
        {
            int age=23; //ici, age existe déjà car elle a été déclarée en global
            System.out.println("Age : "+age);
        }
        //System.out.println("Age :"+age); //age n'est pas présente dans ce bloc
    }
}
