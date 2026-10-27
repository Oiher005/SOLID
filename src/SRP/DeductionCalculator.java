package SRP;

public class DeductionCalculator {
    public float calculate(float initialAmount, int deductionPercentage) {
       
        if (initialAmount > 35600) {
            return (initialAmount * deductionPercentage + 4.5f) / 100f;
        }
        return (initialAmount * deductionPercentage) / 100f;
    }
}