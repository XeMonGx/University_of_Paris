public class Fonctions {

    /* Écrivez vos fonctions ici */
    public static int div10(int x){
        return 10/x;
    }

    public static int sumproduct(int x, int y, int z){
        return x*y+x*z+y*z;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests et le code à exécuter ici */
        System.out.println(div10(10));
        System.out.println(div10(2));
        System.out.println(div10(1)+div10(3)+div10(5)+div10(7));
        System.out.println(sumproduct(2,2+1,div10(2)));

    }
}
