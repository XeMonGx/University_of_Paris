public class Messagerie {

    private String messages;
    private Utilisateur user;

    public Messagerie(String messages, Utilisateur user){
        this.messages = messages;
        this.user = user;
    }

    public String getMessages() {
        return messages;
    }

    public Utilisateur getUser() {
        return user;
    }
}
