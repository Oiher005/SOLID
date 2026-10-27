package SRP;

public class ZeroVatStrategy implements VatStrategy {
    @Override
    public float calculate(BillMejor bill) {
        return 0f; // No aplica IVA
    }
}