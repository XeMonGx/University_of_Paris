public class Accord {

    /* Écrivez vos fonctions ici */

    public static String withSifNeeded(String name, int n){
        if(n >= 2){
            return name + "s";
        }else{
            return name;
        }
    }


    public static void main(String[] args) {

        /* Écrivez vos tests ici */

        System.out.println(withSifNeeded("pomme",2));

    }
}
