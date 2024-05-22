public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double payment = service.calculate(1000000, 9.99, 12);
        System.out.printf("Платеж: " + "%.0f", payment);
        System.out.println();
        double payment1 = service.calculate(1000000, 9.99, 24);
        System.out.printf("Платеж: " + "%.0f", payment1);
        System.out.println();
        double payment2 = service.calculate(1000000, 9.99, 36);
        System.out.printf("Платеж: " + "%.0f", payment2);


    }
}