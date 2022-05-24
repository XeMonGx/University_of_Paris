public class Yoda {

    /* Écrivez vos fonctions ici */

    public static void yoda(int n){
        for(int i=0;i<n;i++){
            System.out.println("May the force be with you.");
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests et le code à exécuter ici */

        for(int i=0;i<42;i++){
            yoda(100);
        }

    }
}
