package ISP;

public class Main {
    public static void main(String[] args) {
        
        GmailAccount miGmail = new GmailAccount();
        
        String mensaje = "Hola, este es un correo de prueba enviado desde GmailAccount.";

       
        Emailsender.sender(miGmail, mensaje);
    }
}