public class FizzBuzz {

    /* Écrivez vos fonctions ici */

    public static void fizzbuzz(int n){
        if(n%3==0){
        System.out.print("Fizz ");
        }
        if(n%5==0){
            System.out.print("Buzz ");
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        fizzbuzz(15);

    }
}
