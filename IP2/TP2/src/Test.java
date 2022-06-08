public class Test {

    public static void main(String[] args) {

        // Exercice 1.4
        Etudiant e1 = new Etudiant("Luke", "Skywalker", 8.25);
        Etudiant e2 = new Etudiant("Leia", "Organa", 11.75);
        System.out.println("nb d'etudiant : " + Etudiant.getNombreDEtudiants());
        System.out.println("somme des note : " + Etudiant.getSommeDesNotes());
        // Exercice 1.5
        System.out.println();
        Etudiant e3 = new Etudiant("Guillaume", "Xue", 14.25);
        System.out.println("nb d'etudiant : " + Etudiant.getNombreDEtudiants());
        System.out.println("somme des note : " + Etudiant.getSommeDesNotes());
        // Exercice 1.6 et 1.7
        System.out.println();
        e1.afficher();
        e2.afficher();
        Etudiant.afficher2(e1);
        Etudiant.afficher2(e2);
        // Exercice 1.8
        System.out.println();
        System.out.print("e1 est Admi : ");
        System.out.println(e1.estAdmis());
        System.out.print("e2 est Admi : ");
        System.out.println(e2.estAdmis());
        // Exercice 1.9
        System.out.println();
        System.out.print("Moyenne de tout les étudiants : ");
        System.out.println(Etudiant.moyenne());
        // Exercice 1.10
        System.out.println();
        System.out.print("e1 meilleur que la moyenne : ");
        System.out.println(e1.meilleurQueLaMoyenne());
        System.out.print("e3 meilleur que la moyenne : ");
        System.out.println(e3.meilleurQueLaMoyenne());
        // Exercice 1.11
        e2.modifierNote(19.5);
        e2.afficher();
        System.out.println("moyenne : " + Etudiant.moyenne());
        // Exercice 2.3
        Trio t = new Trio(e1,e2,e3);
        // Exercice 2.4
        System.out.println();
        System.out.println("Le premier des Trio :");
        t.premier().afficher();
        // Exercice 2.5
        System.out.println();
        System.out.print("Classement de l'étudiant : ");
        System.out.println(t.classement("Guillaume","Xue"));
        // Exercice 2.6
        System.out.println();
        System.out.print("Moyenne des Trio : ");
        System.out.println(t.moyenne());
        Etudiant e4 = new Etudiant("Guillaume", "Xue", 20);
        System.out.print("La moyenne du trio est supérieur à la moyenne de la promotion : ");
        System.out.println(t.meilleurQueLaMoyenne());

    }

}
