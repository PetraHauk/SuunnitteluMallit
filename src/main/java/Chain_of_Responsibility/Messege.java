package Chain_of_Responsibility;

public class Messege {
    private String messege;
    private String senderEmail;
    private MessegeType messegeType;

    public Messege(MessegeType messegeType, String messege, String senderEmail) {
        this.messege = messege;
        this.senderEmail = senderEmail;
        this.messegeType = messegeType;
    }

    public String getMessege() {
        return messege;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public MessegeType getMessegeType() {
        return messegeType;
    }
}
