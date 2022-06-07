public class Test {



    public static void main(String[] args) {
        Fruit f = new Fruit("pamplemousse", 330);
        Fruit g = new Fruit("pamplemousse", 330);
        Fruit h = f;
        Fruit i = new Fruit("banane", 50);
        Fruit j = new Fruit("pomme", 60);
        System.out.println("Test Termine");
        // Exercice 1.5 et 1.6
        System.out.println("Teste affichage :");
        Fruit.afficher(f);
        // Exercice 1.7
        System.out.println("Teste hybridation :");
        Fruit.afficher(Fruit.hybridation(f,g));
        // Exercice 1.10
        System.out.println("Teste panier 1 :");
        Fruit[] p = {f,g,h,i};
        Panier p1 = new Panier(p);
        Panier.afficher(p1);

        System.out.println("Teste panier 2 :");
        Panier p2 = new Panier();
        Panier.afficher(p2);

        System.out.println("Teste panier 3 :");
        Panier p3 = new Panier(j,p1);
        Panier.afficher(p3);
        // Exercice 1.11
        System.out.println("Teste hybridePanier :");
        Panier.afficher(Panier.hybirdePanier(j,p3));

    }
}
