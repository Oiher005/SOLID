package SRP;

public class BillCalculator {
    private final VatCalculator vatCalculator;
    private final DeductionCalculator deductionCalculator;

    public BillCalculator(VatCalculator vatCalculator, DeductionCalculator deductionCalculator) {
        this.vatCalculator = vatCalculator;
        this.deductionCalculator = deductionCalculator;
    }

    public void calculateTotals(BillMejor bill) {
        // 1. Calcula la deducción
        bill.totalDeduction = deductionCalculator.calculate(bill.initialAmount, bill.deductionPercentage);
        
        // 2. Calcula el IVA (usando la estrategia correspondiente)
        bill.totalVAT = vatCalculator.calculate(bill);
        
        // 3. Calcula el total final de la factura
        bill.billTotal = (bill.initialAmount - bill.totalDeduction) + bill.totalVAT;
    }
}