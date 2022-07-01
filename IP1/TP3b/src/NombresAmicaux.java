public class NombresAmicaux {

    /* Écrivez vos fonctions ici */

    public static int sumDiv(int n){
        int m = 0;
        for(int i=2;i<=n;i++){
            if(n%i == 0){
                m = m + n/i;
            }
        }
        return m;
    }

    public static boolean verif(int m, int n){
        return sumDiv(n) == m && sumDiv(m) == n;
    }

    public static void nbAmicaux(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(verif(i, j)){
                    System.out.print(i +" "+ j);
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println(sumDiv(1184));
        System.out.println(sumDiv(1210));
        System.out.println(verif(1184,1210));
        nbAmicaux(500);

    }
}
