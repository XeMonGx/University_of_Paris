public class Fibonacci {

    /* Écrivez vos fonctions ici */

    public static int fibonacci(int n){
        int count1 = 0;
        int count2 = 1;
        int count3 = 1;
        for(int i=1;i<=n;i++){
            count3=count2+count1;
            count1=count2;
            count2=count3;
        }
        return count3;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests */
        System.out.println(fibonacci(9));

    }
}
