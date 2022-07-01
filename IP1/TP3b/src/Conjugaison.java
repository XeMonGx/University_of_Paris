public class Conjugaison {

    /* Écrivez vos fonctions ici */

    public static boolean verifMinu(String verb){
        for(int i=0;i<verb.length();i++){
            if(!(verb.charAt(i)>='a' && verb.charAt(i)<='z')){
                return false;
            }
        }
        return true;
    }

    public static boolean verbPr(String verb){
        if(verb.charAt(verb.length()-1) == 'r' && verb.charAt(verb.length()-2) == 'e'){
            return true;
        }
        return false;
    }

    public static void conjugate(String verb){
        if(verifMinu(verb) == true){
            if(verbPr(verb) == true){
                if(!verb.equals("aller")){
                    String newVerb = "";
                    for(int i=0;i<verb.length()-2;i++){
                        newVerb += verb.charAt(i);
                    }
                    System.out.println("je " + newVerb +"e");
                    System.out.println("tu " + newVerb +"es");
                    System.out.println("il " + newVerb +"e");
                    System.out.println("nous " + newVerb +"ons");
                    System.out.println("vous " + newVerb +"ez");
                    System.out.println("ils " + newVerb +"ent");
                }else{
                    System.out.println("je ne peut pas conjuger aller");
                }
            }else{
                System.out.println("n'est pas à la première personne");
            }
        }else{
            System.out.println("mettre en minuscule");
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        conjugate("parler");
        System.out.println();
        conjugate("manger");

    }
}
