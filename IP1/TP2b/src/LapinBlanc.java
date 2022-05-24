public class LapinBlanc {

    /* Écrivez votre fonction ici */

    public static void secondes(int s){
        System.out.println(s/3600);
        System.out.println(s/60-60);
        System.out.println(s%60);

    }

    public static void main(String[] args) {

        /* Écrivez vos tests */
        secondes(3725);

    }
}
