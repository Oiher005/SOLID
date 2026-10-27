package OCP;

public class FacebookAuthProvider implements AuthProvider {
    @Override
    public boolean authenticate(String log, String pass) {
        // Usa la API de Facebook
        return true;
    }
}



