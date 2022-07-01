public class ADN {

    /* Écrivez vos fonctions ici */

    public static boolean estADN(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != 'A' && s.charAt(i) != 'C' && s.charAt(i) != 'G' && s.charAt(i) != 'T'){
                return false;
            }
        }
        return true;
    }

    public static void masseMolaire(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A'){
                count += 135;
            }else if(s.charAt(i) == 'T'){
                count += 126;
            }else if(s.charAt(i) == 'G'){
                count += 151;
            }else if(s.charAt(i) == 'C'){
                count += 111;
            }
        }
        System.out.println(count + " g/mol");
    }

    public static String brinComp(String s){
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A'){
                str += 'T';
            }else if(s.charAt(i) == 'T'){
                str += 'A';
            }else if(s.charAt(i) == 'G'){
                str += 'C';
            }else if(s.charAt(i) == 'C'){
                str += 'G';
            }
        }
        return str;
    }

    public static boolean sous_sequence(String s1, String s2){
        for(int i=0;i<s2.length()-s1.length();i++){
            if(s1.charAt(0) == s2.charAt(i)){
                String str = "";
                for(int j=0;j<s1.length();j++){
                    str += s2.charAt(i + j);
                }
                if(s1.equals(str)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        /* Écrivez vos fonctions ici */

        System.out.println(estADN("TTGAC"));
        System.out.println(estADN("GCAATAG"));
        System.out.println(estADN("AMOG"));
        System.out.println(estADN("CaTg"));

        masseMolaire("AGATC");
        System.out.println(brinComp("AAGT"));

        System.out.println(sous_sequence("ATC", "GGTATCG"));
        System.out.println(sous_sequence("GC", "AAT"));

    }
}
