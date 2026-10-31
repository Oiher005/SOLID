package ISP;

public class Main {
    public static void main(String[] args) {
        
        GmailAccount miGmail = new GmailAccount("Antonio", "antonio@gmail.com");
        
        String mensaje = "Hola, este es un correo de prueba enviado desde IEmailContact.";

       
        EmailSender.sendEmail(miGmail, mensaje);
    }
}