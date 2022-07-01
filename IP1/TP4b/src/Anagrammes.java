public class Anagrammes {

    /* Écrivez vos fonctions ici */

    public static String suppression(char c, String s){
        String str = "";
        int count = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c && count == 1){
                count -= 1;
            }else{
                str += s.charAt(i);
            }
        }
        return str;
    }

    public static boolean scrabble(String mot, String lettres_disponibles){
        String s = lettres_disponibles;
        for(int i=0;i<mot.length();i++){
            s = suppression(mot.charAt(i), s);
        }
        if((lettres_disponibles.length()-mot.length()) == s.length()){
            return true;
        }
        return false;
    }

    public static boolean anagramme(String u, String v){
        return scrabble(u, v) && scrabble(v, u);
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */

        System.out.println(suppression('a', "baldaquin"));
        System.out.println(suppression('d', "fleur"));

        System.out.println(scrabble("maison", "auiysmzanpo"));
        System.out.println(scrabble("bungalows","hbteslo"));

        System.out.println(anagramme("parisien", "aspirine"));
        System.out.println(anagramme("chaise", "disque"));

    }
}
