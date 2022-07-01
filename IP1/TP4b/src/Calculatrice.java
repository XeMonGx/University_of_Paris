public class Calculatrice {

    /* Écrivez vos fonctions ici */

    public static int somme(String str){
        if(str.charAt(0) == '+' || str.charAt(str.length()-1) == '+'){
            return -1;
        }else{
            int n = 0;
            for(int i=0;i<str.length();i++){
                n += (str.charAt(i)-'0');
                i++; 
            }
            return n;
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(somme("3+8"));
        System.out.println(somme("+7+8"));
        System.out.println(somme("4+3+9+"));

    }
}
