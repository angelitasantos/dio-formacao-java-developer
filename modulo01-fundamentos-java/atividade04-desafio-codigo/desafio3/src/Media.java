import java.util.Locale;
import java.util.Scanner;

public class Media {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;

        // double number1, number2, result;

        System.out.println("Digite o primeiro número");
        double number1 = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        double number2 = scanner.nextDouble();

        double result = number1 + number2;

        System.out.println("O resultado da soma é = " + result);

        scanner.close();

    }
}
