public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        
        System.out.println();
        System.out.println("1_000_000, 9,99, 1");
        System.out.println(service.calculate(1_000_000, 9.99, 1));

        System.out.println();
        System.out.println("1_000_000, 9,99, 2");
        System.out.println(service.calculate(1_000_000, 9.99, 2));

        System.out.println();
        System.out.println("1_000_000, 9,99, 3");
        System.out.println(service.calculate(1_000_000, 9.99, 3));
    }
}