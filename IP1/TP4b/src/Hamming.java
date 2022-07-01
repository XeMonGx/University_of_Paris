public class Hamming {

    /* Écrivez vos fonctions ici */

    public static int hamming(String s1, String s2){
        if(s1.length() == s2.length()){
            int count = 0;
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    count += 1;
                }
            }
            return count;
        }
        return -1;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */

        System.out.println(hamming("aaba", "aaha"));
        System.out.println(hamming("poire", "pomme"));
        System.out.println(hamming("stylo", "bouteille"));

    }
}
