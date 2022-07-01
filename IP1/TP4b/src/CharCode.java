public class CharCode {

    public static int charToCode(char c) {
        return (int) c;
    }

    public static char codeToChar(int code) {
        return (char) code;
    }

    /* Écrivez vos fonctions ici */

    public static void minuscule(char c){
        if(c >='a' && c <= 'z'){
            System.out.println("minuscule");
        }else if(c >= 'A' && c <= 'Z'){
            System.out.println("MAJUSCULE");
        }else{
            System.out.println("caractère spécial");
        }
    }

    public static void alphabet(){
        for(int i=97;i<=122;i++){
            System.out.print(codeToChar(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(charToCode('a'));
        System.out.println(charToCode('z'));
        System.out.println(charToCode('M'));

        minuscule('a');
        minuscule('H');
        minuscule('é');

        alphabet();

    }
}
