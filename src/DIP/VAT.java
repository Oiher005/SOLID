package DIP;

public class VAT implements IVATCalculator {
    @Override
    public float cal(float initialAmount) {
        // Lógica de cálculo de IVA
        return initialAmount * 0.21f; // Ejemplo: 21% de IVA
    }
}