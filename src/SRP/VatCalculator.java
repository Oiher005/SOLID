package SRP;

public class VatCalculator {
    public float calculate(BillMejor bill) {
        VatStrategy strategy = VatCalculatorFactory.getStrategy(bill);
        return strategy.calculate(bill);
    }
}