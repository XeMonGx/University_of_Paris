public class Somme {

    /* Écrivez vos fonctions ici */
    
    public static int somme(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            count = count + i;
        }
        return count;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests */
        System.out.println(somme(3));

    }
}
