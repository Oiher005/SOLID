package DIP;

public class Deduction implements IDeductionCalculator {
    @Override
    public float calc(float initialAmount, int deductionPercentage) {
        
        return (initialAmount * deductionPercentage) / 100; 
    }
}