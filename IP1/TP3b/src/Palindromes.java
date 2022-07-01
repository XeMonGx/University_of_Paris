public class Palindromes {

    /* Écrivez vos fonctions ici */

    public static String reverse(String str){
        String s = "";
        for(int i = str.length()-1; i >= 0; i--){
            s += str.charAt(i);
        }
        return s;
    }

    public static boolean palindrome(String str){
        return str.equals(reverse(str));
    }

    public static boolean palindrome_bis(String str){
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(reverse("hello"));
        System.out.println(palindrome("hello"));
        System.out.println(palindrome("ressasser"));
        System.out.println(palindrome_bis("hello"));
        System.out.println(palindrome_bis("ressasser"));

    }
}
