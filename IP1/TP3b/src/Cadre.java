public class Cadre {

    /* Écrivez vos fonctions ici */

    public static void line(int n){
        for(int i=0;i<n;i++){
            System.out.print("#");
        }
    }

    public static void frameLine(int n){
        System.out.print("+");
        for(int i=0;i<n;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void frameEsp(int n){
        for(int i=0;i<n;i++){
            System.out.print(" ");
        }
    }

    public static int PlusLong(String str){
        int[] n = new int[2];
        int m = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '\n'){
                m=1;
            }
            n[m]++;
        }
        if(n[1] > n[2]){
            return n[1];
        }else{
            return n[2];
        }
    }

    public static void frame(String str){
        frameLine(str.length()+2);
        System.out.print("| ");
        System.out.print(str);
        frameEsp(PlusLong(str));
        System.out.println(" |");
        frameLine(str.length()+2);
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */

        line(7);
        System.out.println();
        frame("Hello\nWorld!");
        frame("Salut !");

    }
}
