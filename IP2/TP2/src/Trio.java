public class Trio {

    private Etudiant[] membres;

    public Trio(Etudiant e1, Etudiant e2, Etudiant e3){
        this.membres = new Etudiant[]{e1, e2, e3};
    }

    public Etudiant premier(){
        Etudiant meilleur = new Etudiant("","",0);
        for (int i=0;i<membres.length;i++){
            if(membres[i].note>meilleur.note){
                meilleur = membres[i];
            }
        }
        return meilleur;
    }

    public int classement(String prenom, String nom){
        Etudiant moi = null;
        int c = 3;
        for(int i=0;i<membres.length;i++){
            if(membres[i].prenom.equals(prenom) && membres[i].nom.equals(nom)){
                moi = membres[i];
            }
        }
        if(moi != null){
            for (int i=0;i<membres.length;i++){
                if(membres[i].note<moi.note){
                    c--;
                }
            }
            return c;
        }else{
            return 0;
        }
    }

    public double moyenne(){
        return (membres[0].note + membres[1].note + membres[2].note)/3;
    }

    public boolean meilleurQueLaMoyenne(){
        return Etudiant.moyenne() < moyenne();
    }

}
