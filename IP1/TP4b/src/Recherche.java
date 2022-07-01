public class Recherche {

    /* Écrivez vos fonctions ici */

    public static boolean cherche1(char c, String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                return true;
            }
        }
        return false;
    }

    public static int cherche2(char c, String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */

        System.out.println(cherche1('a',"cheval"));
        System.out.println(cherche1('a',"école"));

        System.out.println(cherche2('a',"ecole"));
        System.out.println(cherche2('a',"babar"));

    }
}
