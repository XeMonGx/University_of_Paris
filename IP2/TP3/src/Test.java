public class Test {

    public static void main(String[] args) {

        Utilisateur u = new Utilisateur("Guillaume","123456789","guillaume@mail.com");
        System.out.println("Teste mot de passe :");
        u.changerMotDePasse("123456","987654321");
        System.out.println("Teste mot de passe :");
        u.changerMotDePasse("123456789","987654321");
        System.out.println("Messages :");
        Salon s = new Salon();
        Utilisateur u1 = new Utilisateur("Joe","123456789","Joe@mail.fr");
        Utilisateur u2 = new Utilisateur("Jack","123456789","Jack@mail.fr");
        Utilisateur u3 = new Utilisateur("Alan","123456789","Alan@mail.fr");
        s.ajouterUtilisateur(u1);
        s.ajouterUtilisateur(u2);
        s.ajouterUtilisateur(u3);
        Messagerie m1 = new Messagerie("Bonjour à tout !",u1);
        Messagerie m2 = new Messagerie("Bonjour à toi.",u2);
        Messagerie m3 = new Messagerie("Comment allez-vous ?",u3);
        Messagerie m4 = new Messagerie("Ca vas.",u);
        Messagerie m5 = new Messagerie("Ca vas !",u1);
        s.ajouterMessage(m1);
        s.ajouterMessage(m2);
        s.ajouterMessage(m3);
        s.ajouterMessage(m4);
        s.ajouterMessage(m5);
        s.affiche();
        s.supprimer(u1);
        System.out.println("Messages :");
        s.affiche();
    }

}
