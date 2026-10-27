package OCP;

public class AppleAuthProvider implements AuthProvider {
    @Override
    public boolean authenticate(String log, String pass) {
        // Usa la API de Appple
        return true;
    }
}