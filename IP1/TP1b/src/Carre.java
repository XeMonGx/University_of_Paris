import java.util.Scanner;

/*

   Ce programme lit un entier tapé au clavier et l'affiche

*/
public class Carre{
    // Le point d'entrée du programme.
    public static void main (String[] args) {
	// On affiche la premiere ligne
		System.out.println("entrer la largeur");
		Scanner largeur = new Scanner(System.in);
		int width = largeur.nextInt();
		System.out.println("entrer la hauteur");
		Scanner hauteur = new Scanner(System.in);
		int height = hauteur.nextInt()-2;

		for(int i=0;i<width;i=i+1){
			System.out.print("#");
		}
		System.out.println();

		// On cree une ligne vide
		String ch = "#";

		for(int i=0;i<width-2;i=i+1){
			ch = ch + "#";
		}

		ch = ch + "#";

		// On affiche les 8 lignes vides
		for(int i=0;i<height;i=i+1){
			System.out.println(ch);
		}

		//On affiche la derniere ligne
		// On affiche la premiere ligne
		for(int i=0;i<width;i=i+1){
			System.out.print("#");
		}
		System.out.println();
    }
}
