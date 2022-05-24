public class Syracuse {

    /* Écrivez vos fonctions ici */

    public static int syracuse(int a, int n){
        int result = a;
        for(int i=0;i<n;i++){
            if(i%2==0){
                result = result/2;
            }
            if(i%2==1){
                result = 3 * result + 1;
            }
        }
        return result;
    }

    public static int conjecture(int a){
        int k = 0;
        for (int i=0;i<9999999;i++){
            if(syracuse(a,i)==1){
                i = 100000000;
            }
            k++;
        }
        return k;
    }

    public static void main(String[] args) {

        /* Écrivez vos tests */
        System.out.println(syracuse(3,1));
        System.out.println(conjecture(9));

    }
}
