public class Voyelles {

    /* Écrivez vos fonctions ici */

    public static int vowels(String str){
        int a = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='y'){
                a+=1;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */

        System.out.println(vowels("alibaba"));

    }
}
