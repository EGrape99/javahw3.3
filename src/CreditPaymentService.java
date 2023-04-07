public class CreditPaymentService {
    public int calculate(int credit, double rate, int periodYears) {
        double r = rate / 12 / 100; //ставка в месяц
        int n = periodYears * 12; //период кредитования в месяцах
        double a = 1 + r;
        double b = Math.pow(a, n);
        double result = credit * r * b / (b - 1);
        return (int) result;
    }
}
