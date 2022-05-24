public class Factorielle {

    /* Écrivez vos fonctions ici */

    public static int factorielle(int n){
        int count = 1;
        for(int i=1;i<=n;i++){
            count = count * i;
        }
        return count;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests */
        System.out.println(factorielle(5));

    }
}
