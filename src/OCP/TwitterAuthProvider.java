package OCP;

public class TwitterAuthProvider implements AuthProvider {
    @Override
    public boolean authenticate(String log, String pass) {
        // Usa la API de Twitter
        return true;
    }
}