public class Main {
    public static void main(String[] args) {
        int loanSum = 1_000_000;
        int years = 3;
        double percent = 9.99;

        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment = service.calculate(1_000_000, 3, 9.99);
        int finalPayment = (int) Math.round(monthlyPayment);

        System.out.println("Ежемесячный платеж: " + finalPayment);
        System.out.println("Срок кредита: " + years + " (год/года/лет)");
        System.out.println("Процентная ставка: " + percent + " %");

        //int loanSum1 = 1_000_000;
        int years1 = 1;
        //double percent1 = 9.99;

        double monthlyPayment1 = service.calculate(1_000_000, 1, 9.99);
        int finalPayment1 = (int) Math.round(monthlyPayment1);

        System.out.println("Ежемесячный платеж: " + finalPayment1);
        System.out.println("Срок кредита: " + years1 + " (год/года/лет)");
        System.out.println("Процентная ставка: " + percent + " %");

        int years2 = 2;

        double monthlyPayment2 = service.calculate(1_000_000, 2, 9.99);
        int finalPayment2 = (int) Math.round(monthlyPayment2);

        System.out.println("Ежемесячный платеж: " + finalPayment2);
        System.out.println("Срок кредита: " + years2 + " (год/года/лет)");
        System.out.println("Процентная ставка: " + percent + " %");


    }
}
