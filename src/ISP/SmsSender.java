package ISP;


public class SmsSender {
    public static void sendSMS(ISmsContact c, String message) {
        System.out.println("Enviando SMS a: " + c.getTelephone() + " -> " + message);
    }
}