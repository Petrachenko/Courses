import java.util.Scanner;

public class Program_2 {

    public static void main(String[] args) {
        final double usd1 = 3.265; //1
        final double eur1 = 3.54; //1
        final double rub1 = 3.37; //100
        final double zl1 = 7.7; //10
        final double gr1 = 6.000; //100
        double usd, eur, rub, zl, gr;
        double s = 0.0;
        boolean isCorrect;

        Scanner scanner = new Scanner(System.in);

        do {
            isCorrect = false;
            System.out.print("Введите сумму: ");
            if (scanner.hasNextDouble() == false) {
                isCorrect = true;
                scanner.next();
                System.out.print("Проверьте корректность введенных данных!");
            } else {
                s = scanner.nextDouble();
                if ((s < 0) || (s > Double.MAX_VALUE - 1)) {
                    System.out.print("Проверьте корректность введенных данных!");
                    isCorrect = true;
                }
            }
        }while (isCorrect);

        usd = s / usd1;
        eur = s / eur1;
        rub = s / rub1 * 100;
        zl = s / zl1 * 10;
        gr = s / gr1 * 100;

        System.out.format("USD: %.2f%n", usd);
        System.out.format("EUR: %.2f%n", eur);
        System.out.format("RUB: %.2f%n", rub);
        System.out.format("PLN: %.2f%n", zl);
        System.out.format("UAH: %.2f%n", gr);
    }
}
