package ISP;


public class EmailSender {
    public static void sendEmail(IEmailContact c, String message) {
        System.out.println("Enviando email a: " + c.getEmailAddress() + " -> " + message);
    }
}