public class Etudiant {

    final String prenom;
    final String nom;
    double note;

    private static int nombreDEtudiants = 0;
    private static double sommeDesNotes = 0;

    public Etudiant(String prenom, String nom, double note){
        this.prenom = prenom;
        this.nom = nom;
        this.note = note;
        nombreDEtudiants++;
        sommeDesNotes += note;
    }

    public void afficher(){
        System.out.println(this.nom + " " + this.prenom + " " + this.note);
    }

    public static void afficher2(Etudiant etu){
        System.out.println(etu.nom + " " + etu.prenom + " " + etu.note);
    }

    public boolean estAdmis(){
        return this.note >= 10;
    }

    public static double moyenne(){
        return sommeDesNotes/nombreDEtudiants;
    }

    public boolean meilleurQueLaMoyenne(){
        return  moyenne() < this.note;
    }

    public void modifierNote(double nouvelleNote){
        sommeDesNotes = sommeDesNotes - this.note + nouvelleNote;
        this.note = nouvelleNote;
    }

    public static double getSommeDesNotes() {
        return sommeDesNotes;
    }

    public static int getNombreDEtudiants() {
        return nombreDEtudiants;
    }
}
