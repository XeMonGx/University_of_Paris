public class Panier {

    Fruit[] panier;

    public Panier(Fruit[] f){
        this.panier = new Fruit[f.length];
        for(int i=0;i<this.panier.length;i++){
            this.panier[i] = f[i];
        }
    }

    public Panier(){
        this.panier = new Fruit[0];
    }

    public Panier(Fruit f, Panier p){
        this.panier = new Fruit[p.panier.length + 1];
        for(int i=0;i<p.panier.length;i++){
            this.panier[i] = p.panier[i];
        }
        this.panier[p.panier.length] = f;
    }

    public static void afficher(Panier p){
        for(int i=0;i<p.panier.length;i++){
            Fruit.afficher(p.panier[i]);
        }
    }

    public static Panier hybirdePanier(Fruit f, Panier p){
        Fruit[] rep = new Fruit[p.panier.length];
        for(int i=0;i<p.panier.length;i++){
            rep[i] = Fruit.hybridation(f,p.panier[i]);
        }
        return new Panier(rep);
    }

}
