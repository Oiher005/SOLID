package ISP;


public class GmailAccount implements IEmailContact {
    private String name, emailAddress;

    public GmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
}