public class Conditions {

    /* Écrivez vos fonctions ici */

    public static int absolute(int x){
        if(x>0){
            return x;
        }
        return -x;
    }

    public static void solve(int x, int y, int z){
        if(x + y == z){
            System.out.println("x + y = z");
        }else if(x - y == z){
            System.out.println("x - y = z");
        }else if(-x - y == z){
            System.out.println("-x - y = z");
        }else if(-x + y == z){
            System.out.println("-x + y = z");
        }else{
            System.out.println("Rien du tout!");
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests et le code à exécuter ici */
        System.out.println(absolute(73));
        System.out.println(absolute(-37));
        solve(3,4,5);
    }
}
