package ISP;

public class Contact implements IEmailContact, ISmsContact {
    private String name, address, emailAddress, telephone;

    @Override
    public String getEmailAddress() { return emailAddress; }

    @Override
    public String getTelephone() { return telephone; }
}