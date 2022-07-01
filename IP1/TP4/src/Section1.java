class Section1 {

    /* ********************************************************** */
    /* EXERCICE 1 : ENTIERS NON SIGNES                            */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction isBinaryEncoding ci-dessous

    public static boolean isBinaryEncoding(String bn){
        if(bn.length() == 8){
            for(int i=0;i<bn.length();i++){
                if(!(bn.charAt(i) == '0' || bn.charAt(i) == '1')){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // QUESTION 2  
    // Déclarez la fonction powerTwo ci-dessous

    public static int powerTwo(int n){
        if(n == 0){
            return 1;
        }
        int racine = 2;
        for(int i=1;i<n;i++){
            racine *= 2;
        }
        return racine;
    }

    // QUESTION 3
    // Déclarez la fonction decode ci-dessous  
    
    public static int decode(String bn){
        if(isBinaryEncoding(bn)==true){
            int nb = 0;
            for(int i=0;i<bn.length();i++){
                if(bn.charAt(i) == '1'){
                    nb += powerTwo(bn.length()-i-1);
                }
            }
            return nb;
        }
        return -1;
    }

    // QUESTION 4
    // Déclarez la *procédure* encodeAndPrint ci-dessous  

    public static String encodeAndPrint(int nb){
        String bn = "";
        for(int i=0;i<8;i++){
            if(nb%2 == 1){
                bn += "1";
            }
            if(nb%2 == 0){
                bn += "0";
            }
            nb /= 2;
        }
        return bn;
    }

    // QUESTION 5
    // Déclarez la fonction encode ci-dessous   

    public static String encode(int nb){
        if(nb<0 && nb>=256){
            return "";
        }
        String obn = encodeAndPrint(nb);
        String bn = "";
        for(int i=0;i<8;i++){
            bn+=obn.charAt(7-i);
        }
        return bn;
    }

    // QUESTION 6
    // Ecrivez le test dans la fonction main

    public static boolean verif(){
        for(int i=0;i<=255;i++){
            if(i != decode(encode(i))){
                return false;
            }
        }
        return true;
    }

    /* ********************************************************** */
    /* EXERCICE 2 : INVERSE                                       */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction inverse ci-dessous

    public static String inverse(String bn){
        String inbn = "";
        for(int i=0;i<bn.length();i++){
            if(bn.charAt(i) == '0'){
                inbn += "1";
            }else if(bn.charAt(i) == '1'){
                inbn += "0";
            }else{
                inbn += bn.charAt(i);
            }
        }
        return inbn;
    }

    // QUESTION 2  
    // Déclarez les fonctions encodeInv et decodeInv ci-dessous

    public static String encodeInv(int nb){
        return inverse(encode(nb));
    }

    public static int decodeInv(String bn){
        return decode(inverse(bn));
    }

    /* ********************************************************** */
    /* EXERCICE 3 : ENTIERS SIGNES                                */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction isNegative ci-dessous

    public static boolean isNegative(String bn){
        if(bn.charAt(7) == '1'){
            return true;
        }
        return false;
    }

    // QUESTION 2  
    // Déclarez la fonction decodeNeg ci-dessous

    public static int decodeNeg(String bn){
        if(isNegative(bn) == true){
            return -decode(bn) + 128;
        }else{
            return decode(bn);
        }
    }

    // QUESTION 3
    // Déclarez la fonction encodeNeg ci-dessous    

    public static String encodeNeg(int nb){
        if(nb<=127 && nb>=-127){
            if(nb<0){
                String en = encode(-nb);
                String bn = "1";
                for(int i=1;i<8;i++){
                    bn = bn + en.charAt(i);
                }
                return bn;
            }else{
                return encode(nb);
            }
        }
        return "";
    }

    // QUESTION 4
    // Déclarez la procédure testFinal ci-dessous    

    public static void testFinal(){
        boolean t = false;
        for(int i=1;i<128;i++){
            if(!encode(i).equals(encodeNeg(i))){
                System.out.println("Il y a un souci");
            }else{
                t = true;
            }
        }
        if(t){
            System.out.println("Tout va bien");
        }
    }

    /* ********************************************************** */
    /* FONCTION PRINCIPALE                                        */
    /* ********************************************************** */
    

    public static void main (String []args) {
    // Ecrivez vos tests dans le corps de cette fonction
        
        System.out.println(decode("11111110"));
        System.out.println(decode("10001000"));
        System.out.println(encodeAndPrint(254));
        System.out.println(encodeAndPrint(136));
        System.out.println(encode(253));
        System.out.println(encode(15));
        System.out.println(verif());
        System.out.println(inverse("010"));
        System.out.println(inverse("bob1081"));
        System.out.println(encodeInv(253));
        System.out.println(encodeInv(15));
        System.out.println(decodeInv("11101101"));
        System.out.println(decodeNeg("00000110"));
        System.out.println(decodeNeg("11000001"));
        System.out.println(encodeNeg(-17));
        System.out.println(encodeNeg(9));
        testFinal();

    }
    

    

}
