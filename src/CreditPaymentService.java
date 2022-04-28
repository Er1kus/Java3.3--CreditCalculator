public class CreditPaymentService {

    public double calculate(int loanSum, int years, double percentPerYear) {
        int months = years * 12;
        double monthlyPercent = percentPerYear / 12 / 100;
        double annuityRatio = monthlyPercent + (monthlyPercent / ((double) Math.pow(1 + monthlyPercent, months) - 1));
        double monthlyPayment = annuityRatio * loanSum;

        return monthlyPayment;
    }

}
