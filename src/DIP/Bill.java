package DIP;

import java.util.Date;

public class Bill { 
    public String code; 
    public Date date; 
    public float initialAmount; 
    public float totalVAT; 
    public float totalDeduction; 
    public float billTotal; 
    public int deductionPercentage; 

    
    private final IDeductionCalculator deductionCalculator;
    private final IVATCalculator vatCalculator;

    
    public Bill(IDeductionCalculator deductionCalculator, IVATCalculator vatCalculator) {
        this.deductionCalculator = deductionCalculator;
        this.vatCalculator = vatCalculator;
    }

    
    public void billTotalCalc() { 
        totalDeduction = deductionCalculator.calc(initialAmount, deductionPercentage); 
        totalVAT = vatCalculator.cal(initialAmount); 
        billTotal = (initialAmount - totalDeduction) + totalVAT; 
    } 
}