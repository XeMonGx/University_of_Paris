public class Etudiant {
    String nom, prenom;
    int num;
    int note;

    public Etudiant(String nom, String prenom, int num, int note){
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
        this.note = note;
    }

    public static void afficher(Etudiant etu){
        System.out.println("Nom " + etu.nom + " Prénom " + etu.prenom + " (Numéro d'étudiant " + etu.num + ") : Note " + etu.note);
    }

    public static boolean estAdmis(Etudiant etu){
        return etu.note >= 10;
    }

    public static String mention(Etudiant etu){
        if(etu.note <= 20 && etu.note>=16){
            return "Très bien";
        }else if(etu.note < 16 && etu.note>=14){
            return "bien";
        }else if(etu.note < 14 && etu.note>=12){
            return "Assez bien";
        }else if(etu.note < 12 && etu.note>=10){
            return "Passable";
        }else if(etu.note < 10 && etu.note>=0){
            return "Ajourné";
        }else{
            return "Note invalide";
        }
    }

}
