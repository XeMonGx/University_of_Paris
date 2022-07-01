public class Concatenation {

    /* Écrivez vos fonctions ici */

    public static String concatNTimes(String s, int n){
        String str = "";
        for(int i=0;i<n;i++){
            str+=s;
        }
        return str;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(concatNTimes("s", 5));

    }
}
