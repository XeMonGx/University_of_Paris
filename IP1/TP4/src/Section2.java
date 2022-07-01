class Section2 {

    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // QUESTION 1 
    // Déclarez la fonction letterToInt ci-dessous

    public static int letterToInt(String l){
        for(int i=0;i<alphabet.length();i++){
            if(alphabet.charAt(i) == l.charAt(0)){
                return i;
            }
        }
        return -1;
    }

    // QUESTION 2  
    // Déclarez la fonction cesarLetter ci-dessous

    public static String cesarLettre(String l1, String l2){
        if(l2.equals(" ")){
            return " ";
        }
        int n = letterToInt(l1)+letterToInt(l2);
        if(n>26){
            n -=26;
        }
        return alphabet.charAt(n) + "";
    }

    // QUESTION 3  
    // Déclarez la fonction cesar  ci-dessous

    public static String cerar(String a,String s){
        String m = "";
        for(int i=0;i<s.length();i++){
            m = m + cesarLettre(a, s.charAt(i)+"");
        }
        return m;
    }
	
    // QUESTION 4
    // Déclarez la fonction deCesarLetter ci-dessous    

    public static String deCesarLetter(String l1, String l2){
        if(l2.equals(" ")){
            return " ";
        }
        int n = letterToInt(l2)-letterToInt(l1);
        if(n<0){
            n +=26;
        }
        return alphabet.charAt(n) + "";
    }

    // QUESTION 5
    // Déclarez la fonction deCesar ci-dessous    

    public static String deCesar(String a, String s){
        String m = "";
        for(int i=0;i<s.length();i++){
            m = m + deCesarLetter(a, s.charAt(i)+"");
        }
        return m;
    }

    // QUESTION 6
    // Déchiffrez le message "DOHD MDFWD HVW" dans la fonction principale



    /* ********************************************************** */
    /* FONCTION PRINCIPALE                                        */
    /* ********************************************************** */
    

    public static void main (String []args) {
    // Ecrivez vos tests dans le corps de cette fonction

        System.out.println(letterToInt("A"));
        System.out.println(letterToInt("Z"));
        System.out.println(letterToInt("*"));
        System.out.println(cesarLettre("D", "B"));
        System.out.println(cesarLettre("H", " "));
        System.out.println(cesarLettre("C", "Z"));
        System.out.println(cerar("D", "BONJOUR"));
        System.out.println(deCesarLetter("D", "E"));
        System.out.println(deCesarLetter("D", "F"));
        System.out.println(deCesarLetter("Z", "B"));
        System.out.println(deCesar("D", "ERQMRXU"));
        System.out.println(deCesar("D", "DOHDMDFWD HVW"));

    }
   

}
