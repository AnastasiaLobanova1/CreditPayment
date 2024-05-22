public class CreditPaymentService {

    public double calculate(int sum, double percent, int period) {
        double percentInMonth = percent/100/12;
        double payment = sum * (percentInMonth *(Math.pow(1 + percentInMonth, period) / (Math.pow(1 + percentInMonth, period) - 1)));
        return payment;

    }
}
