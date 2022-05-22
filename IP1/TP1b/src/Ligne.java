import java.util.Scanner;

/*

   Ce programme affiche une ligne avec 10 dieses

*/
public class Ligne{
    // Le point d'entrée du programme.
    public static void main (String[] args) {
		System.out.println("Combien de dièses afficher :");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for(int i=0;i<x;i=i+1){
			System.out.println("#");
		}
		System.out.println();
    }
}
