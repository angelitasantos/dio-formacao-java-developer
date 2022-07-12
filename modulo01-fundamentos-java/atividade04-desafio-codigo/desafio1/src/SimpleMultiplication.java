import java.util.Scanner;

public class SimpleMultiplication {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int number1, number2, result;

        System.out.println("Digite o primeiro número");
        number1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        number2 = scanner.nextInt();

        result = number1 * number2;

        System.out.println("O resultado da multiplicação é = " + result);

        scanner.close();

    }
}