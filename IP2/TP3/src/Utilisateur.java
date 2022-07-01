public class Utilisateur {

    private String pseudo;
    private String motDePasse;
    private final String adresseMail;

    public Utilisateur(String pseudo, String motDePasse, String adresseMail){
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.adresseMail = adresseMail;
    }

    public boolean testMotDePasse(String mdp){
        return mdp.equals(this.motDePasse);
    }

    public void changerMotDePasse(String motdePasse, String nouveauMotDePasse){
        if(testMotDePasse(motdePasse)){
            this.motDePasse = nouveauMotDePasse;
            System.out.println("mot de passe changer");
        }else{
            System.out.println("mot de passe incorrècte");
        }
    }

    public String getPseudonyme(){
        return this.pseudo;
    }

    public void setPseudonyme(String pseudo){
        this.pseudo = pseudo;
    }

}
