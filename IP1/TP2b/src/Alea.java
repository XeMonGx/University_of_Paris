/* Pour pouvoir générer des nombres aléatoires */
import java.util.Random;

public class Alea {

    /***********************************/
    /* Ne modifiez pas le code suivant */
    /***********************************/

    /* La procédure suivante renvoie un entier tiré au hasard entre min et max. */
    public static int randInt (int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    static Random rand = new Random ();

    /*********************************/
    /* Fin du code à ne pas modifier */
    /*********************************/


    /* Écrivez vos fonctions ici */

    public static int de (){
        return randInt(1,6);
    }

    public static void yams(){
        System.out.println(de());
        System.out.println(de());
        System.out.println(de());
    }

    public static void main(String[] args) {

        /* Écrivez vos tests */
        yams();

    }
}
