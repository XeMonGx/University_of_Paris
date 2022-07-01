public class Salon {

    private Utilisateur[] tabUtilisateur;
    private Messagerie[] tabMessage;
    private int indexLibreMessage, indexLibreUtilisateur;

    public Salon(){
        this.tabUtilisateur = new Utilisateur[10];
        this.tabMessage = new Messagerie[10];
        this.indexLibreMessage = 0;
        this.indexLibreUtilisateur = 0;
    }

    public boolean estPresent(Utilisateur user){
        for(int i=0;i<this.indexLibreUtilisateur;i++){
            if(user == this.tabUtilisateur[i]) {
                return true;
            }
        }
        return false;
    }

    public void ajouterUtilisateur(Utilisateur user){
        if(this.indexLibreUtilisateur < 10){
            this.tabUtilisateur[this.indexLibreUtilisateur] = user;
            this.indexLibreUtilisateur += 1;
        }
    }

    public void ajouterMessage(Messagerie message){
        if(estPresent(message.getUser())){
            if(this.indexLibreMessage < 10){
                this.tabMessage[this.indexLibreMessage] = message;
                this.indexLibreMessage += 1;
            }
        }
    }

    public void affiche(){
        for(int i=0;i<this.indexLibreMessage;i++){
            System.out.println(this.tabMessage[i].getUser().getPseudonyme() + ": " + this.tabMessage[i].getMessages());
        }
    }

    public void supprimerUtilisateur(Utilisateur user){
        Utilisateur[] u = new Utilisateur[10];
        int i = 0;
        for(int j=0;j<this.indexLibreUtilisateur;j++){
            if(!estPresent(user)){
                u[i] = this.tabUtilisateur[j];
                i+=1;
            }
        }
        this.tabUtilisateur = u;
        this.indexLibreUtilisateur -= 1;
    }

    public void supprimerMessages(Utilisateur user){
        Messagerie[] m = new Messagerie[10];
        int i = 0;
        for(int j=0;j<this.indexLibreMessage;j++){
            if(tabMessage[j].getUser() != user){
                m[i] = this.tabMessage[j];
                i+=1;
            }
        }
        this.tabMessage = m;
        this.indexLibreMessage -= i;
    }

    public void supprimer(Utilisateur user){
        if(estPresent(user)){
            supprimerUtilisateur(user);
            supprimerMessages(user);
        }
    }

    public int nombreMessage(Utilisateur u){
        int j = 0;
        for (int i=0;i<indexLibreMessage;i++){
            if(tabMessage[i].getUser() == u){
               j += 1;
            }
        }
        return j;
    }

    public int getIndexLibreMessage() {
        return indexLibreMessage;
    }

    public Utilisateur[] getTabUtilisateur() {
        return tabUtilisateur;
    }

    public Messagerie[] getTabMessage() {
        return tabMessage;
    }
}
