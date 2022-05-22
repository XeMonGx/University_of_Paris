import java.util.Scanner;

/*

   Ce programme lit un entier tapé au clavier et l'affiche

*/
public class Affiche{
    // Le point d'entrée du programme.
    public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tapez un nombre au clavier puis Entree");
		int x = scanner.nextInt();
		System.out.print("Vous avez tape le nombre : ");
		System.out.println(x);
    }
}
