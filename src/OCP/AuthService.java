package OCP;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private final Map<String, AuthProvider> providers = new HashMap<>();

    // Los proveedores se pueden inyectar o registrar dinámicamente
    public void registerProvider(String serviceName, AuthProvider provider) {
        providers.put(serviceName, provider);
    }

    public boolean signIn(String service, String log, String pass) {
        AuthProvider provider = providers.get(service);
        if (provider != null) {
            return provider.authenticate(log, pass);
        }
        return false;
    }
}