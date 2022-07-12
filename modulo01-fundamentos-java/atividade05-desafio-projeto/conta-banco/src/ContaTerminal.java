import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();

        System.out.println("Digite o valor do depósito inicial!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome.concat("! Obrigado por criar uma conta em nosso banco. Sua agência é ")
        .concat(agencia).concat(" e a sua conta é ") + numero + ".");
        System.out.println("Seu saldo R$ " + saldo + " já está disponível para saque.");

    }
}
