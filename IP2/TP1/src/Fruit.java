public class Fruit {
    public String nom;
    public int poids;

    public Fruit(String n, int p){
        this.nom = n;
        this.poids = p;
    }

    public static void afficher(Fruit f){
        System.out.println("Ce furit est un(e) " + f.nom + " est pèse " + f.poids + " grammes.");
    }

    public static Fruit hybridation(Fruit f1, Fruit f2){
        return new Fruit(f1.nom+ " + " + f2.nom, f1.poids + f2.poids );
    }

}
