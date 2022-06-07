public class TestEtudiant {

    public static void main(String[] args) {
        // Exercice 2.1 et 2.2 et 2.3
        System.out.println("Teste affichage :");
        Etudiant etu = new Etudiant("Xue","Guillaume",22101031,20);
        Etudiant.afficher(etu);
        // Exercice 2.4
        System.out.println("Teste estAdmi :");
        System.out.println(Etudiant.estAdmis(etu));
        // Exercice 2.5
        System.out.println("Teste mention :");
        for (int i=-1;i<22;i++){
            etu.note = i;
            System.out.println(i+ " " +Etudiant.mention(etu));
        }

    }

}
