public class Premier {

    /* Écrivez vos fonctions ici */

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */

        System.out.println(isPrime(17));
        System.out.println(isPrime(12));
        System.out.println(isPrime(1));
    }
}
