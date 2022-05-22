/*

   Ce programme affiche un message de politesse.

*/

import java.util.Scanner;

/*

   Voici le nom du programme. On doit toujours définir
   une classe X dans un fichier nommé X.java

*/
public class HelloWorld {
    // Le point d'entrée du programme.
    public static void main (String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        System.out.println("What is your lastname?");
        Scanner scanner2 = new Scanner(System.in);
        String prenom = scanner2.nextLine();
	// Une unique commande est exécutée.
	System.out.println ("Hello" + " " + nom + " " + prenom + "!");
    }

}
