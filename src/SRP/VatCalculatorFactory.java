package SRP;

public class VatCalculatorFactory {
    public static VatStrategy getStrategy(BillMejor bill) {
        if (bill.code != null && !bill.code.isEmpty()) {
            try {
                if (Integer.parseInt(bill.code) < 10) {
                    return new ZeroVatStrategy();
                }
            } catch (NumberFormatException e) {
                // Manejo si el código no es un número válido
            }
        }
        return new StandardVatStrategy();
    }
}