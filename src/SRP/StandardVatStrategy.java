package SRP;

public class StandardVatStrategy implements VatStrategy {
    private static final float VAT_RATE = 0.16f;

    @Override
    public float calculate(BillMejor bill) {
        return bill.initialAmount * VAT_RATE;
    }
}