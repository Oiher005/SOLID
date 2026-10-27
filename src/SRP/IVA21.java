package SRP;

public class IVA21 implements VatStrategy {
    private static final float VAT_RATE = 0.21f;

    @Override
    public float calculate(BillMejor bill) {
        return bill.initialAmount * VAT_RATE;
    }
}