public class Chat {

    private Salon[] chat;
    private int indexLibreChat;

    public Chat(){
        this.chat = new Salon[10];
        this.indexLibreChat = 0;
    }

    public void ajouterSalon(Salon salon){
        if(this.indexLibreChat < 10){
            this.chat[indexLibreChat] = salon;
        }
    }

    public boolean estPresent(Utilisateur u){
        for(int i=0;i<indexLibreChat;i++){
            if(chat[i].estPresent(u)){
                return true;
            }
        }
        return false;
    }

    public int nombreMessages(Utilisateur u){
        int j = 0;
        for(int i=0;i<indexLibreChat;i++){
            j += chat[i].nombreMessage(u);
        }
        return j;
    }

    public Utilisateur bavard(){
        int bav = 0;
        Utilisateur u = null;
        for(int i=0;i<indexLibreChat;i++){
            for(int j=0;j<chat[i].getIndexLibreMessage();j++){
                if(nombreMessages(chat[i].getTabUtilisateur()[j])>bav){
                    bav = nombreMessages(chat[i].getTabUtilisateur()[j];
                    u = chat[i].getTabUtilisateur()[j];
                }
            }
        }
        return u;
    }

}
