package SRP;

import java.util.Date;

public class BillMejor {
    public String code;
    public Date date;
    public float initialAmount;
    public float totalVAT;
    public float totalDeduction;
    public float billTotal;
    public int deductionPercentage;

    
    public void calculate(BillCalculator calculator) {
        calculator.calculateTotals(this);
    }
}