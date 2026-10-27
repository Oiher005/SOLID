package OCP;

public interface AuthProvider {
    boolean authenticate(String log, String pass);
}