import java.util.*;

public class Lab2rev {
    private double annualInterestRate;
    private int numberofYears;
    private double loanAmount;
    private Date loanDate;

    public Lab2rev(double annualInterestRate, int numberofYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberofYears = numberofYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getannualInterestRate() {
        return annualInterestRate;
    }

    public int getnumberofYears() {
        return numberofYears;
    }

    public double getloanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setannualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setnumberofYears(int numberofYears) {
        this.numberofYears = numberofYears;
    }

    public void setloanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double mir = annualInterestRate / 100;
        double mp = loanAmount * mir / (1 - (1 / Math.pow(1 + mir, numberofYears * 12)));
        return mp;
    }

    public double getTotalPayment() {
        double tp = getMonthlyPayment() * numberofYears * 12;
        return tp;
    }

    public static void main(String[] args) {
        Lab2rev loan = new Lab2rev(5.5, 10, 100000); 
        loan.setannualInterestRate(5.5);
        loan.setnumberofYears(10);
        loan.setloanAmount(100000);
        System.out.println("Monthly Payment: $" + loan.getMonthlyPayment());
        System.out.println("Total Payment: $" + loan.getTotalPayment());
        System.out.println("Loan Date: " + loan.getLoanDate());
    }
}
