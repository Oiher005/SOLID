package OCP;

public class GoogleAuthProvider implements AuthProvider {
    @Override
    public boolean authenticate(String log, String pass) {
        // Usa la API de Google
        return true;
    }
}